package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.BasePage;

public class SearchValidatePage extends BasePage {

	public SearchValidatePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	String actual = "";
	WebElement prd;
	String expected = "";

	@FindBy(id = "search_query_top")
	private WebElement searchitem;

	@FindBy(xpath = ".//*[@name='submit_search']")
	private WebElement searchbutton;

	@FindBy(xpath = "//*[@title='Printed Chiffon Dress']")
	private List<WebElement> productname;

	public void validateProductName(String actual) {

		try {
			searchitem.sendKeys(actual);
			searchbutton.click();
			getCount(productname);
			assertTrueCmp(actual, expected);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeAllBrowser() {
		closeBrowserOpened();
	}
}
