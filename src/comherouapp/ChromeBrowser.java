package comherouapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";

        //1. launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //2. open the URL into browser
        driver.get(baseUrl);

        //3. Print the title of the page
        System.out.println("Title is : " + driver.getTitle());

        //4. Print current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //5. Print source code
        System.out.println("Page source :" + driver.getPageSource());

        //Maximum the Browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //6. Enter the email to email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("tomsmith");

        //7. Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecret");

        //8. Close the browser
        driver.close();
    }
}
