package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {

    public static void main(String[] args)
    {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("Webdriver.gheko.driver", "Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);//Launch the url

        //we get implicit time to driver for wait until few second
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //Print the current Url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source :" + driver.getPageSource());

        //Enter Username to user field
        WebElement userField = driver.findElement(By.name("username"));
        //Type username
        userField.sendKeys("Admin");

        //Enter password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");


        //close the browser
        driver.quit();
    }
}
