Testing Automation: Mobile App Control Centre - Malaria

This repository aims at building a data driven test framework for the malaria part of the Mobile App Control Centre (MACC).

Installation
Have git installed and syncd with eclipse
Have eclipse installed
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

Download Selenium

Download Apache Poi
Go to http://poi.apache.org/download.html
In the Binary Distribution section of the page, select a distribution of Apache POI.
Click on the mirror to download the JAR files.
Once they are downloaded, unzip the folder.
In eclipse, right click on the project name, hover over Build Path and click on Configure Build Path...
Click on the Libraries tab and click on Add External JARs...
Add all the jar files found in the unzipped poi-3.1x folder, ooxml-lib folder and the lib folder as external JARs.

Clone the MACC repository from https://github.com/Nerdylicious/app-web-server
git clone https://github.com/Nerdylicious/app-web-server.git