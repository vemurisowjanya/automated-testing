Automation Testing: Peace Corps Safety Web Application
======================================================

This repository contains all the codes for the development of a Java based automation testing framework using Selenium WebDriver and TestNG for [PCSA Web](https://github.com/systers/PCSA-web).

Tools and Language used
------------------------
1. Language: Java
1. Selenium WebDriver
1. TestNG
1. Eclipse IDE
1. Maven
1. Log4j
1. Windows
1. JDK 8
1. Cloud Service: [BrowserStack](https://www.browserstack.com)

Installations
--------------
#####JDK
1. Go to [Oracle's site](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
1. Select the appropriate JDK and download.
1. Accept License and install.

#####Eclipse
1. Go to [Eclipse's Download site](https://www.eclipse.org/downloads/).
1. Download the Eclipse IDE for EE Developers (preferably) as it comes with Maven, Git and TestNG plugin already installed or download the Eclipse IDE for Java Developers.
1. Select a mirror and install.

#####Egit Plugin for Eclipse
1. Open Eclipse
1. Click on Help->Install New Software...->
1. Click on Add.
1. Enter http://download.eclipse.org/egit/updates/ in the Location and Git in the Name.
1. Click on Select All.
1. Click on Next.
1. Accept the License Agreement and click on Finish.
1. Restart Eclipse.

#####Maven Plugin for Eclipse
1. Open Eclipse
1. Click on Help->Install New Software...->
1. Click on Add.
1. Enter http://download.eclipse.org/technology/m2e/releases in the Location and Maven in the Name.
1. Click on Select All.
1. Click on Next.
1. Accept the License Agreement and click on Finish.
1. Restart Eclipse.

Setup for Developers
--------------------
1. Get PCSA Web running on localhost. The setup  details are [here](https://github.com/systers/PCSA-web/blob/master/README.md).
1. Clone the project `git clone https://github.com/systers/automated-testing.git`.
1. Open Eclipse,
     * Click on File->Import.
     * Git->Projects from Git
     * Click Next->Existing local repository.
     * Select automated-testing
     * Choose PCSAWebTests and select Import as a General Project.
     * Click on Next.
     * Click on Finish.

Steps for running tests
-----------------------
1. To run the tests open Eclipse.
     * Add PCSAWFramework to the Build Path of PCSAWebTests.
     * Right click on `pom.xml` of PCSAWFramework and run as `Maven clean` then `Maven install`. This will download all the dependencies for the framework.
     * Right click on `pom.xml` of PCSAWebTests and run as `Maven clean` then `Maven Build` and give the Goals as `compile`. This will compile all the source code and install the dependencies for the tests.
     * If you get 'BUILD FAILURE', clean and build the Projects and perform the above two steps again.
     * Start PCSA Web on the localhost.
     * Right click on any test case and select Run as TestNG test.
1. To run tests through Maven.
     * Repeat steps 2 and 3 from above.
     * Right click on the `pom.xml` file of PCSAWebTests and run as `Maven test`.
1. To generate test reports using surefire-repots available in Maven.
     * Repeat steps 2 and 3 of point 1 from above.
     * Right click on the `pom.xml` of PCSAWebTests and then run as `Maven build`and give the Goals as `site`.
     * A test report will be generated inside the site folder which is inside the target directory.

Steps for running tests on BrowserStack
---------------------------------------
1. Sign up with BrowserStack.
     * After signing up, a unique username and Access Key will be generated for your account.
     * Edit and update the fields, `USERNAME` and `AUTOMATE_KEY` cloudServiceConstants.java file under in PCSAWFramework->src->PageObjectModel. Save the file after updating.
1. Update driver.java file under PCSAWFramework->src->WebDriver
     * Comment out the lines of code that goes by the comment "Local Testing Setup".
     * Uncomment the lines of code that goes by the comment "CLOUD SERVICE SETUP".
1. To enable [Local Testing](https://www.browserstack.com/local-testing) feature by BrowserStack.
     * Download the BrowserStack local binary from [here](https://www.browserstack.com/local-testing#command-line).
     * Start the binary from the command line using this command: `./BrowserStackLocal <access_key>`.
1. Right click on any test script and choose `Run as TestNG Test`. Check the status on your BrowserStack dashboard.
1. To run all the tests at one, right click on testng.xml file under PCSAWebTests and choose `Run as TestNG Suite`.
1. Please refer to sample TestNG scripts [here](https://www.browserstack.com/automate/java#testng) for better understanding.

Project documentation
---------------------
TBA
