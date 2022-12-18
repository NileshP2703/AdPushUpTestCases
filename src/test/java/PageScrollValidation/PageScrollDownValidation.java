package PageScrollValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.TestBase;
import Repository.XPathRepository;

public class PageScrollDownValidation {

	TestBase testBase = new TestBase();

	@Test
	public void pageScrollDownValidation() throws InterruptedException {
		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();

		WebElement l = driver.findElement(By.xpath(XPathRepository.Box1));
		String strn = l.getText();
		System.out.println("Text obtained by scrolling down is :" + strn);

		Thread.sleep(1500);

		at.sendKeys(Keys.PAGE_UP).build().perform();

		WebElement m = driver.findElement(By.xpath(XPathRepository.Box2));
		String s = m.getText();
		System.out.println("Text obtained by scrolling up is :" + s);
		testBase.quitDriver(driver);
	}
}
