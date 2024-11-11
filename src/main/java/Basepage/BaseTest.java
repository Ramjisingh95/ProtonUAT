package Basepage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop = new Properties();
    public static FileReader fr;

    @BeforeMethod
    public void setup() throws IOException {
        if (driver == null) {
            fr = new FileReader("C:\\Users\\Ramji.Singh\\eclipse-workspace\\ProtonAutomation\\src\\test\\resources\\configfiles\\config.properties");
            prop.load(fr);
        }

        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup(); // Setup WebDriverManager

            driver = new ChromeDriver(); // Initialize the driver here

            driver.get(prop.getProperty("testurl")); // Use property to get URL
            driver.manage().window().maximize();
        }
        
  //  }

//    @AfterTest
//    public void teardown() {
//        if (driver != null) {
//            driver.close(); // Close the driver if it's initialized
//            System.out.println("Teardown successful");
       // }
        
    }
}
