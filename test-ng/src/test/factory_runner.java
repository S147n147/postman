package test;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class factory_runner {
	@Test
	@Factory
	public Object[] RunTests() {
		return new Object[] { new factory(),new factory1() };
	}

}
