package org.springframework.samples.petclinic.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.samples.petclinic.qa.base.TestBase;

public class AddOwnerPage extends TestBase
{

	@FindBy (xpath="/html/body/nav/div/div[2]/ul/li[3]/a/span[2]")
	WebElement FindOwnerBtn;
	
	@FindBy (xpath="/html/body/div/div/a")
	WebElement AddOwnerBtn;
	
	@FindBy (xpath="/html/body/div/div/form/div[1]/div[1]/div/input")
	WebElement FirstName;
	
	@FindBy (xpath="/html/body/div/div/form/div[1]/div[2]/div/input")
	WebElement LastName;
	
	@FindBy (xpath="/html/body/div/div/form/div[1]/div[3]/div/input")
	WebElement Address;
	
	@FindBy (xpath="/html/body/div/div/form/div[1]/div[4]/div/input")
	WebElement City;
	
	@FindBy (xpath="/html/body/div/div/form/div[1]/div[5]/div/input")
	WebElement Telephone;
	
	@FindBy (xpath="/html/body/div/div/form/div[2]/div/button")
	WebElement SaveBtn;
	
	// Initializing the Page Objects:
		public AddOwnerPage() {
			PageFactory.initElements(driver, this);
		}
		
		/*public void ClickFindownerBtn()
		{
			FindOwnerBtn.click();
			
		}*/
		
		
		public void CreatenewOwner(String Ftname,String Ltname,String Ads,String Cty,String Tel )
		{
			FindOwnerBtn.click();
			AddOwnerBtn.click();
			FirstName.sendKeys(Ftname);
			LastName.sendKeys(Ltname);
			Address.sendKeys(Ads);
			City.sendKeys(Cty);
			Telephone.sendKeys(Tel);
			SaveBtn.click();
		}
		
}





