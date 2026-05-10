package scripts;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class NavigateToLaptop {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoblaze.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement loginButton = driver.findElement(By.xpath("//a[@id=\"login2\"]"));
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));

        driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("vetri1734");
        driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("1234");

        driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout2")));

        WebElement welcome = driver.findElement(By.xpath("//a[contains(text(),\"Welcome\")]"));

        if (welcome.getText().contains("Welcome")) {
            System.out.println("Logged in");
        }
        else {
            System.out.println("Not logged in");
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);

        WebElement laptops = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Laptops']")));
        actions.moveToElement(laptops).click().perform();

        List<WebElement> items = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='tbodyid']//h4/a"))
        );

        List<String> laptopList = new ArrayList<>();

        for (WebElement ele : items) {
            laptopList.add(ele.getText());
        }

        Collections.sort(laptopList);

        Set<String> laptopSet = new LinkedHashSet<>(laptopList);

        for (String lap : laptopSet) {
            System.out.println(lap);
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.id("next2"))).click();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.xpath("//div[@id='tbodyid']//h4/a")
        ));

        WebElement macbook = driver.findElement(By.xpath("//a[text()='MacBook Pro']"));

        //used ai
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", macbook);

        System.out.println("Found Laptop : " + macbook.getText());

        macbook.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add to cart']"))).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        System.out.println("Product added to cart");
        System.out.println("MacBook Pro added to cart.");

        driver.findElement(By.id("cartur")).click();

        WebElement productName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]"))
        );

        WebElement productPrice = driver.findElement(By.xpath("//td[3]"));

        System.out.println("Product Name : " + productName.getText());
        System.out.println("Product Price : " + productPrice.getText());

        System.out.println("Product Name and Cost verified successfully");


        driver.findElement(By.xpath("//button[text()='Place Order']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Vetri");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Chennai");
        driver.findElement(By.id("card")).sendKeys("123456789");
        driver.findElement(By.id("month")).sendKeys("April");
        driver.findElement(By.id("year")).sendKeys("2026");

        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

        //Used ai 
        WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='sweet-alert  showSweetAlert visible']")
        ));

        String purchaseText = confirm.getText();

        if (purchaseText.contains("Order Id")) {
            System.out.println("Purchase done Successfully");
            System.out.println(purchaseText);
        }
        else {
            System.out.println("Order is Unsuccessful");
        }

        driver.findElement(By.xpath("//button[text()='OK']")).click();

        driver.quit();
    }
}