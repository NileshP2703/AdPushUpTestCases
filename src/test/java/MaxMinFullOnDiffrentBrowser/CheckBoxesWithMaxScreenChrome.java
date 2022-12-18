package MaxMinFullOnDiffrentBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;
import Repository.XPathRepository;

public class CheckBoxesWithMaxScreenChrome {

	TestBase testBase = new TestBase();

	@Test
	public void checkBoxesWithMaxScreenChrome() throws InterruptedException {

		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		driver.findElement(By.xpath(XPathRepository.Box1)).getSize();
		System.out.println("Box 1 Verified at Maximum Screen at Chrome");

		driver.findElement(By.xpath(XPathRepository.Box2)).getSize();
		System.out.println("Box 2 Verified at Maximum Screen at Chrome");
		testBase.quitDriver(driver);
	}
}
