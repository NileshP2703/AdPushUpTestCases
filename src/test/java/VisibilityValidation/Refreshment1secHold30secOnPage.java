package VisibilityValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.TestBase;

public class Refreshment1secHold30secOnPage {

	TestBase testBase = new TestBase();

	@Test
	public void refreshment1secHold30secOnPage() throws InterruptedException {

		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		Thread.sleep(1000);
		Actions at = new Actions(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		at.sendKeys(Keys.PAGE_UP).build().perform();

		WebElement m = driver.findElement(By.xpath("//div[@data-ad-size='728x90']"));
		String s = m.getText();
		System.out.println("Text obtained by scrolling up is :" + s);

		Thread.sleep(30000);

		System.out.println("The Page has been Verified foe 1 second hold and remains for 30 second");
		testBase.quitDriver(driver);
	}

}
