package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class component_login {
    public Alert click_on_enter;
    public Alert email;
    public Alert password;
    public WebDriver driver;
    public void email(){ 
        driver.findElement(By.id("email"));
    }
    public void password(){
        driver.findElement(By.id("passwd"));
    }
    public void click_on_enter(){
        driver.findElement(By.id("SubmitLogin"));
    }

    
}
