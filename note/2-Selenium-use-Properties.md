learn from Raghav - https://automationstepbystep.com/

Today we will learn:
-------------------------------------------------------
1. What is a properties file
2. How to create a properties file
3. How to get data from properties file
4. How to set data to properties file
5. Run test using Properties file

helpful tips
_______________________________________________

How to get data from properties file
----------------------------------------------------------
STEP 1: Create a object of class Properties class
Properties prop = new Properties();

STEP 2 : Create a object of class InputStream
InputStream input = new FileInputStream("location of properties file");

STEP 2 : Load Properties file
prop.load(input);

STEP 4 : Get values from Properties file
prop.getProperty("browser");

---------------------------------------------------------------

How to set data to properties file
----------------------------------------------------

STEP 1 : Create a object of class Properties class
Properties prop = new Properties();

STEP 2 : Create a object of class OutputStream
OutputStream output = new FileOutputStream("location of properties file");

STEP 3 : Set values
prop.setProperty("result", "pass");

STEP 4 : Store values in properties file
prop.store(output, "comments");