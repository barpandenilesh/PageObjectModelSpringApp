package org.springframework.samples.petclinic.qa.testcases;

import org.springframework.samples.petclinic.qa.base.TestBase;
import org.springframework.samples.petclinic.qa.pages.AddOwnerPage;
import org.springframework.samples.petclinic.qa.util.TestUtil;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

	
	
	
}
