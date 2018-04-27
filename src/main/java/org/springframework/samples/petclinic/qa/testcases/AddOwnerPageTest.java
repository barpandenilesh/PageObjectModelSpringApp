package org.springframework.samples.petclinic.qa.testcases;

import org.apache.poi.util.SystemOutLogger;
import org.springframework.samples.petclinic.qa.base.TestBase;
import org.springframework.samples.petclinic.qa.pages.AddOwnerPage;
import org.springframework.samples.petclinic.qa.util.TestUtil;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ch.qos.logback.core.net.SyslogOutputStream;

public class AddOwnerPageTest extends TestBase
{
	AddOwnerPage addownerpage;

	public String SheetName="sheet2";
	TestUtil testUtil;
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		testUtil = new TestUtil();
		addownerpage= new AddOwnerPage();
		
		
	}
		
	@DataProvider
	public Object[][] getTesdata()
	{
		
		Object[][] ob=TestUtil.getDatafromExcel(SheetName);
		 return ob;
		
	}
	
	/*@Test(priority=1)
	public void findButtonclick()
	{
		addownerpage.ClickFindownerBtn();
		
	}*/
	
	@Test(priority=2,dataProvider="getTesdata")
	
	public void ValidateCreateOwner(String FirstName,String LastName,String Address,String City,String Telephone)
	{
		
		addownerpage.CreatenewOwner(FirstName, LastName, Address, City, Telephone);
		//addownerpage.verifytitle();
	}
	
	@Test (priority=3)
	
	public void validatetitle()
	{
		
		 addownerpage.verifytitle();
		//System.out.println(AddOwnerPage.driver.getTitle());
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}