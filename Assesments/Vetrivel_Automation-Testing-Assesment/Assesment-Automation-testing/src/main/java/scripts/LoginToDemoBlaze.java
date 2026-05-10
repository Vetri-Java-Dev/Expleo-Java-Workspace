package scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToDemoBlaze {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoblaze.com/");
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id=\\\"login2\\\"]")));
		
		WebElement loginButton=driver.findElement(By.xpath("//a[@id=\"login2\"]"));
		loginButton.click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"loginusername\\\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("vetri1734");
		driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
		
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"logout2\"]"))));
		
		WebElement welcome=driver.findElement(By.xpath("//a[contains(text(),\"Welcome\")]"));
		
		if(welcome.getText().contains("Welcome")) {
			System.out.print("Logged in");
		}
		else {
			System.out.print("Not logged in");
		}
		
		driver.close();
	}
}
