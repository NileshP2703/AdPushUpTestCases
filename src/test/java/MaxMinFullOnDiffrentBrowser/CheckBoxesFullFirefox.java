package MaxMinFullOnDiffrentBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class CheckBoxesFullFirefox {

	TestBase testBase = new TestBase();

	@Test
	public void checkBoxesFullFirefox() throws InterruptedException {

		WebDriver driver = testBase.getDriver("FIREFOX");
		driver.manage().window().fullscreen();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		driver.findElement(By.xpath("//div[@data-ad-size='728x90']")).getSize();
		System.out.println("Box 1 Verified at Full Screen in FireFox");

		driver.findElement(By.xpath("//div[@data-ad-size='300x600']")).getSize();
		System.out.println("Box 2 Verified at Full Screen in FireFox");
        testBase.quitDriver(driver);
	}
}
