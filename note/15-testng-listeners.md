Today we will learn
1 What are TestNG listeners
2 Types of listeners
3 How to use TestNG listeners
   at class level
  at suite level (multiple classes)
4 Selenium test example

helpful tips


What are TestNG Listeners

Listeners are components in TestNG that listens ( keep a track ) of test execution and helps to perform actions at multiple stages of  test execution

Example
OnStart
OnFinish
OnSuccess
OnFailure
Etc…

Listeners are interfaces in TestNG library

How to use TestNG listeners

Step 1 Create a new package and new Class

Step 2 Implement ITestListener interface

public class TestNGListener implements ITestListener

Step 3 Add unimplemented methods of ITestListener interface

Step 4 Create a Demo class and provide annotation
@Listeners(packageName.ClassName)

Step 5 Run and validate

How to use at Suite Level (multiple classes)

Step 1 Create testng.xml file

Step 2 Define listeners in testng.xml file

Step 3 Run and validate

Adding more listeners from TestNG

You can implement more listener interfaces in your existing class and add implemented methods

REFERENCES 

http://testng.org/doc/documentation-m...

http://testng.org/doc/documentation-m...

https://jitpack.io/com/github/cbeust/...


#SeleniumJavaFramework #SeleniumTutorials #TestNGListeners #SeleniumForBeginners