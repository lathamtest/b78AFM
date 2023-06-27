package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		p.load(new FileInputStream("./locators.properties"));
		String un = p.getProperty("un");
		String pw = p.getProperty("pw");
		String login= p.getProperty("login");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath(un)).sendKeys("admin");
		driver.findElement(By.xpath(pw)).sendKeys("manager");
		driver.findElement(By.xpath(login)).click();
	}

}
