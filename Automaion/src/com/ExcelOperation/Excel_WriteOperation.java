package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	FileInputStream testDataFile=new FileInputStream("C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\src\\com\\ExcelOperation\\Book2.xlsx");
	
	XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
	
	XSSFSheet testDataSheet=workBook.getSheet("sheet2");
	
	//Creating aRow in the Sheet 
	Row testDataSheetRow=testDataSheet.createRow(8);
	
	//Create a Row of a Cell
	Cell rowofCell=testDataSheetRow.createCell(2);
	
	//Setting a value into the new Row of a Cell created
	rowofCell.setCellValue("Admin");
	
	
	Row row=testDataSheet.createRow(8);
	Cell cell=testDataSheetRow.createCell(3);
	cell.setCellValue("Livetech");
	
	
	FileOutputStream testResultFile=new FileOutputStream("C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\src\\com\\ExcelOperation\\Book2.xlsx");
	workBook.write(testResultFile);
	
	
	
	
		
		

	}

}
