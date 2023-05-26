package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    public static WebDriver driver;
    public static Properties properties;
    public SeleniumUtils utils;
    public static Logger log = Logger.getLogger(TestBase.class.getName());

    public TestBase() {
        utils = new SeleniumUtils();
    }

    public static void initializeDriver() {
        String browserName = properties.getProperty("browser");

        if (browserName.toLowerCase().equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        } else if (browserName.toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        log.info("Opened " + browserName + " browser");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(SeleniumUtils.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(SeleniumUtils.IMPLICIT, TimeUnit.SECONDS);
    }

    public static void configureLoggingProperties() {
        PropertyConfigurator.configure("src//main//resources//config//log4j.properties");
    }

    public static void loadDataProperties() {
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream("src/main/resources/config/config.properties");
            properties.load(fis);
            log.info("Properties loaded successfully");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void scrollDown(int pixels) throws InterruptedException {
        Thread.sleep(5000);
        waitForPageLoad();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }

    protected static void waitForPageLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(SeleniumUtils.TIMEOUT)).until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
}