# Testing Automation: Peace Corps Safety Web Application

This repository contains all the codes for the development of a Java based automation testing framework using Selenium WebDriver and TestNG for [PCSA Web](https://github.com/systers/PCSA-web).

## Tools and Language used

1. Language: Java
1. Selenium WebDriver
1. TestNG
1. IntelliJ IDEA
1. Maven
1. Log4j
1. JDK 8
1. Cloud Service: [BrowserStack](https://www.browserstack.com)

## Installation

### JDK

1. Go to [Oracle's site](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
1. Select the appropriate JDK and download.
1. Accept License and install.

### IntelliJ IDEA

(Note: There is an option to download IntelliJ which comes with JDK)

1. Go to [Jetbrains' Website](https://www.jetbrains.com/idea/download).
1. Choose your version and download the appropriate .tar file.
1. Unpack the IntelliJ IDEA distribution archive that you downloaded to where you wish to install the program. We will refer to this destination location as your {installation home} below.
1. Open a console and cd into "{installation home}/bin" and type: `./idea.sh` to start the application. (It is recommended that you lock the icon in your launcher. It'll be eiser to launch it from there next time. )

## Setup for Developers

1. Get PCSA Web running on localhost. The setup  details are [here](https://github.com/systers/PCSA-web/blob/master/README.md).
1. Clone the project `git clone https://github.com/systers/automated-testing.git`.
1. Open IntelliJ IDEA,
     * Click on Import new Project.
     * Navigate to automated-testing/PCSAWebTests/PCSAWebFramework. Click OK.
     * With 'Import project from external model' checked, select maven. Click Next.
     * It will ask you for some configurations. Everything is default here. Click Next.
     * Check your project name and click next.
     * Click Next one more time and Confirm the project name and path. (Recommended to use the default one). Click Finish.
     * Now the Framework is loaded. Now we'll load the Tests folder.
     * In the IDE click 'Maven Project' located in the right side of the interface. And click the little plus (+) button to see a window popup.
     ![Add the Tests Maven project](https://i.cubeupload.com/Bc6jEv.png)
     * Feed it the `pom.xml` file located in 'PCSAWebTests' folder.
     * Click OK.
     * Now the project is loaded in IntelliJ IDEA.

## Steps for running tests

1. Next to run any particular test, in left panel of the IDE go to any .java file under PCSAWebTests/src, right-click its name and click run.
1. You can also do the same by right-cliking the name `test` which is usually followed by a @Test annotation in code itself. You'll see the same `Run` option there also.
