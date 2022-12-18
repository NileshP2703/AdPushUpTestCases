package VisibilityValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class HalfVisibilityBox2Refreshment {

	TestBase testBase = new TestBase();

	@Test
	public void halfVisibilityBox2Refreshment() throws InterruptedException {

		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		for (int number = 2; number <= 5; number++) {
			Thread.sleep(30000);
			driver.findElement(By.xpath("//div[@data-banner-number='" + number + "']"));
			System.out
					.println("Box 2 has been verified at Half of the visibility and its data-banner-number " + number);
		}
		testBase.quitDriver(driver);
	}
}