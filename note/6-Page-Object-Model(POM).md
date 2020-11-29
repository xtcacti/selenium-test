Today we will learn - What is Page Object Model 
1. What is POM - Page Object Model
2. How to implement POM

What is POM

Design Principle

Create separate Object Repository to store object locators

For each web page there should be a separate page class

The page class will have all object locators and preferably action methods for the corresponding page


Step 1 : Create a class for each web page

Step 2 : Add object locators

Step 3 : Create class for test

Step 4 : Refer objects from page classes

Step 5 :Run and validate

Benefits of POM

Test Objects and Functions are separated for easy maintenance and keeping the code clean

Objects are kept separated from test scripts and can be used multiple times in multiple tests

Every unique object locator is created only once

Easy Maintenance and Less Rework