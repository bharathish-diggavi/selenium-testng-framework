package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.NaukariLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(testName = "Naukari Login Test", description = "Test description")
public class NaukariLoginTest extends BaseTest{
    @Test
    public void naukariLoginTest1() {
        driver.get("https://www.naukri.com/");
        NaukariLoginPage naukariLoginPage = PageinstancesFactory.getInstance(NaukariLoginPage.class);
    naukariLoginPage.clickbutton();
    
        naukariLoginPage.enterEmail("replacewithyourmail@gmail.com").enterPassword("replacewithyourpassword").clickloginbutton1();
        naukariLoginPage.clickoncompleteprofile();

//            naukariLoginPage.downloadresume();
//            naukariLoginPage.deleteresume();
//            naukariLoginPage.suredeleteresume();

        naukariLoginPage.uploadresume();

      Assert.assertTrue(false, "Login failed : Test failed");
    }
}
