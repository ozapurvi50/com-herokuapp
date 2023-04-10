package comherouapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class MultiBrowser {

    static String browser = "Edge";

    static WebDriver driver;

    static String baseUrl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Safari")){
                    driver = new SafariDriver();
            } else {
            System.out.println("This is wrong password");
        }

        //1. open the URL into browser
        driver.get(baseUrl);

        //2. Print the title of the page
        System.out.println("Title is : " + driver.getTitle());

        //3. Print current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //4. Print source code
        System.out.println("Page source :" + driver.getPageSource());

        //Maximum the Browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //5. Enter the email to email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("tomsmith");

        //6. Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecret");

        //7. Close the browser
        driver.close();


    }
}
