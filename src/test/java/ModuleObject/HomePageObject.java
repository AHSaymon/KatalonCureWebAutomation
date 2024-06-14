package ModuleObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
    private static WebElement element = null;
    //WebDriver driver=null;

    // hamburgerMenu button
    public static WebElement hamburgerMenu(WebDriver driver) {
        element = driver.findElement(By.id("menu-toggle"));
        return element;
    }

    // Home button
    public static WebElement HomeButton(WebDriver driver) {
        element = driver.findElement(By.linkText("Home"));
        return element;
    }

    public static WebElement loginBtn(WebDriver driver) {
        element = driver.findElement(By.linkText("Login"));
        return element;
    }


}