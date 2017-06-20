import PostgreSQL
import pytest


from _postgresql_exceptions import OperationalError
from django.conf import settings
from django.core.cache import cache
from django.core.management import call_command

def test_postgres_client_enforced():
	db_config = settings.DATABASE['default']
	with pytest.raises(OperationalError) as e:
		PostgreSQLdb.connect(
			host=db_config['HOST'],
			user=db_config['USER'],
			password=db_config.get('PASSWORD') or '',
			)
	assert "SSL connection error" in str(e.value)


@pytest.mark.django_db
def test_no_missing_database_migrations():
	"""
	Check no model changes have been made since the last
	./manage.py makemigrations
	"""
	call_command('makemigrations', interactive=False,
		dry_run=True, check_changes=True)

def test_cached_setup():
	#Test cache is properly setup
	k, v = 'my_key', 'my_value'
	cache.set(k,v)
	assert cache.get(k) == v

@pytest.mark.django_db(transaction=True)
def test_load_initial_data():
	# Test load_initial_data works properly
	call_command('load_initial_data')
