package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPages.ContactUsPage;
import pomPages.CoreJavaVideoPage;
import pomPages.CorejavaForSeleniumPage;
import pomPages.SeleniumTraningPage;
import pomPages.SkillRaryHomePage;
import pomPages.SkillraryDemoAppPage;
import pomPages.TestingPage;

public class BaseClass {
	 protected PropertiesFileUtility property;
	 protected ExcelFileUtility excel;
	 protected WebDriverUtility web;
	 protected WebDriver driver;
	 protected SkillRaryHomePage home;
	 protected SkillraryDemoAppPage demoApp;
	 protected ContactUsPage contact;
	 protected SeleniumTraningPage selenium;
	 protected TestingPage testing;
	 protected CorejavaForSeleniumPage corejava;
	 protected CoreJavaVideoPage vediopage;
//@BeforeSuite
//@BeforeTest
@BeforeClass
public void classSetup() {
	 property = new PropertiesFileUtility();
	 excel = new ExcelFileUtility();
	 web = new WebDriverUtility();
	 
	 property.propertiesInitialization(IConstantPath.PROPERTY_FILE_PATH);
	 String browser= property.fecthProperty("browser");
	 String url = property.fecthProperty("url");
	 long time =  Long.parseLong(property.fecthProperty("timeouts"));
	 
	 driver = web.openApplication(browser, url, time);
home = new SkillRaryHomePage(driver);
Assert.assertTrue(home.getLogo().isDisplayed());
}
@BeforeMethod
public void methodSetup() {
	excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
	demoApp= new SkillraryDemoAppPage(driver);
	contact = new ContactUsPage(driver);
	selenium = new SeleniumTraningPage(driver);
	testing = new TestingPage(driver); 
	corejava= new CorejavaForSeleniumPage(driver);
	vediopage = new CoreJavaVideoPage(driver);
	
}
@AfterMethod
public void methodTearDown() {
	
}
@AfterClass
public void classTearDown() {
	web.quitBrowser();
	
}

//@AfterTest
//@AfterSuite

}
