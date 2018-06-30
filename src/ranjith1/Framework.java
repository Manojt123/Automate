package ranjith1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;


public class Framework {
File f= new File("C:\\Users\\ranjithtesty\\Desktop\\ranjith.xlsx");	


	
	

/*	static   WebDriver driver;
	   public static void main(String args[]) throws EncryptedDocumentException, InvalidFormatException, IOException{
		   FileInputStream file = new FileInputStream("C:\\Users\\ranjithtesty\\Desktop\\ranjith.xlsx"); 
           HSSFWorkbook workbook = new HSSFWorkbook(file);
           HSSFSheet sheet = workbook.getSheetAt(0);
           int noOfColumns = sheet.getRow(0).getLastCellNum();
           //System.out.println(noOfColumns);
           String[] Headers = new String[noOfColumns];
           for (int j=0;j<noOfColumns;j++){
               Headers[j] = sheet.getRow(0).getCell(j).getStringCellValue();
           }
               for (int a=0;a<noOfColumns;a++){
                   if(Headers[a].equals("Address")){
                       driver.findElement(By.id("lst-ib")).sendKeys(sheet.getRow(1).getCell(a).getStringCellValue());
                       break;
                       }
	   }
	workbook.close();
	file.close();
	driver.close();
	System.exit(0);
	   }
*/}

