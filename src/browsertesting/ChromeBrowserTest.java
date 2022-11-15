package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//Create Object
        //Launch the URL
        driver.get(baseUrl);

        //we get implicit time to driver for wait until few second
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        //Maximize Window
        driver.manage().window().maximize();


        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("The page title is :" + title);

        //Print Current URL
        System.out.println("The Current URL is :" + driver.getCurrentUrl());

        //Print the Page Source
        System.out.println("The page source is :" + driver.getPageSource());


        //Find the Email field element and send the email
        WebElement emailField = driver.findElement(By.name("username"));

        //Type email in to email field
        emailField.sendKeys("Admin");

        //Type email in to email field
        WebElement enterPassword = driver.findElement(By.name("password"));
        //Enter the password
        enterPassword.sendKeys("abc123");


        //Close browser
        driver.quit();
    }

}
