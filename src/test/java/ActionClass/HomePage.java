package ActionClass;

import ModuleObject.HomePageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ModuleObject.loginPageObject;

public class HomePage {
    static WebDriver driver=null;
    public static void main(String[] args) throws InterruptedException
    {
        HomePageTest();
    }

    public static void HomePageTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //Project url
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();
        Thread.sleep(3000);

        HomePageObject.hamburgerMenu(driver).click();
        Thread.sleep(3000);

        HomePageObject.loginBtn(driver).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        loginPageObject.appointmentButton(driver).click();
        driver.navigate().back();


    }
}
