package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdTest extends BaseClass {
@Test
public void thirdTest() throws InterruptedException {
	SoftAssert soft = new SoftAssert();
	home.SearchCourse("core java for selenium");
	soft.assertTrue(corejava.getPageHeader().isDisplayed());
	corejava.clickCoreJavaLink();
	Thread.sleep(2000);
	soft.assertTrue(vediopage.getPageHeader().isDisplayed());
	web.switchToFrame(0);
	vediopage.clickPauseButton();
	Thread.sleep(3000);
	vediopage.clickPauseButton();
	vediopage.clickAddToWishlist();
	
	soft.assertAll();
}
}
