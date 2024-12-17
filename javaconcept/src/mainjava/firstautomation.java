package mainjava;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class firstautomation {
	
public static void main(String[] args) throws InterruptedException
	{
		
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\grid\\drivers\\chromedriver.exe");

 WebDriver driver= new ChromeDriver();
 
 driver.get("https://www.youtube.com/");
 
 System.out.println(driver.getTitle());

 System.out.println(driver.getCurrentUrl());
 
 Thread.sleep(2000);
 driver.manage().window().maximize();
 
 Thread.sleep(5000);
 
driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[3]/div[2]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]")).click();

driver.findElement(By.id("identifierId")).sendKeys("punnavalli123456@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
Thread.sleep(2000);
driver.findElement(By.partialLinkText("Learn more")).click();
 Thread.sleep(6000);

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,700)","");

WebElement id = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));

id.sendKeys("java");
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/button/yt-icon/yt-icon-shape/icon-shape/div")).click();

Thread.sleep(2000);
 driver.navigate().back();
 
 driver.findElement(By.xpath("//*[@id=\"guide-icon\"]/yt-icon-shape/icon-shape/div")).click();
 Thread.sleep(3000);
 
 driver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[2]/a/tp-yt-paper-item/yt-formatted-string")).click();
 
 Thread.sleep(2000);
 

	}

}
