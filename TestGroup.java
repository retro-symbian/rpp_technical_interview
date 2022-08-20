package rpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGroup {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//
		driver.get("https://limestone-estate.azurewebsites.net");
		driver.manage().window().maximize();
		
		String userna = "/html/body/div[1]/div/div/div[2]/input[1]";
		String pw = "/html/body/div[1]/div/div/div[2]/input[2]";
		
		driver.findElement(By.xpath(userna)).sendKeys("chimau@rpp.ng");
		driver.findElement(By.xpath(pw)).sendKeys("hwx6xj2U");
		
	    String login = "/html/body/div[1]/div/div/div[2]/button";
	    driver.findElement(By.xpath(login)).click();
	    
	    Thread.sleep(300);
	    
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[3]/a")).click();
	    
	    //create group
	    
	    
	    
	    
		
		
		
		

		

	}

}
