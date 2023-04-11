package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasic {



    public static void main(String[] args) {


        //2. Set up the chromedriver - Path
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");
        System.setProperty("webdriver.gecho.driver","C:\\Software\\Driver\\geckodriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);


        WebDriver edgedriver = new EdgeDriver();
        edgedriver.manage().window().maximize();
        edgedriver.get("https://demo.nopcommerce.com/");
        System.out.println(edgedriver.getTitle());

//      For Some reason, My firefox browser isn't opening using this method, I tried searching it on google but haven't found a solution so far.
        WebDriver firefoxdriver = new FirefoxDriver();
        firefoxdriver.manage().window().maximize();
        firefoxdriver.get("https://demo.nopcommerce.com/");
        System.out.println(firefoxdriver.getTitle());



    }
}
