package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.common.BasePage;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
@FindBy (xpath=".//a[@class='login']")
private WebElement signingButton;

@FindBy(xpath=".//input[@id='email']")
private WebElement username;

@FindBy (xpath=".//input[@id='passwd']")
private WebElement password;

@FindBy (xpath=".//button[@id='SubmitLogin']")
private WebElement submitbutton;


@FindBy(xpath="//*[@id='center_column']/div[1]/ol/li")
private WebElement errormessage;



public void clickSigningButton()
{
	try
	{
		signingButton.click();
		Thread.sleep(2000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}


public void setUserName(String uname)
{
	try
	{
		username.sendKeys(uname);
		Thread.sleep(2000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void setPassword(String pass)
{
	try
	{
		password.sendKeys(pass);
		Thread.sleep(2000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void clickSubmit()
{
	try {
		submitbutton.click();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void invalidUserLogin()
{
	try
	{
		getAssetIsDisplayed(errormessage);
		
	}
	catch (Exception e) {
		e.printStackTrace();
}

}
public void closeBrowser()
{
	try
	{
		Thread.sleep(2000);
		closeBrowserOpened();
	}
		
	
	catch (Exception e) {
		e.printStackTrace();
}
}
}