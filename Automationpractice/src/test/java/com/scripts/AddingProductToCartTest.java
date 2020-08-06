package com.scripts;

import org.testng.annotations.Test;

import com.common.AutomationConstants;
import com.common.BasePage;
import com.common.BaseTest;
import com.generic.Excel;
import com.pages.AddingProductToCartPage;
import com.pages.LoginPage;

public class AddingProductToCartTest extends BaseTest implements AutomationConstants 
{
	@Test(priority = 1)
	public void Login()
	{
		BasePage p=new BasePage(driver);
		p.Login();
	
	}
@Test(priority = 2)
public void scrollingAndAddingProduct()
{
	AddingProductToCartPage page=new AddingProductToCartPage(driver);
	page.pageScollTo();
	page.clickAddToCartButton();
	page. closeAllBrowser();
	

	
}
}
