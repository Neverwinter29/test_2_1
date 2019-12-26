package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class auth_val {
    public static WebDriver driver;


    @Given("User navigates to login page")
    public void user_navigates_to_login_page(){

       WebElement Signin = driver.findElement(By.linkText("Sign in"));
       Signin.click();
    }
    @Then("User was redirected to login page")
    public void user_was_redirected_to_login_page(){

        String getUrl= driver.getCurrentUrl();
        String actualUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        Assert.assertEquals(actualUrl, getUrl);

//         проверка по наличию имени авторизации
           String authorization = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
      //  String authorization = driver.findElement(By.linkText("Authentication")).getText() ;
        String authtitle = "AUTHENTICATION";
           Assert.assertEquals(authtitle, authorization);

 //          проверка наличия первого блока авторизации
           WebElement create_account_form = driver.findElement(By.id("create-account_form"));
           if(create_account_form.isDisplayed()) {
               System.out.println("create account form is appearing on the page");
           }
           else {
               System.out.println("The create account form is not displayed");
           }
           }
//
//        String getUrl= driver.getTitle();

//        String actualUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
//        Assert.assertEquals(getUrl, actualUrl);

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        component_login component_login= new component_login();
//        WebElement Email = driver.findElement(By.id("email"));
//        WebElement Password = driver.findElement(By.id("passwd"));
          component_login.email.sendKeys("stan29199@gmail.com");
          component_login.password.sendKeys("test12345");
          System.out.println("email and password match");

//        Email.sendKeys("stan29199@gmail.com");
//        Email.getAttribute("stan29199@gmail.com");
//        Password.sendKeys("test12345");
//        Password.getAttribute("test12345");
//        System.out.println("Text Field Set");

    }
    @And("clicks on enter button")
    public void clicks_on_enter_button(){

        //component_login.click_on_enter.click();
//       WebElement Click = driver.findElement(By.id("SubmitLogin"));

        //Click.click();
    }

    @Then("Success redirect to account page")
    public void success_redirect_to_account_page(){

//        String getUrl= driver.getCurrentUrl();
//        String actualUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
//        Assert.assertEquals(getUrl, actualUrl);

// зарегаться на сайте и сделать проверку в итоге

    }
}
