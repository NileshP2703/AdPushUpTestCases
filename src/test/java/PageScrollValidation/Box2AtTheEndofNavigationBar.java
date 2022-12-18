package PageScrollValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Repository.XPathRepository;

public class Box2AtTheEndofNavigationBar {
	
	TestBase testBase = new TestBase();
	@Test
	public void testBox2AtEndOfNavigationBar() {
		
		WebDriver driver = testBase.getDriver("CHROME");
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,5000)");
		
		Assert.assertTrue(driver.findElement(By.xpath(XPathRepository.Box2)).isDisplayed());
		testBase.quitDriver(driver);
	}

}
