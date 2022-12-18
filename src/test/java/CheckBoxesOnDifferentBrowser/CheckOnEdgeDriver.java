package CheckBoxesOnDifferentBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.TestBase;

public class CheckOnEdgeDriver {
	
	TestBase testBase = new TestBase();
	@Test
	public  void CheckPageOnEdge() throws InterruptedException {
		
		WebDriver driver = testBase.getDriver("EDGE");
		
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");
		
		Actions at = new Actions(driver);
	      at.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		WebElement l = driver.findElement(By.xpath("//div[@data-ad-size='300x600']"));
	      String strn = l.getText();
	      System.out.println("Box obtained by scrolling down is :"+strn);
	      
	      at.sendKeys(Keys.PAGE_UP).build().perform();
		     
	      WebElement m = driver.findElement(By.xpath("//div[@data-ad-size='728x90']"));
	      String s = m.getText();
	      System.out.println("Box obtained by scrolling up is :"+s);
	      testBase.quitDriver(driver);
	}

	}



