package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUnitls {
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;

    public ExcelUnitls(String excelPath, String sheetName) {
        try {
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public int getRowCount() {
        int rowCount = sheet.getPhysicalNumberOfRows();
        return rowCount;
    }

    public int getColCount() {
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        return colCount;
    }

    public String getCellDataString(int rowNum, int colNum) {
        String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        return cellData;
    }

    public Double getCellDataNumber(int rowNum, int colNum) {
        Double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
        return cellData;
    }
}
