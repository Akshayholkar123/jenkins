package Org;

import org.testng.annotations.Test;

public class Org {
   
	@Test(groups = "regression")
	public void org() {
		String browser=System.getProperty("browser");
		System.out.println(browser);
		System.out.println("regression testing");
	}
	
	@Test(groups = "smoke")
	public void createorg() {
		String browser=System.getProperty("browser");
		System.out.println(browser);
		System.out.println("smoke testing");
	}
}
