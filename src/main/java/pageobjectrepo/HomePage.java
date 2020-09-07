package pageobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBys({@FindBy(xpath = "//input[@name='btnK']")})
    public List<WebElement> searchButton;


}
