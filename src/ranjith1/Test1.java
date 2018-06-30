package ranjith1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Test1 
{
public static Logger log=Logger.getLogger(Test1.class);
	@BeforeMethod
 public void login()
	{
		log.debug("Strats");
		System.out.println("login to app");
	log.debug("ends");
	}
	@Test(groups="smoke")
	public void create_cust()
	{
		log.debug("Strats");
		System.out.println("create cust");
		log.debug("ends");
	}
	@Test
	public void asdfalk()
	{
		log.debug("Strats");
		System.out.println(".bv.ajkgh");
		log.debug("ends");
	}
	@AfterMethod
 public void logout()
	{
		log.debug("Strats");
		System.out.println("logout from app");
		log.debug("ends");
	}
	
}
