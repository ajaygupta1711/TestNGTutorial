package TestPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day5 {

@Test(dataProvider="getData")
	public void MobileSignoutcarLoan(String username, String password)
	{
		System.out.println("Mobile SignOut");
		System.out.println(username);
		System.out.println(password);
	}
	
	
@DataProvider
	public Object[][] getData()
	{
		// 1st combination  - username and password - good credit history
		// 2nd - another username and password - no credit history
		// 3rd - Fraduloent credit history
		
		Object[][] data = new Object[3][2]; // Multi Dimentinal Object Array // 3 Rows and 2 Columns
		
		// 1st Set
		
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		
		// Columns in the row nothing but values for the particular combination (row)
		
		// 2nd Set
		
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		// 3rd Set
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		return data;	
		
	}
	
}
