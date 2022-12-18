package VisibilityValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class Refreshmentcheck15SecondBox1 {
	
	TestBase testBase = new TestBase();
	@Test
	
	public  void refreshmentcheck15SecondBox1() throws InterruptedException {
		
		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");
	
		for (int number=2;number<=5;) {
			Thread.sleep(15000);
			driver.findElement(By.xpath("//div[@data-banner-number='"+number+"']"));
			
				System.out.println("Box1 has been verified for 15 second ad is not changing " + number);
			break;
		
		}
		testBase.quitDriver(driver);
	}

}
