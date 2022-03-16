package TestPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
		
		@Parameters({ "URL" })
		@Test 
		public void WebloginHomeloan(String uname)
		{
			// Selenium
			System.out.println("WebloginPersonalLoan");
			System.out.println(uname);
		}

		@Test(groups={"Smoke"})
		public void MobileLoginHomeLoan()
		{
			// Appium
			System.out.println("MobileloginHome");
		}
		
		@Test
		public void APILoginHomeLoan()
		{
			// Rest API Automation
			System.out.println("APIloginHome");
		}
}
