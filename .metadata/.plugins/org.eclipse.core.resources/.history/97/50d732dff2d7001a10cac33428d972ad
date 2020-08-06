package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.BasePage;

public class AddingProductToCartPage extends BasePage
{

	public AddingProductToCartPage(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
	}

	
@FindBy (xpath="//*[@id='homefeatured']/li[7]/div/div[1]/div/a[1]/img")
private WebElement scrollproduct;
	
@FindBy (xpath="//*[@id='homefeatured']/li[7]/div/div[1]/div/a[1]/img")
private WebElement product;

@FindBy(xpath="//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]/span")
private WebElement addtocart;



@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/h2/span[2]")
private WebElement message;




	public void pageScollTo()
	{
		try
		{
			scrollToProduct(scrollproduct);
			Thread.sleep(500);
			moveToElement(product);
			Thread.sleep(200);
		}
		catch (Exception e) {
		e.printStackTrace();
	}
	}

	public void clickAddToCartButton()
	{
		try
		{
			addtocart.click();
			
			Thread.sleep(1000);
			String text=message.getText();
			log.info(text);
		Assert.assertTrue(message.isDisplayed());
		
		}
		catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public void closeAllBrowser()
	{
		try
		{
			closeBrowserOpened();
		}
		catch (Exception e) {
		e.printStackTrace();
	}
	}
}
	
	



