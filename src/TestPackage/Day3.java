package TestPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

		@BeforeClass
		public void BeforeClass()
		{
			System.out.println("Before executing any method in the class");
		}
		
	@Parameters({ "URL", "APIKey/Username" })
		@Test
		public void WebloginCarloan(String urlname, String key)
		{
			System.out.println("WebloginCar");
			System.out.println(urlname);
			System.out.println(key);
		}

		@Test(groups={"Smoke"})
		public void MobileLogincarLoan()
		{
			System.out.println("MobileLoginCar");
		}
		
		@Test(enabled=false)
		public void MobileSignincarLoan()
		{
			System.out.println("Mobile SignIn");
		}
		
		@BeforeMethod
		public void BeforeEvery()
		{
			System.out.println("I will execute before every test method in Day3 class");
		}
		
		@AfterMethod
		public void AfterEvery()
		{
			System.out.println("I will execute after every test method in Day3 class");
		}
		
		@AfterClass
		public void AfterClass()
		{
			System.out.println("After executing any method in the class");
		}
		
		@BeforeSuite
		public void Bfsuite()
		{
			System.out.println("I am the no one");
		}
		
		@Test(timeOut=4000)
		public void MobileSignoutcarLoan()
		{
			System.out.println("Mobile SignOut");
		}
		
/*		@Test(dependsOnMethods={"WebloginCarloan"})
		public void APIcarLoan()
		{
			System.out.println("APILoginCar");
		} */
		
		@DataProvider
		public Object[][] getData()
		{
			// 1st combination  - username and password - good credit history
			// 2nd - another username and password - no credit history
			// 3rd - Fraduloent credit history
			
			Object[][] data = new Object[3][2]; // Multi Dimentinal Object Array
			
			// 1st Set
			
			data[0][0] = "FirstSetUserName";
			data[0][1] = "Password";
			
			// Columns in the row nothing but values for the particular combination (row)
			
			// 2nd Set
			
			data[1][0] = "SecondSetUserName";
			data[1][1] = "SecondPassword";
			
			// 3rd Set
			
			data[2][0] = "ThirdSetUserName";
			data[2][1] = "ThirdPassword";
			
			return data;
			
			
		}
		
		
}
