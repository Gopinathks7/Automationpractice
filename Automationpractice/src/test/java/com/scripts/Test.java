package com.scripts;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test {

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String xpath=".//*[@name='submit_search']";
		String actual="Printed Chiffon Dress";
		WebElement search=driver.findElement(By.id("search_query_top"));
		search.sendKeys(actual);
		
		WebElement btn=driver.findElement(By.xpath(xpath));
		btn.click();
		WebElement prd;
		String expected="";
	String productname=".//*[@title='Printed Chiffon Dress']";
	List<WebElement> product = driver.findElements(By.xpath(productname));
int count=product.size();
for(int i=0;i<count;i++)
{
	prd=product.get(i);
	expected=prd.getText();
	
    
	}
Assert.assertTrue(actual.contains(expected));
//Assert.assertEquals(actual, expected);

	
}
	
}

