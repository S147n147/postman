package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Btest;
import utilities.Readxlsdata;

public class myfirsttest extends Btest {

	@Test(dataProviderClass = Readxlsdata.class, dataProvider = "bvtdata")
	public static void loginTest(String username, String password) {
		System.out.println("clicked succefully");
		// driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		driver.findElement(By.xpath(loc.getProperty("signin_link"))).click();
		/// driver.findElement(By.xpath("//a[@class=\"zh-login\"]")).click();
		//// driver.findElement(By.xpath("//a[@class=\"zh-login\"]")).click();

		driver.findElement(By.id(loc.getProperty("email_id"))).sendKeys(username);
		/// driver.findElement(By.id("login_id")).sendKeys("nilamwarshubham147@gmail.com");
		//// driver.findElement(By.id("login_id")).sendKeys(username);

		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		/// driver.findElement(By.xpath("//button[@id=\"nextbtn\"]")).click();
		//// driver.findElement(By.xpath("//button[@id=\"nextbtn\"]")).click();
		
		 driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		/// driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("s@123n@123");
		////driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
		// driver.findElement(By.xpath(loc.getProperty("login_next_btn"))).click();
		/// driver.findElement(By.xpath("//button[@id=\"nextbtn\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"nextbtn\"]")).click();

	}

	/*
	 * @DataProvider(name = "testdata") public Object[][] tdata() { return new
	 * Object[][] { { "nilamwarshubham147@gmail.com", "s@123n@123" }, {
	 * "fygf@gmail.com", "uyfgggigfig" }, { "dffyf@gmail.com", "uyfgggigfig" }, {
	 * "fyffff@gmail.com", "uyfgigfffig" }
	 * 
	 * };}}
	 */
}