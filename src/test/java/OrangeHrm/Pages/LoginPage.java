package OrangeHrm.Pages;

import OrangeHrm.DataBase.ConsultDataBase;
import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class LoginPage {

    private ButtonPages buttonPages;
    private Questions questions;

    private ConsultDataBase consultDataBase;


    @FindBy(how = How.NAME, using = "username")
    private WebElement user;

    @FindBy(how = How.NAME, using = "password")
    private WebElement Pass;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);

    }

    public void fillOutLogin(String username, String password) throws SQLException {
        this.user.sendKeys(username);
        this.Pass.sendKeys(password);
        this.consultDataBase.consultUsers();
        this.buttonPages.btnLogin();
        this.questions.timeSeconds(2);
        //this.questions.screenShot();

    }



}
