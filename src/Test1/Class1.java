package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
	
	
	
	@Test(groups={"Smoke"})
	public void demo1() {
		
		System.out.println("demo1");
		
	}
	
	@Parameters({"url"})
	@Test
	public void demo2(String urlname) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTesting\\executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(urlname);
		
	}
	

}
