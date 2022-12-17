import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Main {
    public static void main(String[] args)
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://auth.geeksforgeeks.org/");

        // Maximize window size of browser
        driver.manage().window().maximize();

        // Enter your login email id
        driver.findElement(By.id("luser"))

                .sendKeys("sahu.pratham123@gmail.com");

        // Enter your login password
        driver.findElement(By.id("password"))
                .sendKeys("pratham@2005");

        driver.findElement(By.className("signin-button"))
                .click();
    }
}