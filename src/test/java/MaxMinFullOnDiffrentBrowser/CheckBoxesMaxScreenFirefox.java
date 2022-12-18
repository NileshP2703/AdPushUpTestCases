package MaxMinFullOnDiffrentBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;
import Repository.XPathRepository;

public class CheckBoxesMaxScreenFirefox {

	TestBase testBase = new TestBase();

	@Test
	public void checkBoxesMaxScreenFirefox() throws InterruptedException {

		WebDriver driver = testBase.getDriver("FIREFOX");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		driver.findElement(By.xpath(XPathRepository.Box1)).getSize();
		System.out.println("Box 1 Verified at MAximum Screen in Firefox");

		driver.findElement(By.xpath(XPathRepository.Box2)).getSize();
		System.out.println("Box 2 is Verified at Maximum Screen in Firefox");
		testBase.quitDriver(driver);
	}
}
