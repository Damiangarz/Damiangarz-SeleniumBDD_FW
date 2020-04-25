package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;
    private static WebDriver driver;
    private static WebDriverWait waitDriver;
    private static final int TIMEOUT = 30;
    private static final int PAGE_LOAD_TIMEOUT = 30;

    private SeleniumDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        waitDriver = new WebDriverWait(driver,TIMEOUT);
    }

    public static void setupDriver(){
        if(seleniumDriver==null){
            seleniumDriver = new SeleniumDriver();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void openPage(String url){
        driver.get(url);
    }

    public static void tearDown(){
        if(driver!=null){
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }

}
