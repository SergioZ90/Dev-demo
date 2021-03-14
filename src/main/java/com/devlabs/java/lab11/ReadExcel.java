package com.devlabs.java.lab11;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCEll;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public void getTestData(String excelFileName) throws IOException{

		XSSFWorkbook book = new XSSWorkbook("./testdata/TC001"+excelFileName+".xlsx");
		// Open a particular sheet

		// Type-I => XSSFSheet sheet = book.getSheet("Sheet1");
		//Type-II
		XSSFSheet sheet = book.getSheetAt(0);
		//How many no of rows of data

		int rowCount= sheet.getLastRowNum();

		System.out.println("Row Count: "+rowCount);

		// How many no of cols of data
		short colCount= sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count: "+colCount);
		
		//Create a 2D array to store the data
		String[] [] testData = new String[rowCount][colCount];



		//iterating over the rows
		for (int i= 1; i <= rowCount; i++) {
		XSSFRow eachRow = sheet.getRow(i);
		for(int j=0; j<colCount; j++) {
		XSSFCell eachCell=eachRow.getCell(j);
		String data = eachCell.getStringCellValue();
        testData[i-1][j] = data;
		System.out.println(data);
		}
		}
		book.close
		return testData;
}
}
