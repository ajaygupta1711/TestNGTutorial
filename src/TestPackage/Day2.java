package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Day2 {

		@Test(groups={"Smoke"})
		public void Demo()
		{
			System.out.println("Good");
		}

		@Test
		public void SecondTest()
		{
			System.out.println("Bad");
		}
		
		@BeforeTest
		public void prerequisite()
		{
			System.out.println("I will execute first");
		}
		
}
