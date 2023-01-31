package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryHomePage {
//declaration
	
	@FindBy(xpath="//img[@alt='SkillRary']")private WebElement logo;
	@FindBy(name="q")private WebElement searchTF;
	@FindBy(xpath="//input[@value='go']")private WebElement searchButton;
	@FindBy(xpath="//a[text()=' GEARS ']")private WebElement gearstab;
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']")private WebElement skillraryDemoAppLink;
	

	//initionlization
	
	public SkillRaryHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//utilization
	
	public WebElement getLogo() {
		return logo;
	}
    public void SearchCourse(String text) {
	searchTF.sendKeys(text);
	searchButton.click();
      }
    public void ClickGearsTab() {
	gearstab.click();
	
       }
       public void clickSkillraryDemoAppLink() {
	skillraryDemoAppLink.click();
}
}

