package Testcases;

import org.testng.annotations.Test;
import Basepage.BaseTest;
import Utilities.Locators;

public class RateChange_02_ZonalRegionalHeadVerification extends BaseTest {

    @Test
    public void verifyZonalRegionalHead() throws InterruptedException {
        // Use locators for login
        Thread.sleep(3000);
        driver.findElement(Locators.emailInput).sendKeys("MOHIT.GARG");
        Thread.sleep(3000);
        driver.findElement(Locators.passwordInput).sendKeys("proton123");
        Thread.sleep(3000);
        driver.findElement(Locators.submitButton).click();
        Thread.sleep(3000);

        // Click on view customer detail icon
        driver.findElement(Locators.ViewcustomerdetailIcon).click();
        Thread.sleep(2000);
        driver.findElement(Locators.Clickonapprovebutton).click();
        Thread.sleep(2000);
        driver.findElement(Locators.popup_ok).click();
        Thread.sleep(5000);
       
        driver.findElement(Locators.TextRemarksarea).sendKeys("Testing rate change verification");
        Thread.sleep(2000);
        driver.findElement(Locators.Clickonapprovebutton).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(Locators.successmessage).getText());
        
           
    }
}
