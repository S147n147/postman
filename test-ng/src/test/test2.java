package test;

import org.testng.annotations.Test;

public class test2 {
	@Test(groups = { "regression", "sanity" })
	public void homepage1() {
		System.out.println("homepage1");
	}

	@Test(groups = "regression")
	public void login1() {
		//Thread.sleep(53435435);
		System.out.println("login1 we get error");
	}
}
