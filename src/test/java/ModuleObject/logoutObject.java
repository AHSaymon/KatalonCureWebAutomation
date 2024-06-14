package ModuleObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutObject {

    private static WebElement element=null;
    //WebDriver driver=null;

    // hamburgerMenu button
    public static WebElement menuToggleButton(WebDriver driver)
    {
        element=driver.findElement(By.id("menu-toggle"));
        return element;
    }

    public static WebElement logoutButton(WebDriver driver)
    {
        element=driver.findElement(By.linkText("Logout"));
        return element;
    }
}
