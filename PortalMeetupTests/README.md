Testing Framework for Systers Portal
====================================

* This repository contains tests for Systers Portal.
* It includes testing of some of the new features implemented over the year.
* The framework can be easily extended to include more new features.

Project Setup in Ubuntu 14.04 LTS
---------------------------------
1. Get the Systers Portal running on localhost. Portal installation details are [here](https://github.com/systers/portal/blob/develop/README.md). 
1. Download JUnit jars from [here](https://github.com/junit-team/junit/wiki/Download-and-Install).
1. Get the latest Selenium jars from [here](http://docs.seleniumhq.org/download/).
1. Download Eclipse from [here](https://eclipse.org/downloads/).
1. To make Maven available with Eclipse IDE, install M2Eclipse plugin from Eclipse Marketplace or download from [here](http://download.eclipse.org/technology/m2e/releases).

Steps for running tests
-----------------------
1. To run the tests open Eclipse.
     * Import both the projects, PortalFramework and PortalTests as Maven Project in the workspace.
     * Add Selenium jars to the Build Path of PortalFramework and JUnit jars to the Build Path of PortalTests. Also, add PortalFramework to 
       the Build Path of PortalTests.
     * Start Systers Portal on the localhost.
     * Right click on any test case and select Run as JUnit test.
1. To run tests through Maven.
     * Right click on the `pom.xml` file of PortalFramework and run as `Maven install`.
     * Right click on the `pom.xml` file of PortalTests and run as `Maven test`.
1. To generate test reports using surefire-repots available in maven.
     * Open the terminal and navigate inside PortalTests to the `pom.xml` file.
     * Run `mvn compile` and `mvn site` after that.
     * A test report will be generated inside the site folder which is inside the target directory.

