package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windo {
	static WebDriver d;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		d.findElement(By.id("newWindowBtn")).click();
		String parentHandle = d.getWindowHandle();
		System.out.println("parent window " + parentHandle);
		// handle 2 browser
		// store unique string value
		Set<String> handles = d.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				d.switchTo().window(handle);
				d.findElement(By.id("firstName")).sendKeys("shubham");
				Thread.sleep(2000);
				d.close();
			}
		}
		d.switchTo().window(parentHandle);
		d.findElement(By.id("name")).sendKeys("nilamwar");
		Thread.sleep(2000);
		d.quit();
	}
}
