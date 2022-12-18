package VisibilityValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class RfreshmentCheckAt30SecBox1 {

	TestBase testBase = new TestBase();
	@Test
	public void rfreshmentCheckAt30SecBox1() throws InterruptedException {
		
		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");
		
		
		for (int number=2;number<=5;number++) {
			Thread.sleep(30000);
			driver.findElement(By.xpath("//div[@data-banner-number='"+number+"']"));
				System.out.println("Box1 has been verified after 30 second " + number);
		}
		testBase.quitDriver(driver);
	}
}
