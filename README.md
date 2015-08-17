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
