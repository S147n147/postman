package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {

	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	}

	@Test(dataProvider = "testdata")
	public void getdata(String un, String pw) throws InterruptedException {
		WebElement un1 = driver.findElement(By.xpath("//input[@id='email']"));
		un1.clear();
		un1.sendKeys(un);
		Thread.sleep(1000);
		WebElement pd = driver.findElement(By.xpath("//input[@id='pass']"));
		pd.clear();
		pd.sendKeys(pw);
		Thread.sleep(1000);
		WebElement ln = driver.findElement(By.xpath("//button[@id='u_0_5_3o']"));
		ln.click();
		Thread.sleep(1000);
	}

	@DataProvider(name = "testdata")
	public String[][] initdata() {
		return new String[][] { { "shubham", "9689152628" }, { "shyam", "9689" }, { "ram", "4563" } };
	}
}
