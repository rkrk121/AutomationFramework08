package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
	
  public void doubleClick(WebDriver driver,WebElement element)
  {
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();
  }
 public void clickAndHold(WebDriver driver,WebElement element)
  {
	 Actions act=new Actions(driver);
	 act.clickAndHold(element).perform();
  }
 
 public void dragandDrop(WebDriver driver,WebElement element) 
  {
	Actions act=new Actions(driver);
	act.dragAndDrop(element, element).perform();		
   }
 public WebDriver switchToFrame(WebDriver driver,String nameorId ) {
	return driver.switchTo().frame(nameorId);
  }
  }

