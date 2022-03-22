package week5.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTextChange {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.get("http://www.leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement findElement = driver.findElement(By.xpath("//button[@id='btn']"));
		String text = findElement.getText();
		System.out.println(text);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(findElement));
		
		String text2 = driver.findElement(By.xpath("//button[@id='btn']")).getText();
				
		if(text!=text2)
		{
			System.out.println("Testcase Pass the changed text is : "+text2);
		}
		else
		{
			System.out.println("Testcase fail The text is : "+text);
		}
	}
}
