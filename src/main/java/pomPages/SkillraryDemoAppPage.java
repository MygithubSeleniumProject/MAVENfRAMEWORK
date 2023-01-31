package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
//declartion
	@FindBy(xpath="//a[contains(.,'-ECommerce')]")private WebElement pageHeader;
	@FindBy(id="course")private WebElement courseTab;

	@FindBy(xpath="//span[@class='wrappers']//a[.='Selenium Training']")private WebElement SeleniumTranningLink;

	@FindBy(name="addresstype")private WebElement CategoryDropdown;
	@FindBy(xpath="//a[.='Contact Us']")private WebElement ContactUsLink;

	
//initialization
	public  SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//utilization
	public WebElement getPageHeader() {
		return pageHeader;
	}
public void mouseHoverToCourseTab(WebDriverUtility web) {
	web.mouseHover(courseTab);
}
public void clickSeleniumTraning() {
	SeleniumTranningLink.click();
}
public void selectCategory(WebDriverUtility web, int index) {
	web.dropDown(CategoryDropdown, index);
}
public WebElement getContactUsLink(){
	return ContactUsLink;
}
public void clickContactUs() {
	ContactUsLink.click();
}

}
