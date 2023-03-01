package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross {
	WebDriver d;

	@Parameters("browser")
	@Test()
	public void init(String url) {
		if (url.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
			d = new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.facebook.com/");
			String title = d.getTitle();
			System.out.println("chrome driver title " + title);
		} else if (url.equals("firefox"))
			System.setProperty("webdriver.firefox.driver","H:\\it\\selenium\\firefox\\geckodriver.exe");
		d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		String title = d.getTitle();
		System.out.println("firefox driver title " + title);

	}

	@Test()
	public void teardown() {
		d.quit();
	}
}