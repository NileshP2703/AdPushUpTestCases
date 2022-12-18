package VerifyTheLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class LocationVerificationBox1 {

	TestBase testBase = new TestBase();

	@Test
	public void locationVerificationBox1() throws InterruptedException {

		WebDriver driver = testBase.getDriver("CHROME");
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		Dimension usernameDim = driver.findElement(By.id("username")).getSize();

		int usernameWidth = usernameDim.getWidth();

		Dimension passwordDim = driver.findElement(By.name("pwd")).getSize();

		int passwordWidth = usernameDim.getWidth();

		Point usernameLoc = driver.findElement(By.id("username")).getLocation();
		Point passwordLoc = driver.findElement(By.name("pwd")).getLocation();

		int usernameStartX = usernameLoc.getX();
		int passwordStartX = usernameLoc.getX();

		int a = usernameWidth;
		Point b = usernameLoc;
		testBase.quitDriver(driver);
	}

}
