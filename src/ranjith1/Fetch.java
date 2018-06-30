package ranjith1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Fetch {
	static File f;
	 static  FileInputStream  fi;
	  static Workbook  wb;
	     static Sheet sh;
	     static Row rw;
	     static Cell C1;

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		WebDriver driver  = new FirefoxDriver();
		f=new File("C:\\Users\\ranjithtesty\\Desktop\\rrr.xlsx");
		fi=new FileInputStream(f);
		wb=WorkbookFactory.create(fi);   
		sh=wb.getSheet("Sheet1");
		rw=sh.getRow(0);
		C1=rw.getCell(0);
		driver.manage().window().maximize();
	       driver.get("http://ranjith/login.do");
	       driver.findElement(By.xpath("//input[contains(@value,'Login now')]")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			driver.findElement(By.xpath("//input[contains(@value,'Login now')]")).click();
			Thread.sleep(1000);
			WebElement w=driver.findElement(By.xpath("//a[text()='Projects & Customers']"));
			w.click();
			Thread.sleep(2000);
			for(int i=0;i<=5;i++){
			driver.findElement(By.xpath("//input[contains(@value,'Add New Customer')]")).click();
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys(wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue()); 
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue());
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();

		
	    

	}}

}
