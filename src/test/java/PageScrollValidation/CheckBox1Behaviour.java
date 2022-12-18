package PageScrollValidation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class CheckBox1Behaviour {

	TestBase testBase = new TestBase();

	@Test
	public void checkBox1Behaviour() {
		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		System.out.println("The test is pass for Box 1");
		testBase.quitDriver(driver);
	}
}
