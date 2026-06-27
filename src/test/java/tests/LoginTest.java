package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelReaderUtil;

public class LoginTest extends BaseTest {

    @DataProvider(name = "excelLoginData")
    public Object[][] excelLoginData() {
        return ExcelReaderUtil.readExcel(
                "src/test/resources/testdata/loginData.xlsx",
                "LoginData"
        );
    }

    @Test(dataProvider = "excelLoginData")
    public void loginTest(String username, String password, String expectedResult) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        if (expectedResult.equalsIgnoreCase("valid")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        } else {
            Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface"));
        }
    }
}