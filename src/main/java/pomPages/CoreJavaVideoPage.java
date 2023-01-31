package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVideoPage {
	//declaration
		@FindBy(xpath="//h1[text()='Core Java For Selenium Training']")private WebElement pageHeader;
		@FindBy(xpath="Play")private WebElement playButton;
		@FindBy(xpath="pause")private WebElement pauseButton;
		@FindBy(xpath="//span[text()='Add To Wishlist']")private WebElement addToWishListButton;
	
	//initialization
		public CoreJavaVideoPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//utilization
		public WebElement getPageHeader() {
			return pageHeader;
		}
		public void clickPlayButton() {
			playButton.click();
		}
		
		public void clickPauseButton() {
			pauseButton.click();
		}
		public void clickAddToWishlist() {
			addToWishListButton.click();
		}
			
		
}
