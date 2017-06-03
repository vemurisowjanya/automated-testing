import pytest
from infohub.app import TestApp

from macc.config import wsgi

@pytest.fixture
def webapp():
	"""
	simple test to check that this object
	is used to test calls to a wsgi application
	"""
	return TestApp(wsgi.application)