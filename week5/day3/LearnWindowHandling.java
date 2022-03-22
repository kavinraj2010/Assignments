package week5.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String oldWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> listOfWindows=new ArrayList<String>(windowHandles);
		
		System.out.println(listOfWindows);
		
		driver.switchTo().window(listOfWindows.get(1));
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(oldWindow);
		System.out.println(driver.getTitle());
		
		
	}
}
