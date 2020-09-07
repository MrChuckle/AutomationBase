import managers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageobjectrepo.HomePage;

public class PractiseTest {
    public WebDriver driver;
    private String testData;

    @DataProvider(name="dataProvider")
    public static Object[][] dataProvider() {
        Object[][] data = {{"test"},{"test more"}};
        return data;
    }

    @Factory(dataProvider="dataProvider")
    public PractiseTest(String testData) {
        this.testData = testData;
    }

    @BeforeMethod
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://www.google.com");

    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void practiseTest() {
        HomePage page = new HomePage(driver);
        page.searchBox.sendKeys(testData + Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), testData + " - Google Search");
    }

}
