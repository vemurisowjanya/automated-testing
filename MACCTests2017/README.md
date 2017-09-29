# Testing Automation: Mobile App Control Center - 2017

## Description

This repository contains the unit and functional tests written for the backend and frontend of the repository [MACC](https://github.com/systers/macc.git). The work is done for GSoC 2017 and has the changes made along with the updates in the repository.

## Libraries used

For unit testing of the Django app, we have mostly made use of `pytest`, `pytest-django` and the `unittest` frameworks.

For functional testing of the app, the `Selenium` framework is used along with the help of pytest.

To run the tests using the repository, please refer to the [requirements](https://github.com/systers/automated-testing.git/MACCTests2017/requirements.txt) file, and copy the contents from there to the main [requirements.txt](https://github.com/systers/macc.git/requirements.txt) folder, or download them separately using `pip -m install library_name`.

## Running the tests

The tests will be run by using the basic commands. For running the `unittest` related tests which are saved in the MACC repository right now, run

```python
python2 manage.py tests
```

For running the `pytest` using tests saved in the [automted-testing/MACCTests2017](https://github.com/systers/automated-testing.git/MACCTests2017) repository,

1. Copy the entire folder into the development server, where the `manage.py` script is kept in the MACC repository.
1. Change to that folder and just type `pytest` to run all the tests.
1. The tests are further categorised into various types, if you want to run the specific test, run `pytest -v test_name.py`

### Integration of the tests with the MACC repository

This is a work in progress, and the integration will be done via Jenkins.
