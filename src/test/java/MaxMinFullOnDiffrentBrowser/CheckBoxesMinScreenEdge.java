package MaxMinFullOnDiffrentBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class CheckBoxesMinScreenEdge {

	TestBase testBase = new TestBase();

	@Test
	public void checkBoxesMinScreenEdge() throws InterruptedException {

		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().minimize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		driver.findElement(By.xpath("//div[@data-ad-size='728x90']")).getSize();
		System.out.println("Box 1 Verified at min Screen in Edge Browser");

		driver.findElement(By.xpath("//div[@data-ad-size='300x600']")).getSize();
		System.out.println("Box 2 Verified at min Screen in Edge Browser ");
		testBase.quitDriver(driver);
	}
}
