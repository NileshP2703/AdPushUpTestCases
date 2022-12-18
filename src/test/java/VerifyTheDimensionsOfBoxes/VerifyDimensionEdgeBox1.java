package VerifyTheDimensionsOfBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class VerifyDimensionEdgeBox1 {

	TestBase testBase = new TestBase();

	@Test
	public void verifyDimensionEdgeBox1() throws InterruptedException {

		WebDriver driver = testBase.getDriver("EDGE");
		driver.manage().window().fullscreen();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		Dimension box1 = driver.findElement(By.xpath("//div[@data-ad-size='728x90']")).getSize();
		System.out.println(box1);

		int box1Width = box1.getWidth();
		int box1Height = box1.getHeight();

		System.out.println("The Box-1 Width is " + box1Width);
		System.out.println("The Box-1 Height is " + box1Height);

		if (box1Width == 728 && box1Height == 90) {
			System.out.println("Pass : The Dimension is Verified");

		} else
			System.out.println("Fail: The Dimension is not Verified");

		testBase.quitDriver(driver);
	}

}
