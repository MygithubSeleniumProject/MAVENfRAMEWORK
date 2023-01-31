package genericLibraries;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/*
 * 
 * this class  contains is used to perform all webdriver actions
 */
public class WebDriverUtility{
WebDriver driver;
/*
 * 
 * this method is used to launch browser and navigate to application
 */
public WebDriver openApplication(String browser, String url,long time)
{
	switch(browser){
	case "chrome": driver = new ChromeDriver();break;
	case "edge": driver = new EdgeDriver();break;
	case "firefox": driver = new FirefoxDriver();break;
	
default: System.out.println("invalid browser information"); break;
	}
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver;
	
}
/*
 * this method is used to mouse hover certain element
 */
public void mouseHover(WebElement element) {
	Actions a = new Actions(driver);
	a.moveToElement(element).perform();
}
/*
 * this methode is used to double click on particular element
 */
public void doubleClickonElement(WebElement element) {
	Actions a = new Actions(driver);
	a.doubleClick(element).perform();
}
/*
 * this method is used to drag and drop element to required location
 */
public void dragAndDropElement(WebElement source,WebElement target) {
	Actions a = new Actions(driver);
	a.dragAndDrop(source,target).perform();

}
/*
 * this method is used to select an element from drop down using index
 */
public void dropDown(WebElement element,int index ) {
	Select s = new Select(element);
	s.selectByIndex(index);
}
/*
 * this method is used to select an element from drop down using value
 */
public void dropDown(WebElement element,String value ) {
	Select s = new Select(element);
	s.selectByValue(value);
}
/*this method handles child browser popup
 *  
 */
public void handleChildBrowser() {
	Set<String> windows = driver.getWindowHandles();
	for(String id : windows) {
		driver.switchTo().window(id);
		
	}
}
 /*
  * method is used to switch to frame based on frame index
  */
public void switchToFrame(int index) {
	driver.switchTo().frame(index);
}
/*
 * this method is used to switch back from frame
 */
public void switchBackFromFrame() {
	driver.switchTo().defaultContent();	
}
/*
 * this method handles alert popup
 */
public void handleAlert() {
	driver.switchTo().alert().accept();
}
/*
 * this method scroll till particular element on webpage
 */
public void scrollTillElement(WebElement element) {
	JavascriptExecutor js =(JavascriptExecutor)driver ;
	js.executeScript("arguments[0].scrollIntoView(true)",element);
	
}
/*
 * this method is used to fecth the screenshot of particular web page
 */
public void screenShoot( ) {
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/"+driver.getTitle()+".png");
	try
	{
		FileUtils.copyFile(src,dest);
	
		}
	catch(IOException e) {
		e.printStackTrace();
		}
}
/*
 * this method is used to close current window
 */
	public void closeCurrentWindow() {
		driver.close();
}
	/*
	 * this method is used to close all the windows and exit the browser
	 */
	public void quitBrowser() {
		driver.quit();
	}
}
