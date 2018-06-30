package ranjith1;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;





public class Actitme {
	public static void main(String[] args) throws InterruptedException {
		   String sad="Pavan";
		   System.out.println("Hi im going to run Actitime application");
	       WebDriver driver  = new FirefoxDriver();
	       driver.manage().window().maximize();
	       driver.get("http://ranjith/login.do");
	       driver.findElement(By.xpath("//input[contains(@value,'Login now')]")).click();
	       Thread.sleep(1000);
	       String exp="Username or Password is invalid. Please try again.";
	      // String act=driver.findElement(By.xpath("//span[@class='errormsg']"));
	       Thread.sleep(1000);
	       String act=driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
	       System.out.println(exp);
	       System.out.println(act);
	       if(exp.equals(act.trim()))
	       {
	    	   System.out.println(true);
	       }
	       else{
	    	   System.out.println(false);
	       }
	       System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[contains(@value,'Login now')]")).click();
		Thread.sleep(1000);
		
		WebElement wb=driver.findElement(By.xpath("//td[contains(text(),'Open Tasks')]"));
		System.out.println(wb.getText());
		Actions act1=new Actions(driver);
		//System.out.println(driver.getWindowHandle());
	    WebElement w=driver.findElement(By.xpath("//a[text()='Projects & Customers']"));
	   // w.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		act1.moveToElement(w).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		//act1.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		act1.contextClick(w).sendKeys("T").build().perform();
		Thread.sleep(1000);
		
		//act1.sendKeys(Keys.ENTER).build().perform();

		System.out.println(driver.getTitle());
	   Thread.sleep(1000);
	   Set<String> s1=driver.getWindowHandles();
	   Iterator<String> itr=s1.iterator();
	   String Parent_id=itr.next();
	   Thread.sleep(1000);
	   String Child_id=itr.next();
	   Thread.sleep(1000);
	   System.out.println("parent id" +Parent_id);
	   System.out.println("child id"  +Child_id);
	   Thread.sleep(1000);
	   driver.switchTo().window(Child_id);
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
	  // s1=driver.getWindowHandles(); 
	   //itr=s1.iterator();
	   //String Parent_id1=itr.next();
	   driver.switchTo().window(Parent_id);
	   System.out.println(driver.getWindowHandles());
	   System.out.println(driver.getTitle());
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
	   WebElement w2=driver.findElement(By.xpath("//select[@name='customerId']"));
	   w2.click();
	   Select sal =new Select(w2);
	   sal.selectByIndex(2);
	  act1.sendKeys(Keys.ENTER).perform();
	   List<WebElement> l1=sal.getOptions();
	   System.out.println(l1.size());
	   for(int i=0;i<=l1.size()-1;i++){
		   if(sad.equals(l1.get(i).getText())){
			   System.out.println("present");
		   }
		   else{
			   System.out.println("not present");
		   }
		  
		  }
	   WebElement w4=driver.findElement(By.xpath("//select[@name='projectId']"));
	  // w4.click();
	   Select sal1=new Select(w4);
	   Thread.sleep(1000);
	   sal1.selectByIndex(2);
	   //Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@name='task[0].name']")).sendKeys("Trainer page");
	   
		}
		

	}



