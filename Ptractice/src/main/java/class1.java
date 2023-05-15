import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver.chromedriver().setup();
//		WebDriver driver2=new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver2.findElement(By.name("username")).sendKeys("Admin");
		driver2.findElement(By.name("password")).sendKeys("admin123");
		driver2.findElement(By.className("oxd-button")).click();
		Thread.sleep(5000);










		
		
		
	}

}
