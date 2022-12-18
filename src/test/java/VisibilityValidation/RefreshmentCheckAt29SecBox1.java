package VisibilityValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class RefreshmentCheckAt29SecBox1 {

	TestBase testBase = new TestBase();
	@Test
	public  void refreshmentCheckAt29SecBox1() throws InterruptedException {
		
		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,60)");
		
		for (int number=2;number<=5;number++) {
			Thread.sleep(29000);
			driver.findElement(By.xpath("//div[@data-banner-number='"+number+"']"));
			
				System.out.println("Box1 has been verified and Advertisement is changing of Box-1 " + number);
			
		}
		testBase.quitDriver(driver);
	}
	
}
