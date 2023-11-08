package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.ListsPages;
import org.openqa.selenium.WebDriver;

public class AdminPage {

    private ButtonPages buttonPages;
    private ListsPages listsPages;

    public AdminPage (WebDriver driver){
        this.buttonPages = new ButtonPages(driver);
        this.listsPages = new ListsPages(driver);

    }

    public void llegarAdmin(){
        this.buttonPages.btnAdmin();
    }

    public void buscarUsario(String typeRole){
        this.listsPages.roleUsers(typeRole);
    }
}
