package Automation.facebook_login;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Child_browser {
	public  WebDriver driver;
	@Test
	
	public void baseClass() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	
	driver.get("https://joinsuperset.com/");
	Set<String> allWindowHandles = driver.getWindowHandles();
	int count = allWindowHandles.size();
	System.out.println("Number of browser windows opened on the system is : "+ count);
	for (String windowHandle : allWindowHandles) {
		driver.switchTo().window(windowHandle);
		String title = driver.getTitle();
		
		System.out.println("Window handle id of page -->"+ title +" --> is : "+windowHandle);
		driver.close();
	}
	}
	
	public void Browser() {
		driver.get("https://joinsuperset.com/");
		String parentWindowhandleID = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles)
			
			driver.switchTo().window(windowHandle);
		
		
		if (windowHandle.equals(parentWindowhandleID)) {
			driver.close();
			System.out.println("Main Browser window with title -->"+ title +" --> is closed");
		}
	}


		
		
	}
	}
	
	

}
