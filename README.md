# Test Automation - UI

								=======================
								Framework Architecture:
								=======================

Project - Maven

Framework - Page Object Model using Page Factory in Selenium.

Language - Java

WebDriver - 3.141 version

Browsers - Chrome

OS - Windows/Linux/Mac

Test Executions - TestNG (or) maven test

Editor - Eclipse

=================
Folder Structure
=================

src/main/java - 1. Framework related codes (Method Of Execution [local/grid], Selection Of Browser, Browser Invoking, Closing/Quiting Browser Instances, etc.,)
				2. Individual pages are classified in to their corresponding packages and written inside java file
				

src/main/resources - 1. Contains application config properties
					 2. Driver folder containing different driver files based on OS
					 3. log4j.xml file

src/test/java - TestNG Test Class Files

src/test/resources - Contains TestNG.xml file in SuiteFiles

target/Log.log - Contains Test Execution log informations

Screenshots - Contains Test Execution passed/failed screenshots if executed as TestNG tests

pom.xml - Contains Project Dependencies, plugins, etc., 

===========
Executions:
=======
TestNG
=======
For running test:
 Right click on src/test/resources/suitexmlfiles/<Any .xml file> and Run As-> TestNG Suite
	(OR)
 Right click on pom.xml and Run As-> Maven test with property variable as -DsuiteXmlFile="{XML_FileName}.xml"

Reports - TestNG Reports   : {rootfolder}\target\surefire-reports\index.html,		
						     {rootfolder}\target\surefire-reports\emailable-report.html
	      ReportNG Reports : {rootfolder}\target\surefire-reports\html\index.html

Screenshots - {rootfolder}\target\surefire-reports\Screenshots\passed & {rootfolder}\target\surefire-reports\Screenshots\failed

Logger - {rootfolder}/target/Log.log