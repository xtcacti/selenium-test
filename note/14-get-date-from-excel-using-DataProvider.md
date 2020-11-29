more about Raghav - https://automationstepbystep.com/
Today we will learn How to get data from Excel using DataProvider of TestNG
REFERENCES 
How to use excel for getting data
https://www.youtube.com/watch?v=CV3SO...

Today we will learn
1. How to get test data from excel
2. How to create excel data provider function
3. How to use testNG @DataProvider
4. How to refer test data from DataProvider
5. Run a sample data driven Selenium Test

helpful tips

Prerequisite

Add excel reading libraries (Apache POI)
Create functions to read data from excel
Watch the video - https://www.youtube.com/watch?v=CV3SO...

How to get test data from excel

Step 1 -Create a function to get Row Count

Step 2 - Create a function to get Column Count

Step 3 - Create a function to get String cell data

Step 4 - Create a function to get Numerical cell data

How to create Excel Data Provider function

Step 1 - Create a new class ExcelDataProvider


Step 2 - Create a function and create object for ExcelUtils

ExcelUtils excel = new ExcelUtils(“excelpath”, “sheetname”);

Step 3 - Get row and column count

int rowCount = excel.getRowCount();
int colCount = excel.getColCount();

Step 4 - Run a loop to get all data in an Object Array


How to use testNG @DataProvider

Step 1
Create a function and provide testNG annotation

@DataProvider(name = “testData”)

Step 2
Call the excel data provider function with excel and sheet name

Step 3
Return the data object

How to get test data from excel

Step 1 Create a function and provide testNG annotation

@Test(dataProvider = “testData”)

Step 2 In the function arguments, get input parameters equal to the parameters in the excel file

Step 3 Use the values in your test