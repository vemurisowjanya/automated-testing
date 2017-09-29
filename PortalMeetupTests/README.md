# Testing Automation: Portal Meetup

This repository contains all the codes for the development of a Java based automation testing framework using Selenium. The framework can be extended to add more features as the web application develops and more tests can be added for the same. Maven has been used as the build tool.

## Tools and Languages

1. Java
1. Selenium 
1. Eclipse IDE
1. Maven
1. Ubuntu 14.04 LTS

## Project Setup in Ubuntu 14.04 LTS

1. Get the Systers Portal running on localhost. Portal installation details are [here](https://github.com/systers/portal/blob/develop/README.md). 
1. Download JUnit jars from [here](https://github.com/junit-team/junit/wiki/Download-and-Install).
1. Get the latest Selenium jars from [here](http://docs.seleniumhq.org/download/).
1. Download Eclipse from [here](https://eclipse.org/downloads/).
1. To make Maven available with Eclipse IDE, install M2Eclipse plugin from Eclipse Marketplace or download from [here](http://download.eclipse.org/technology/m2e/releases).

## Steps for running tests

1. To run the tests open Eclipse.
     * Import both the projects, MeetupFramework and MeetupTests inside the Meetup folder as Maven Project in the workspace.
     * Add Selenium jars to the Build Path of MeetupFramework and JUnit jars to the Build Path of MeetupTests. Also, add MeetupFramework to 
       the Build Path of MeetupTests.
     * Start Systers Portal on the localhost.
     * Right click on any test case and select Run as JUnit test.
1. To run tests through Maven.
     * Right click on the `pom.xml` file of MeetupFramework and run as `Maven install`.
     * Right click on the `pom.xml` file of PortalTests and run as `Maven test`.
1. To generate test reports using surefire-repots available in Maven.
     * Open the terminal and navigate inside MeetupTests to the `pom.xml` file.
     * Run `mvn compile`.
     * Then run `mvn site`.
     * A test report will be generated inside the site folder which is inside the target directory.


## Project documentation

Complete Project documentation is [here] (http://www.documentationgsoc15.blogspot.com/). 
