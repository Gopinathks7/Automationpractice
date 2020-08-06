package com.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.generic.Property;

public class BasePage 
{
	
	public Logger log=Logger.getLogger(this.getClass());
	  public WebDriver driver;
	  public String strConfigFile;
	  public long timeout;
	  
	  public BasePage(WebDriver driver){
		  this.driver=driver;
		  strConfigFile=AutomationConstants.CONFIG_PATH+AutomationConstants.CONFIG_FILE;
		  timeout=Long.parseLong(Property.getPropertyValue(strConfigFile, "EXPLICIT"));
	  }
	  
	  
	 
}
