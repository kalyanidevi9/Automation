package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel_Read_Single_TestData {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
    //identify the file(Excel File)in the system
		
		FileInputStream excelTestDataFile = new FileInputStream("C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\src\\com\\ExcelOperation\\Book2.xlsx");

	//Identify the work Book in the file
		XSSFWorkbook workBook=new XSSFWorkbook(excelTestDataFile);
		
		//Identify the particular sheet in the workBook
		XSSFSheet testDatasheet=workBook.getSheet("sheet1");
		
		//Identify the Row in the sheet
		Row sheetRow=testDatasheet.getRow(4);
		
		//Identify the Row of the cell in the Row
		Cell sheetRowofcell=sheetRow.getCell(2);
		
		//get the data from the Row of a cell
		String testData=sheetRowofcell.getStringCellValue();
		
		
		System.out.println(testData);
		
	}

}
