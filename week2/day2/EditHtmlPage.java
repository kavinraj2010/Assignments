package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditHtmlPage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//enter email id
		driver.findElement(By.id("email")).sendKeys("kavinraj89444@gmail.com");
		
		//Get the default text
		System.out.println("The default text is:"+driver.findElement(By.name("username")).getAttribute("value"));
		
		//clear the text
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		
		//check the input field is disabled or not
		System.out.println("Print false if the textbox is disabled:"+driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//position of button(x,y)
		System.out.println("The Position of the button:"+driver.findElement(By.id("position")).getLocation());
		
		//Find the color of the button
		System.out.println("The color of the button:"+driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//Find the width and height of the button
		System.out.println("The width and height of the button:"+driver.findElement(By.id("size")).getSize());
		
		
	}

}