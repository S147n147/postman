package test;

import org.testng.annotations.Test;

public class test1 {
	@Test(priority = 1,groups={"regression","sanity"})
	
	public void registration() {
		System.out.println("registration");
	}
	@Test(priority = 2)
	public void login() {
	
		System.out.println("login");
	}
	@Test(priority =3, invocationCount=0 ,groups="regression")
	public void homepage() {
		System.out.println("homepage we get skip method");
	}

}
