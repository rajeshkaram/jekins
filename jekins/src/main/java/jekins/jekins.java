package jekins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jekins {
@Test

public void test() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\arte206_saikiraN\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
}
