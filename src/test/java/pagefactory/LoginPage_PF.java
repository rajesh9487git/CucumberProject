package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class LoginPage_PF {

    @FindBy(id="name")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="login")
    WebElement loignbtn;

    WebDriver driver;

    public LoginPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void enterUsername(String un){
        username.sendKeys(un);

    }

    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickOnLogin(){
        loignbtn.click();
    }
}
