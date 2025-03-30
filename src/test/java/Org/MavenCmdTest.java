package Org;

import org.testng.annotations.Test;

public class MavenCmdTest {
	//git pull 25
	//via jenkins executed push kiya
	@Test
	public void runCmdTest()
	{
		System.out.println("executed via cmd");
		System.out.println("executed via jenkins");
	}

}
