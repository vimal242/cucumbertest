package googletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	@Test
	public void sampletest()
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");
	}

}
