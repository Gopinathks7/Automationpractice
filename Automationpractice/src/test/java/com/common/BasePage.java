package com.common;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.generic.Excel;
import com.generic.Property;
import com.pages.LoginPage;
import com.relevantcodes.extentreports.model.Log;

public class BasePage implements AutomationConstants
{
	
	public Logger log=Logger.getLogger(this.getClass());
	  public WebDriver driver;
	  public String strConfigFile;
	  public long timeout;
	  WebDriverWait wait;
	  JavascriptExecutor executor;
	  WebElement element;
	  public BasePage(WebDriver driver){
		  this.driver=driver;
		  strConfigFile=AutomationConstants.CONFIG_PATH+AutomationConstants.CONFIG_FILE;
		  timeout=Long.parseLong(Property.getPropertyValue(strConfigFile, "EXPLICIT"));
	  }
	  
	
	  public void moveToElement(WebElement element){
		  Actions actions=new Actions(driver);
		  actions.moveToElement(element).perform();
}

	  public void scrollToProduct(WebElement element)
	  {
		  executor=(JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].scrollIntoView();",element );
	  }
	  
	  public void closeBrowserOpened()
	  {
		  driver.quit();
	  }
	  
	
	  
	  public void switchingToFrame()
	  {
		 
		  driver.switchTo().frame(1);
	  }
	  
	  public void Login()
	  {
		
				String username = Excel.getCellValue(INPUT_PATH, "Sheet1", 1, 0);
				String password = Excel.getCellValue(INPUT_PATH, "Sheet1", 1, 1);
				LoginPage page=new LoginPage(driver);
				page.clickSigningButton();
				page.setUserName(username);
				page.setPassword(password);
				page.clickSubmit();
			
			}
	  public void assertTrueCmp(String actual,String expected)
	  {
		  try
		  	  {
		  Assert.assertTrue(actual.contains(expected));
	  }
		  catch(AssertionError e)
		  {
			  log.info("Not Same");
			  throw e;
		  }
		  log.info("Same");
	  }
	  public void buttonClickable(WebElement element)
	  {
		 wait=new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	  }
	  public void checkFunctionality(WebElement element) 
	  {
		  if(element.isDisplayed() && element.isEnabled())
		  {
			  log.info("Functionality is working");
		  }
		  else
		  {
			  log.info("Functionality is not working");
		  }
	  }
	  
	  public void getElementsize(WebElement element,String name) 
	  {
		
		int height= element.getSize().getHeight();
		int width=element.getSize().getWidth();
		log.info("Button Height Is "+height+" pixels  of==>  "+name);
		log.info("Button Width Is "+width+ "  pixels of==>  "+name);
	  }
	  
	  public void clickByJavascript(WebElement element)
	  
	  {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		
}
	  
	  public void getAssetIsDisplayed(WebElement element) {
		  
		  try 
		  {
		Assert.assertTrue(element.isDisplayed());
		  }
		  catch (AssertionError e) {
			log.info("Invalid Loging  Message is not  Displyed");
			throw e;
		}
		  log.info("Invalid Loging  Message is   Displyed");
	  }
	  
	  public void getCount(List<WebElement> element)
	  	  {
		int count=element.size();
		for(int i=0;i<count;i++)
		{
			WebElement ele=element.get(i);
			String expected=ele.getText();
			log.info(expected);
		}
	  }
}