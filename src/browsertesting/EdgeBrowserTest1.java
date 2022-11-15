package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest1 {

    public static void main(String[] args)
    {

        String baseUrl = "https://opensource-demo.orangehrmlive.com";
        System.setProperty("Webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();//object creation
        driver.get(baseUrl);//launch Url

        //Give implicit time to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print title of the page
        System.out.println("Page title is :" + driver.getTitle());

        //Print the current Url
        String url = driver.getCurrentUrl();
        System.out.println("Current Url is :" + url);

        //Print the page source
        System.out.println("Page source :" + driver.getPageSource());

        //Print username in username field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        //Print password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abc123");

        //close the browser
        //driver.quit();

    }
}
