package VerifyTheDimensionsOfBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;
import Repository.XPathRepository;

public class VerifyDimensionEdgeBox2 {

	TestBase testBase = new TestBase();

	@Test
	public void verifyDimensionEdgeBox2() throws InterruptedException {

		WebDriver driver = testBase.getDriver("EDGE");
		driver.manage().window().fullscreen();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		Dimension box2 = driver.findElement(By.xpath(XPathRepository.Box2)).getSize();
		System.out.println(box2);

		int box2Width = box2.getWidth();
		int box2Height = box2.getHeight();

		System.out.println("The Box-1 Width is " + box2Width);
		System.out.println("The Box-1 Height is " + box2Height);

		if (box2Width == 300 && box2Height == 600) {
			System.out.println("Pass : The Dimension is Verified");

		} else
			System.out.println("Fail: The Dimension is not Verified");

		testBase.quitDriver(driver);
	}

}
