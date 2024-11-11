package Testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Basepage.BaseTest;
import Utilities.Locators;

public class RateChange_01_formsubmissionby_KAM extends BaseTest {

    @Test
    public void Logintest() throws InterruptedException {
        // Use locators for login
        Thread.sleep(3000);
        driver.findElement(Locators.emailInput).sendKeys("MOHIT.GARG");
        Thread.sleep(3000);
        driver.findElement(Locators.passwordInput).sendKeys("proton123");
        Thread.sleep(3000);
        driver.findElement(Locators.submitButton).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Locators.paymentLink)).perform();
        driver.findElement(Locators.rateChangeEntryLink).click();
        Thread.sleep(3000);

        driver.findElement(Locators.btnRequest).click();
        
        // Select Customer
        driver.findElement(Locators.customerDropdown).click();
        Thread.sleep(3000);
        driver.findElement(Locators.customerSearchBox).sendKeys("SAPL00912");
        Thread.sleep(3000);
        driver.findElement(Locators.customerNameResults).click();
        Thread.sleep(3000);

        // Select Product
        new Select(driver.findElement(Locators.productDropdown)).selectByValue("CCSP");
        Thread.sleep(3000);
        new Select(driver.findElement(Locators.planTypeDropdown)).selectByValue("BOTH");
        Thread.sleep(3000);

        // Set Effective Date
        driver.findElement(Locators.effectiveDate).click();
        Thread.sleep(3000);
        driver.findElement(Locators.dateSelection).click();
        Thread.sleep(3000);

        // Fill out form
        driver.findElement(Locators.monthlyRevenueInput).sendKeys("1234");
        Thread.sleep(3000);
        driver.findElement(Locators.offeringNameInput).sendKeys("Tata PVT");
        Thread.sleep(2000);
        driver.findElement(Locators.offeringRateInput).sendKeys("12");
        Thread.sleep(2000);

        // Rate Change
        driver.findElement(Locators.btnRateChange).click();
        Thread.sleep(3000);
        driver.findElement(Locators.popup_ok1).click();
        Thread.sleep(3000);
        
        driver.findElement(Locators.rateChangeCheckbox).click();
        Thread.sleep(3000);
        driver.findElement(Locators.btnRateChange).click();

        // Select Change Type
        Select sel = new Select(driver.findElement(Locators.changeTypeDropdown));
        for (int i = 1; i <= 60; i++) {
            sel.selectByValue(String.valueOf(i));
            System.out.println("Checking value: " + i);
        }
        sel.selectByValue("5");

        // Enter values for rate change 
        driver.findElement(Locators.value1Input).sendKeys("12");
        Thread.sleep(2000);
        driver.findElement(Locators.value2Input).sendKeys("5");
        Thread.sleep(2000);
        driver.findElement(Locators.value3Input).sendKeys("8");
        Thread.sleep(2000);

        // Additional selections
        Select seloption = new Select(driver.findElement(Locators.additionalChangeTypeDropdown));
        seloption.selectByValue("CCSP_CM_ANSWD");
        seloption.selectByValue("CCSP_CM_SUBMSSN");
        seloption.selectByValue("CCSP_CM_ANSWD");
        Thread.sleep(2000);
        
        driver.findElement(Locators.remarksInput).sendKeys("Testing only");
        Thread.sleep(2000);
        driver.findElement(Locators.btnSave).click();

       

        // Go back to Rate Change Entry
        action.moveToElement(driver.findElement(Locators.paymentLink)).perform();
        Thread.sleep(2000);
        driver.findElement(Locators.rateChangeEntryLink).click();
        Thread.sleep(2000);
        // Edit and submit
        driver.findElement(Locators.editButton).click();
        Thread.sleep(2000);
        driver.findElement(Locators.submitButtonEdit).click();
        Thread.sleep(2000);

        // Handle Alert
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert message: " + alert.getText());
        alert.accept();
        Thread.sleep(2000);
        
        
        // Validate error message for existing open request
        String errorMessage = driver.findElement(Locators.AlreadyExistdocket).getText();
        
        // Check if the error message contains information about an already existing request
        if (errorMessage.contains("Request is already exist in open stage")) {
            System.out.println("Error: Request already exists in open stage.");
            Assert.fail("Request already exists in open stage. Test case failed.");
        }

        // Continue with the rest of the test if no error message is found
        System.out.println(driver.findElement(Locators.AlreadyExistdocket).getText());
        
        
    }
}
