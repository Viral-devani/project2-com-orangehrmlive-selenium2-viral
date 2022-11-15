package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowserTest {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        //Scanner decalaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name e.g chrome,firefox,edge :  ");
        String browser = scanner.nextLine();

        //Conditinal stament
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("Webdriver.gheko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("Webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.get(baseUrl);//launch url

        //Browser wait for 20 second
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title :" + title);

        //Print the page source
        System.out.println("Page source " + driver.getPageSource());

        //Enter the username to username field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        //Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abc123");

        //close the browser
        // driver.quit();


    }
}
