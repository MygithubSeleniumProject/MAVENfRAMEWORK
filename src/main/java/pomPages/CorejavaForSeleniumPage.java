package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaForSeleniumPage {
//declaration
	@FindBy(xpath="//div[@class='newest_coursing clearfix']")private WebElement pageHeader;
	@FindBy(xpath=" //a[text()= ' Core Java For Selenium Trainin']")private WebElement coreJavaLink;
//initialization
	public  CorejavaForSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//utilization
	public WebElement getPageHeader() {
		return pageHeader;
	}
public void clickCoreJavaLink() {
	coreJavaLink.click();
}


}