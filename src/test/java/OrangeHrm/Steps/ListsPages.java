package OrangeHrm.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListsPages {

    private WebDriver driver;

    public ListsPages (WebDriver driver){
        this.driver = driver;
    }

    public void roleUsers(String typeRole){
        WebElement listRole = driver.findElement(By.xpath("//*[text()= 'User Role']//..//..//i"));
        listRole.click();

        WebElement selectRole = listRole.findElement(By.xpath("//*[text() = '"+typeRole+"']"));
        selectRole.click();
    }
}
