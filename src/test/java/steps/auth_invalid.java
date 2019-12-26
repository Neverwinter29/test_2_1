package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class auth_invalid {
    private WebDriver driver;


    @When("email and password are empty")
    public void email_and_password_are_empty(){
        WebElement loginfield = driver.findElement(By.name("email"));
        loginfield.click();
        loginfield.clear();

        WebElement passwordfield = driver.findElement(By.name("passwd"));
        passwordfield.click();
        passwordfield.clear();
    }
    @And("Click on Sign button")
    public void clicks_on_enter_button(){
        WebElement Click = driver.findElement(By.id("SubmitLogin"));
        Click.click();
    }

    @Then ("validation message appears An email address required")
    public void validation_message_appears_An_email_address_required(){
        WebElement email_required = driver.findElement(By.xpath("//li[contains(text(),'An email address required.')]"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) email_required));

    }

}

