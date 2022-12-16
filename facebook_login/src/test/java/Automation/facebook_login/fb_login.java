 package Automation.facebook_login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb_login {
	    @Test
		public void login_Page() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			String title=driver.getTitle();
			System.out.println(title);
	        String url=driver.getCurrentUrl();
			System.out.println(url);
			String source=driver.getPageSource();
			System.out.println(source);
			driver.navigate().to("https://www.amazon.com/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			driver.close();
		
		}
		

	}


