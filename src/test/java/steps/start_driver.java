package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class start_driver {
    public static WebDriver driver;

    @Given("Open home page")
    public void open_home_page(){
        System.setProperty("webdriver.chrome.driver","/Users/stanislav/IdeaProjects/eatstreet/chromedriver-2");
        driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

    }
}
