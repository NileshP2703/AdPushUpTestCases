package PageScrollValidation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class CheckBox2Behaviuor {

	TestBase testBase = new TestBase();

	@Test
	public void checkBox2Behaviuor() {

		WebDriver driver = testBase.getDriver("CHROME");
		driver.manage().window().maximize();
		driver.get("http://cdn.adpushup.com/qaTakeHomeTask/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(1000,0)");

		System.out.println("The Test is Pass for the Box2");
		testBase.quitDriver(driver);
	}

}
