package OrangeHrm.Pages;

import OrangeHrm.DataBase.InsertDataBase;
import OrangeHrm.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPages buttonPages;

    private InsertDataBase insertDataBase;

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement Name;

    @FindBy(how = How.NAME, using = "middleName")
    private WebElement Middle;

    @FindBy(how = How.NAME, using = "lastName")
    private WebElement LastName;

    public PimPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
    }

    public void LlegarAddEmployee(){
        buttonPages.btnPim();
        buttonPages.btnAddEmployee();

    }

    public void fillOutAddEmployee(String firstName, String middleName, String lastName ){
        Name.sendKeys(firstName);
        Middle.sendKeys(middleName);
        LastName.sendKeys(lastName);
        buttonPages.btnSave();

    }


}
