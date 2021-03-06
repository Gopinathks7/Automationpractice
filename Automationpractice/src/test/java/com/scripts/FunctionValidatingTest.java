package com.scripts;


import org.testng.annotations.Test;

import com.common.AutomationConstants;
import com.common.BasePage;
import com.common.BaseTest;
import com.generic.Excel;
import com.pages.FunctionValidatingPage;


public class FunctionValidatingTest extends BaseTest implements AutomationConstants
{
//	@Test(priority = 1)
//	public void loginToApplicationm()
//	{
//		BasePage p=new BasePage(driver);
//		p.Login();
//	}
	
	@Test(priority = 2)
	public void validateFunctionslity()
	{
		String twiter=Excel.getCellValue(INPUT_PATH, "Sheet5", 1, 0);
		String facebook=Excel.getCellValue(INPUT_PATH, "Sheet5", 2, 0);
		String google=Excel.getCellValue(INPUT_PATH, "Sheet5", 3, 0);
		String pine=Excel.getCellValue(INPUT_PATH, "Sheet5", 4, 0);
		
		String twiterbutton=Excel.getCellValue(INPUT_PATH, "Sheet3", 1, 0);
		String facebookbutton=Excel.getCellValue(INPUT_PATH, "Sheet3", 2, 0);
		String googlebutton=Excel.getCellValue(INPUT_PATH, "Sheet3", 3, 0);
		String pinebutton=Excel.getCellValue(INPUT_PATH, "Sheet3", 4, 0);
		FunctionValidatingPage fv= new FunctionValidatingPage(driver);
		fv.pageScollTo();
		fv.clickMore();
		fv.getSizeofTwiterButton(twiter);
		fv.getSizeofFacebookButton(facebook);
		fv.getSizeofGoogleButton(google);
		fv.getSizeofPinerestButton(pine);
		fv.getEnableOrDisabletwiter(twiterbutton);
		fv.getEnableOrDisableFaceBook(facebookbutton);
		fv.getEnableOrDisableGoogleButton(googlebutton);
		fv.getEnableOrDisabletwiterPintrestButton(pinebutton);
		fv. closeAllBrowser();
	}
}
