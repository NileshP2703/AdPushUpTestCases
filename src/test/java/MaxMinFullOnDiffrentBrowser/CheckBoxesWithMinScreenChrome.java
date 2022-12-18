package MaxMinFullOnDiffrentBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;
import Repository.XPathRepository;

public class CheckBoxesWithMinScreenChrome {

	TestBase testBase = new TestBase();

	@Test
	public void checkBoxesWithMinScreenChrome() throws InterruptedException {

		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().minimize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		driver.findElement(By.xpath(XPathRepository.Box1)).getSize();
		System.out.println("Box 1 Verified at Minimum Screen at Chrome");

		driver.findElement(By.xpath(XPathRepository.Box2)).getSize();
		System.out.println("Box 2 Verified at Minimum Screen at Chrome");
	}

}
