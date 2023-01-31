package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

//declaration
	@FindBy(xpath="//img[contains(@src,'contactus')]")private WebElement contactUsImage;
	@FindBy(name="name")private WebElement fullNameTF;

	@FindBy(name="sender")private WebElement emailTF;

	@FindBy(xpath="//input[@placeholder='Subject']")private WebElement subjectTf;
	@FindBy(name="message")private WebElement messageTA;
	@FindBy(xpath="//button[.='Send us mail']")private WebElement sendUsMailButton;

//intialization
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//utilization
	public  WebElement getHeaderImage() {
	return	contactUsImage;
	}
public void setContactDetails(String name,String email,String subject,String message) {
	fullNameTF.sendKeys(name);
	emailTF.sendKeys(email);
	subjectTf.sendKeys(subject);
	messageTA.sendKeys(message);
}
public void ClickSendUsMailButton() {
	sendUsMailButton.click();
}
}
