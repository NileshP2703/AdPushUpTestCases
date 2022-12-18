package MaxMinFullOnDiffrentBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class CheckFullScreenEdge {

	TestBase testBase = new TestBase();

	@Test
	public void checkFullScreenEdge() throws InterruptedException {

		WebDriver driver = testBase.getDriver("EDGE");
		driver.manage().window().fullscreen();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		driver.findElement(By.xpath("//div[@data-ad-size='728x90']")).getSize();
		System.out.println("Box 1 Verified at Full Screen at Edge Browser");

		driver.findElement(By.xpath("//div[@data-ad-size='300x600']")).getSize();
		System.out.println("Box 2 Verified at Full Screen at Edge Browser");

	}

}
