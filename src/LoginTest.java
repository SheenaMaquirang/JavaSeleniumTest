import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium_Java\\Installers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle() + " is loaded");
		
		driver.findElement(By.xpath("//*[@id=\'//header-waypoint-sticky\']/div[1]/div/div/div[2]/div/ul/li[3]/div")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'login')]")).click();
		

	}

}
