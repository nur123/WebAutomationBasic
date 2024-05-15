package app.qonek.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverPool {

    public static WebDriver driver; //attribute
    //session webdriver

    public static void setupDriver() {
        //Download Chromedriver otomatis
        WebDriverManager.chromedriver().setup();

        //Inisialisasi Webdriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--incognito");
        driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
    }

    public static void tearDownDriver() {
        driver.quit();
    }
}
