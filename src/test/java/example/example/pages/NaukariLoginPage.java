package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NaukariLoginPage extends BasePage {

    @FindBy(id="login_Layer")
    private WebElement loginbutton;
   @FindBy(xpath = "//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")
  private WebElement enteremail;

    @FindBy(xpath = "//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")
    private WebElement enterpassword;
    @FindBy(xpath ="//*[@class='btn-primary loginButton']")
    private WebElement clickloginbutton;

    @FindBy(xpath ="/html/body/main/div/div/div/div/div/div[1]/div/div[3]/div[2]/a")
    private WebElement clickoncompleteprofile;

    @FindBy(xpath ="//*[@id=\"lazyAttachCV\"]/div/div[2]/div[1]/div/div[2]/div/span[1]/i")
    private WebElement downloadresume;

    @FindBy(xpath ="//*[@id=\"lazyAttachCV\"]/div/div[2]/div[1]/div/div[2]/div/span[2]/i")
    private WebElement deleteresume;

    @FindBy(xpath ="/html/body/div[6]/div[6]/div/div/button")
    private WebElement suredeleteresume;

    @FindBy(xpath ="//*[@id=\"root\"]/div/div/span/div/div/div/div/div/div[2]/div[1]/div/div/ul/li[2]/a")
    private WebElement uploadresume;




    /**
     * Instantiates a new google page.
     *
     * @param driver the driver
     */
//    public GooglePage(WebDriver driver) {
//        super(driver);
//    }

    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public NaukariLoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Searches the given text.
     *
     * @param key the key
     */
    public void clickbutton() {

        loginbutton.click();
    }
    public NaukariLoginPage enterEmail(String email) {
        enteremail.sendKeys(email);
        return this;
    }

    /**
     * Enter password.
     *
     * @param password the password
     * @return the facebook login page
     */
    public NaukariLoginPage enterPassword(String password) {
        enterpassword.sendKeys(password);
        return this;
    }
    public void clickloginbutton1() {

        clickloginbutton.click();
    }
    public void clickoncompleteprofile() {

        clickoncompleteprofile.click();
    }

    public void downloadresume() {

        downloadresume.click();
    }
    public void deleteresume() {

        deleteresume.click();
    }
    public void suredeleteresume() {

        suredeleteresume.click();
    }
    public void uploadresume() {

        uploadresume.click();
        String filepath="C:/mahi/Resuume-mahi-4+latest.pdf";
        uploadresume.sendKeys(filepath);
        uploadresume.click();
    }

}



