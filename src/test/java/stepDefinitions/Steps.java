package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    WebDriver driver;

    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application(){
        System.out.println("I am first case");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password(){
        driver.findElement(By.name("q")).sendKeys("ABCD" + Keys.ENTER);
        System.out.println("I am second case");
    }

    @Then("^Reset the credential$")
    public void reset_the_credential(){
        System.out.println("I am Third case");
        driver.quit();

    }

}