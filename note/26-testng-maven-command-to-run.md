Today we will learn

1 How to run testng tests from maven cmd
2 How to provide testng xml at runtime
3 How to include or exclude specific tests

helpful tips

Prerequisite | Java

Java is installed on your system
Eclipse is available
Maven Java project is created in Eclipse

Video links see below

Prerequisite | TestNG

TestNG plugin is added in eclipse
TestNG dependency is added in pom.xml
TestNG tests are created
testng.xml file is created

Video links see below

Prerequisite | Maven

Maven should be available on your system

1 Download maven
2 Add maven to environment variables

Command : mvn -version

How to add maven on Windows | Mac OS
Video links see below

How to run testng from maven command line

Step 1
Add maven surefire plugin in pom.xml
https://maven.apache.org/surefire/mav...

Step 2
Provide location of your testng.xml file
(you can provide complete path if facing any issues)

Step 3
Open cmd and goto location of project

Step 4
Run command | mvn clean test


How to provide testng.xml file name at runtime

Step 1
In pom.xml in place of testng.xml file name give a reference
${fileName}

Step 2
In command add parameter
-DfileName=testng1.xml


How to include or exclude specific tests

Follow
https://maven.apache.org/surefire/mav...