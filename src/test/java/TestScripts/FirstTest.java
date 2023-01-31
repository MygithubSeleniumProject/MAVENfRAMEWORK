package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;



public class FirstTest extends BaseClass{
	@Test
	public void firstTest() {
		SoftAssert soft = new SoftAssert();
		home.ClickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.handleChildBrowser();
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		demoApp.mouseHoverToCourseTab(web);
		demoApp.clickSeleniumTraning();
		soft.assertTrue(selenium.getPageHeader().isDisplayed());
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.screenShoot();
		soft.assertAll();
	}
}



