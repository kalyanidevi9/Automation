package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream testDataFile=new FileInputStream("C:\\Users\\Hp\\Desktop\\Kalayani\\Automaion\\src\\com\\ExcelOperation\\Book2.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet=workBook.getSheet("Sheet3");
		
		//Identifying the number of Active Row in the Sheet
		int rowsCount=testDataSheet.getLastRowNum();
		
		//to goto every Active Row of the Sheet
		for(int i=0;i<5;i++) {
			
		}
				
 
	}

}
