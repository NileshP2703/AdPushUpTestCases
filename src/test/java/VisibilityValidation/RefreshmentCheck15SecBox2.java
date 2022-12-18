package VisibilityValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class RefreshmentCheck15SecBox2 {

	TestBase testBase = new TestBase();

	@Test
	public void refreshmentCheck15SecBox2() throws InterruptedException {

		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		for (int number = 2; number <= 5;) {
			Thread.sleep(30000);
			driver.findElement(By.xpath("//div[@data-banner-number='" + number + "']"));

			System.out.println("Box2 has been verified and the Advertisement is not changed " + number);
			break;
		}
		testBase.quitDriver(driver);
	}

}
