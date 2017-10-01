# Testing Automation: Ushahidi App

The objective of this project is to create, maintain and execute automated tests for Ushahidi Web application deployed on http://pc-crowdmap-dev.systers.org. It aims to create reusable and automated scripts for regression testing.

## Tools and Technologies

* Language : Java: Install latest JDK and JRE version of Java
* IDE: Eclipse: Install Eclipse Lunar/Kepler. Follow this
* Build Automation Tool: Maven: Follow this
* Framework: Selenium (Junit Test Framework)
* Web Browser: Chrome, Firefox, IE
* Version Control: Git

## Building Ushahidi App from Source Steps:

* Install WAMP
    * Blocking: msvcr100.dll is missing wamp error while installing
    * Overcome By: Installing [vcredist_x64.exe](https://www.microsoft.com/en-us/download/confirmation.aspx?id=30679)
* Follow https://github.com/systers/crowdmap
* Go to `localhost/<Ushahidi-project>`under `c:/wamp/www/<Ushahidi-project>`. It will prompt for installation - either basic or advanced
    * I chose basic as it was simple and quick. Keep the Database name, username, password etc in hand, and complete the 4-step installation process.

## Complete Documentation at

See the complete documentation with test file samples and list of all tests in our Google Docs file [here](https://docs.google.com/document/d/1MA3mHGmHmlKmTpfv-cmuxpcTvKhrATHiaX9wpngR-bU/edit?usp=sharing).