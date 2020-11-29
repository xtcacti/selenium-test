Also check this - https://youtu.be/B4G2tMDYjRQ
Website - https://automationstepbystep.com/
Today we will learn Why to use excel files
How to add excel libraries
How to create excel read function
GetRowCount
GetCellData
How to call excel functions
helpful tips

Free Courses - https://automationstepbystep.com/

Why to use excel file

In Selenium we can get data from external files like excel and csv

MS Excel is most commonly used

Helps to make our scripts independent of data handling

Helps to add, update, manage data separately (outside the framework)

Helps to make our framework data driven

How to add excel libraries

Step 1
Add apache poi libraries
Download and add Jars 
from : https://poi.apache.org/download.html
OR
Add maven dependency
From : https://mvnrepository.com/artifact/or...


Step 2
Check if the libraries are added in your project

Get Row Count

Step 1
Create excel file and add some data

Step 2
Create references for Workbook

for new excel format (xlsx)
XSSFWorkbook workbook = new XSSFWorkbook(“excel file location”);

for old excel format (xls)
HSSFWorkbook workbook = new HSSFWorkbook(“excel file location”);

Step 3
Create references for Worksheet

XSSFSheet sheet = workbook.getSheet(“sheet name”); 


Step 4
Call row count function

sheet.getPhysicalNumberOfRows();


Get Cell Data

Step 1
Create references for Workbook

XSSFWorkbook workbook = new XSSFWorkbook(“excel file location”);


Step 2
Create references for Worksheet

XSSFSheet sheet = workbook.getSheet(“sheet name”); 


Step 3
Call function to get cell data

sheet.getRow(rownum).getCell(colnum).getStringCellValue();

sheet.getRow(rownum).getCell(colnum).getNumericCellValue();


How to call excel functions

Step 1
In all excel functions get rowNum, colNum as parameters

This is to avoid hard coding of values and get the values from calling function

Step 2
Create a constructor

A constructor is a special method without any return type and name same as the class name

Constructor is called every time a class object is created using the new() keyword

Step 3
Parametrize the constructor
To get excel path and sheet name

Step 4
Create a new class to call excel functions