package test;

import utils.ExcelUnitls;

public class Test14ExcelUtils {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        ExcelUnitls excel = new ExcelUnitls(projectPath + "/excel/data.xlsx", "Sheet1");
        excel.getRowCount();
        excel.getCellDataNumber(1, 1);
        excel.getCellDataString(0, 0);
    }
}
