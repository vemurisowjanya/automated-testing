<<<<<<< HEAD:README.md
This repository contains automated tests for various projects undertaken by Systers during Google Summer of Code.

Setting up to create selenium projects in java on Mac OS X

This is an example of creating a brand new selenium test in Java on Mac OS X, starting from nothing.

1. create a bash profile for yourself that exports the environment variable JAVA_HOME by using emacs or vi to edit the file /home/YOUR_USERNAME/.bash_profile
2. enter this line: export JAVA_HOME=$(/usr/libexec/java_home)
3. now run at the command line: source /home/YOUR_USERNAME/.bash_profile
4. download maven from https://maven.apache.org/ and follow the install directions. Essentially, you will unpack the maven archive to a folder and then add /path/to/apache-maven-N/bin to your PATH.
5. After you have downloaded apache maven and extracted it to a folder, again open the file /home/YOUR_USERNAME/.bash_profile
6. enter this line, modifying to match location on your computer: export PATH=/path/to/apache-maven-3.3.3/bin:$PATH
7. again run at the command line: source /home/YOUR_USERNAME/.bash_profile
8. now make sure maven is ready to use by running mvn --version
9.  go to the selenium Webdriver Java page: http://www.seleniumhq.org/docs/03_webdriver.jsp#setting-up-a-selenium-webdriver-project
10.  follow the directions on the webdriver page to create a test folder and a pom.xml as instructed
11.  follow diretions to run mvn clean install
12.  If you're using eclipse, now follow the directions to import the project into Eclipse: http://www.seleniumhq.org/docs/appendix_installing_java_driver_Sel20_via_maven.jsp#importing-maven-into-eclipse-reference  (or whatever IDE you'd like to use)
13.  Now within eclipse in your new workspace, click create a new source folder, and call it src
14.  within the source folder you made, create a new package and call it something like systers.tst
15.  now create a new class to hold your test
16.  You can find an example of how to populate the test class with java code here:  http://www.seleniumhq.org/docs/03_webdriver.jsp#introducing-the-selenium-webdriver-api-by-example
17.  add the imports shown in the java example, and then create a main & test code as shown within your class


Many of the projects that Systers works on already have test code set up within the repository.  To extend one of them, you will want to import from git into your selenium workspace.


Many of the projects also use JUnit.  Here's how you can add JUnit:

1. go to JUnit and download the latest jar:  https://github.com/junit-team/junit/wiki/Download-and-Install and follow download link.
2. save the jar someplace in your workspace
3. open eclipse, right click (or on a mac, control-click) on the project and choose Properties from the menu
4. Choose Java Build Path > Configure and then click the 'Add External Jars' button
5. click Apply, then ok
6. within your test file, add an import:  import org.junit.*;
See also: http://www.tutorialspoint.com/junit/junit_plug_with_eclipse.htm
And an example of using this with Selenium: http://www.toolsqa.com/java/junit-framework/junit-test-selenium-webdriver/
=======
###**Testing Automation: Mobile App Control Centre - Malaria**

This repository aims at building a data driven test framework for the malaria part of the Mobile App Control Centre (MACC).

###**Installation**


#####Download and install Java

* Go to [Oracle's download page](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* Click on JDK Download.
* Accept the License Agreement and select the version which is compatible with your operating system.
* Click on the installer.
 
#####Download and install eclipse

* Got to [Eclipse's download page](http://www.eclipse.org/downloads/)
* Click the version of eclipse that is compatible with your operating system.
* Select a mirror and click on download.
* Unzip the downloaded folder.
* Locate and click on the executable.
* Configure the workspace location.

#####Download and install git and Egit

* First, follow the instructions on [how to set up git](https://help.github.com/articles/set-up-git/).
* Take a look at [this link](http://wiki.eclipse.org/EGit/FAQ#What_versions_of_Eclipse_does_EGit_target.3F) to see EGit targets your version of eclipse.  

In eclipse: 
* Click on Help.
* Click on Install New Software...
* Enter http://download.eclipse.org/egit/updates/ into the Work with text box.
* Click on Select All.
* Click on Next.
* Accept the License Agreement and click on Finish.

#####Clone and import project into eclipse

* Clone the project.
   ```
   
  git clone https://github.com/daisyab/testing-automation.git
    
   ```  
In eclipse,
* Click on File, New, Java Project.
* Give the project a name and click on Finish.
* Click on File, then on Import.
* Expand the General folder, click on File System and click Next.
* In the From directory text box, browse to the location of the cloned project.
* In the Into folder, click on browse and select the newly created project.
* Click on Finish.

#####Download and Install Selenium Webdriver

* Go to [selenium's download page](http://www.seleniumhq.org/download/).
* Download the Java client driver by clicking the download link adjacent to the text Java.
* Unzip the contents of the downloaded folder.
* In eclipse, right click on the project name, hover over Build Path and click on Configure Build Path...
* Click on the Libraries tab and click on Add External JARs...
* Add all JARs located in the unzipped folder as well as in the libs subfolder.
* Click on OK.
	
#####Download and install TestNG in eclipse

In eclipse:
* Click on Help.
* Click on Install New Software...
* Enter http://beust.com/eclipse in the Work with text box and click on Add.
* Enter the name 'TestNG' in the Name text box of the Add Repository dialog box and click on OK.
* In the Available Software window, click on Select All then on Next.
* Click on Next.
* Accept the License Agreement and click on Finish.  
* Restart Eclipse.
* After eclipse restarts, right click on the project name, hover over Build Path and click on Add Libraries...
* Select TestNG and click Finish.
	
#####Add JUnit4 as a Library

In eclipse,
* Right click on the project name, hover over Build Path and click on Add Libraries...
* Select JUnit and click Next.
* Click on Finish.

#####Download and add Apache POI

* Go to [Apache POI's download page](http://poi.apache.org/download.html).
* In the Binary Distribution section of the page, select a distribution of Apache POI.
* Click on the mirror to download the JAR files.
* Once they are downloaded, unzip the folder.
* In eclipse, right click on the project name, hover over Build Path and click on Configure Build Path...
* Click on the Libraries tab and click on Add External JARs...
* Add all the jar files found in the unzipped folder, and the ooxml-lib  and lib subfolders as external JARs.
* Click on OK.

Follow the installation instructions from the [MACC Installation Guide](https://github.com/Nerdylicious/app-web-server/blob/master/docs/Installation%20Guide.md) to get a copy of the code on your local machine.

Run Main.java found in src/utilities to run all test cases.
>>>>>>> MACCTests:MACCTests/README.md
