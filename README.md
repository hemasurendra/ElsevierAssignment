# Automation of Mendeley.com test assignment for Elsevier

This Project is an Automation of web application using Serenity BDD as Automation framework. Maven has been used for dependency management.

**Table of Contents**
* [Functionality](#functionality)
* [Behavior Driven Development](#behavior-driven-development)
* [Testing Framework](#testing-framework)
* [How to Run the tests](#how-to-run-the-tests)
    * [Using Maven](#1-using-maven)
    * [Using IDE](#2-using-ide)
    * [Test Result](#3-test-result)



# Functionality
In this repository I have indentified multiple scenarios for creating account on Mendeley, Also I have I automated one single scenario  automated as per the instructions 

# Behavior Driven Development

The test cases here in the automation framework are added in BDD format.
The reason for choosing to write tests  in BDD format are:

		1) Currently many teams are using BDD in SDLC as Acceptance criteria are very well available for both Development and testing
		2) Using BDD Acceptance test Will help the business understand the test cases very easily

# Testing Framework

I have used BDD Test Automation framework Using SerenityBDD. This serenity BDD is a library which uses Cucumber and selenium for its development.
Reasons for choosing this framework:

		1) Easily maintainable automated acceptance criteria
		2) Living documentation of test results
		3) Opensource tool with huge support Online

# How to Run the tests

	# Pre-requisite:
	* JDK 8
	* Maven is installed in the machine and configured properly


## 1) Using Maven

	Open a command window and run:

		WindowsOS:	mvn clean verify

		MacOs : mvn clean verify -Dwebdriver.chrome.driver=DriverPathAsInput

	To Run Specific Tags of a test (Specific group of tests):

	  	mvn clean verify -Dcucumber.options="--tags @TAGNAME"

## 2) Using IDE
	Open the cloned project in IDE. Enable Auto-Import for Maven-dependency
	Run Testrunner files in the path (\src\test\java\runner\TestAutomationIT.java)


## 3) Test Result
Serenity BDD has one of the best reporting and the test reports are generated every time we execute the tests.
When the project is cloned into Local, test results reporting, along with screenshots, can be seen if we open **_`index.html`_** from `(target\site\serenity\index.html)`.

# Note: Test run can happen in Back ground if you uncomment **_"chrome.switches=--headless"_** in **_'serenity.properties'_** 

Kindly let me know if you need any further Information. You can contact me on my emailID.
