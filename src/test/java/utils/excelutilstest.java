package utils;

public class excelutilstest {
	
	public static void main(String[] args) {
		
		String excelPath = "./data/New Microsoft Excel Worksheet.xlsx";		
		String sheetName = "Sheet1";
		
		excelutils excel = new excelutils(excelPath,sheetName);
		
		excel.getRowCount();
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
		excel.getCellData(1,3);
		excel.getCellData(2,0);
		excel.getCellData(2,1);
		excel.getCellData(2,2);
		excel.getCellData(2,3);
		excel.getCellData(3,0);
		excel.getCellData(3,1);
		excel.getCellData(3,2);
		excel.getCellData(3,3);
				
	}

}
