package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Readexcelfile {



				public static XSSFWorkbook workbook;
				public static  XSSFSheet excelsheet;
				public static  XSSFRow row;
				public static  XSSFCell cell;
				public static File excelFile = new File("C:\\automationdata.xlsx");
				public static FileInputStream inputstream;
				
				public static String getCellValue(String filename,String sheetName,int rowNo,int cellNo)
				{
				try {
					inputstream = new FileInputStream(filename);
					workbook=new XSSFWorkbook(inputstream);
					excelsheet= workbook.getSheet(sheetName);
					cell=workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
					
					workbook.close();
					return cell.getStringCellValue();
					
				}
				catch (Exception e) {

					return "";
				}
				}
				
				public static int getRowCount(String filename,String sheetName)
				{
				try {
					inputstream = new FileInputStream(filename);
					workbook=new XSSFWorkbook(inputstream);
					excelsheet= workbook.getSheet(sheetName);


				int ttlRows = excelsheet.getLastRowNum() + 1;

				

				workbook.close();
				return ttlRows;
				
				}
				catch (Exception e) {

					return 0;
				}
				}
				public static int getColCount(String filename,String sheetName)
				{
				try {
					FileInputStream inputStream = new FileInputStream(filename);
					workbook=new XSSFWorkbook(inputstream);
					excelsheet= workbook.getSheet(sheetName);

				int ttlcells = excelsheet.getRow(0).getLastCellNum();

				workbook.close();
				return ttlcells;
				
				}
				catch (Exception e) {

					return 0;
				}
				}

			}


	
