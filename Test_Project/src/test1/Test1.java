package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("STARTED");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Tapas\\Downloads\\geckodriver\\geckodriver-v0.28.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7032303319");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("7093670788");
	    driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
	    System.out.println("ENDED");
	    driver.close();

	}

}
