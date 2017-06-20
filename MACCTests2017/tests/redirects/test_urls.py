"""
Basic tests to check whether the commonly used
urls return the 200 return code or not

To use::

	$ make test-test_urls

To specify the server to run against

	$ SERVER_URL=http://example.com make test-test_urls
"""

import os
import sys
import requests

BASEURL = os.environ.get('SERVER_URL', 'http://web:8000')

def main():
	# Does the dashboard page work?
	resp = requests.get(BASEURL)
	assert resp.status_code == 200

	# Does the admin page work?
	resp = requests.get(BASEURL + '/admin/')
	assert resp.status_code == 200

	# Does the signup page work?
	resp = requests.get(BASEURL + '/signup_do/')
	assert resp.status_code == 200

	# Does the login page show up?
	resp = requests.get(BASEURL + '/login_do/')
	assert resp.status_code == 200

	return 0

if __name__ == '__main__':
	sys.exit(main())
