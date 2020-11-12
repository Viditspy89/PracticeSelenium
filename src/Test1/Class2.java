package Test1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test(dependsOnMethods={"demo4"})
	public void demo3() {
		
		System.out.println("demo3");
	}
	
	@Test(dataProvider="getdata")
	public void demo4(String username, String password) {
		
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0]="1st";
		data[0][1]="1111";
		
		data[1][0]="2nd";
		data[1][1]="2222";
		
		data[2][0]="3rd";
		data[2][1]="3333";
		
		return data;
		
		
	}
	
}
