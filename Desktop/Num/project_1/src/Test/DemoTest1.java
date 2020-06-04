package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./build/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.charmhealth.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.id("lid"));
		e.sendKeys("nitesh.keshri143@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("123456789");
		Thread.sleep(5000);
		driver.findElement(By.id("signin_submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='charts-menu-icon']")).click();
		

	}

}
