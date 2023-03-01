package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readpropertiesfile {

	Properties p,p1;

	public static void main(String[] args) throws IOException {
		// read file
		FileReader fr = new FileReader(
				"C:\\Users\\hp\\eclipse-workspace\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		FileReader fr1 = new FileReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\locaters.properties");
		Properties p = new Properties();
		Properties p1 = new Properties();
		// load the file
		p.load(fr);
		p1.load(fr);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
		System.out.println(p.getProperty("signin_link"));
		System.out.println(p.getProperty("email_id"));
		System.out.println(p.getProperty("next_button"));
		System.out.println(p.getProperty("pwd_field"));
	}

}
