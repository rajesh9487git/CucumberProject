package steps;

import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.LoginPage_PF;


import java.util.concurrent.TimeUnit;

public class LoginSteps{

    WebDriver driver = new ChromeDriver();
//    @Inject
//    LoginPage_PF loginpage;



    @Given("borwser is open")
    public void borwser_is_open() {

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is : "+projectPath);

        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");



    }

    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
      driver.navigate().to("https://example.testproject.io/web/");
      Thread.sleep(1000);
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("hi");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("hi");
    }


    @When("user enters valid {string} and {string}")
    public void userEntersValidAnd(String un, String pwd) {

//        loginpage.enterUsername(un);
//        loginpage.enterPassword(pwd);
//        loginpage.clickOnLogin();


    }
}

