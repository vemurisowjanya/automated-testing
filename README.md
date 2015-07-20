Testing Automation: Mobile App Control Centre - Malaria

This repository aims at building a data driven test framework for the malaria part of the Mobile App Control Centre (MACC).

Installation

Have Linux installed

Have Java installed
	Go to http://www.oracle.com/technetwork/java/javase/downloads/index.html
	Click on JDK Download.
	Accept the License Agreement and select the version which is compatible with your operating system.
	Click on the installer.
	
Have eclipse installed
	Got to http://www.eclipse.org/downloads/
	Click the version of eclipse that is compatible with your operating system.
	Select a mirror and click on download.
	Unzip the downloaded file, locate executable and configure the workspace location.

Have git installed and configured with eclipse
	First follow the instructions here: https://help.github.com/articles/set-up-git/
	Take a look at this link: http://wiki.eclipse.org/EGit/FAQ#What_versions_of_Eclipse_does_EGit_target.3F to see EGit targets your version of eclipse.
	On eclipse:
	Click on Help
	Click on Install New Software...
	Enter http://download.eclipse.org/egit/updates/ into the Work with text box
	Click on Select All.
	Click on Next
	Accept the License Agreement and Finish.

Download and Install Selenium Webdriver
	Go to http://www.seleniumhq.org/download/
	Download the Java client driver by clicking the download link adjacent to the text Java.
	Unzip the contents of the downloaded folder.
	In eclipse, right click on the project name, hover over Build Path and click on Configure Build Path...
	Click on the Libraries tab and click on Add External JARs...
	Add all JARs located in the unzipped folder as well as in the libs subfolder.
	Click on OK.
	
Have TestNG installed on eclipse
	On eclipse:
	1. Click on Help
	2. Click on Install New Software...
	3. Enter http://beust.com/eclipse in the Work with text box and click on Add
	4. Enter the name 'TestNG' in the Name text box of the Add Repository dialog box and click on OK.
	5. In the Available Software window, click on Select All then on Next.
	6. Click on Next.
	7. Accept the License Agreement and click on Finish.
	If security warnings come up about the validity of the software, click on OK.
	8. Restart Eclipse.	
	
Have JUnit4 installed.
	After cloning the project and importing it into eclipse
	Right click on the project name, hover over Build Path and click on Add Libraries...
	Select JUnit and click Next.
	Click on Finish.

Download Apache Poi
	Go to http://poi.apache.org/download.html
	In the Binary Distribution section of the page, select a distribution of Apache POI.
	Click on the mirror to download the JAR files.
	Once they are downloaded, unzip the folder.
	In eclipse, right click on the project name, hover over Build Path and click on Configure Build Path...
	Click on the Libraries tab and click on Add External JARs...
	Add all the jar files found in the unzipped folder, the ooxml-lib subfolder and the lib subfolder as external JARs.
	Click on OK.

Clone the MACC repository from https://github.com/Nerdylicious/app-web-server
git clone https://github.com/Nerdylicious/app-web-server.git