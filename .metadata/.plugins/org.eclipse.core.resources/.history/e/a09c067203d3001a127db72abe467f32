package com.scripts;

import org.testng.annotations.Test;
import com.common.AutomationConstants;
import com.common.BaseTest;
import com.generic.Excel;
import com.pages.AmazonLoginPage;

public class AmazonLoginTest extends BaseTest implements AutomationConstants {
	@Test
	public void AmazonLoginTesting() {
		String username = Excel.getCellValue(INPUT_PATH, "Sheet1", 1, 0);
		String password = Excel.getCellValue(INPUT_PATH, "Sheet1", 1, 1);
		AmazonLoginPage page = new AmazonLoginPage(driver);
		page.ClickOnLoginButton();
		page.setUserName(username);
		page.clickOnContinue();
		page.setPassword(password);
		page.clickSign();
	}
}