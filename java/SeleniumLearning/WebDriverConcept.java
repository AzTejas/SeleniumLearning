package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConcept {
    public static void main(String[] args) {
       
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.close();

        WebDriverManager.edgedriver().setup();
        WebDriver edgedriver = new EdgeDriver();
        edgedriver.manage().window().maximize();
        edgedriver.get("https://demo.nopcommerce.com/");
        edgedriver.close();

        WebDriverManager.firefoxdriver().setup();
        WebDriver firefoxdriver = new FirefoxDriver();
        firefoxdriver.manage().window().maximize();
        firefoxdriver.get("https://demo.nopcommerce.com/");
        firefoxdriver.close();
    }
}
