package Utilities;

	import org.openqa.selenium.By;


	public class Locators {
	    // Login Locators
	    public static By emailInput = By.id("exampleInputEmail2");
	    public static By passwordInput = By.id("exampleInputPassword2");
	    public static By submitButton = By.id("btnSubmit");

	    // Payment and Rate Change Entry
	    public static By paymentLink = By.xpath("//a[normalize-space()='Payment']");
	    public static By rateChangeEntryLink = By.xpath("//a[normalize-space()='Rate Change Entry']");
	    
	    // Request button
	    public static By btnRequest = By.id("btnRequest");
	    
	    // Customer dropdown
	    public static By customerDropdown = By.id("select2-ddlCustomer-container");
	    public static By customerSearchBox = By.xpath("//input[@role='searchbox']");
	    public static By customerNameResults = By.id("select2-ddlCustomer-results");
	    
	    // Product selection
	    public static By productDropdown = By.id("ddlProduct");
	    public static By planTypeDropdown = By.xpath("//select[@id='ddlPlanType']");
	    
	    // Effective Date
	    public static By effectiveDate = By.id("PopCalendar3_Control");
	    public static By dateSelection = By.xpath("/html/body/div[5]/table/tbody/tr[2]/td/div/table/tbody/tr[6]/td[2]/span");
	    
	    // Form fields
	    public static By monthlyRevenueInput = By.id("txtMonthlyRevenue");
	    public static By offeringNameInput = By.id("txtOfferingName");
	    public static By offeringRateInput = By.id("txtOfferingRate");
	    
	    // Rate Change buttons
	    public static By btnRateChange = By.id("btnRateChange");
	    public static By popup_ok1 = By.id("popup_ok");
	    
	    public static By rateChangeCheckbox = By.id("gridRateChange_chkCafId_0");
	    
	    // Change Type selection
	    public static By changeTypeDropdown = By.id("DetBillType_grdBillingDetails_0_ddlChangeType_0");
	    
	    // Rate Change values input
	    public static By value1Input = By.id("DetBillType_grdBillingDetails_0_txtValue_1");
	    public static By value2Input = By.id("DetBillType_grdBillingDetails_0_txtValue_2");
	    public static By value3Input = By.id("DetBillType_grdBillingDetails_0_txtValue_3");
	    
	    // Additional selection
	    public static By additionalChangeTypeDropdown = By.id("DetBillType_grdBillingDetails_0_ddlChangeType_4");
	    
	    // Remarks and Save
	    public static By remarksInput = By.id("txtRemarks");
	    public static By btnSave = By.id("btnsave");
	    
	    // User Message
	    public static By userMessage = By.xpath("//span[@id='lblUsrMsg']");
	    
	    // Edit and Submit
	    public static By editButton = By.xpath("(//img[@id='imnh'])[1]");
	    public static By submitButtonEdit = By.id("btnsubmit");
	    
	  //********** Rate change verification by Zonal Regional Head **********//
	    
	    public static By ViewcustomerdetailIcon = By.id("gv_inbox_imgBtnPageRedirection_0");
	    public static By Clickonapprovebutton = By.id("btnApprove");
	    public static By popup_ok = By.id("popup_ok");
	    
	    public static By TextRemarksarea = By.id("txtRemarks");
	    public static By successmessage = By.id("lblUsrMsg");
	    
	    //**********Rate change verification by Sales Head**********//
	    
	    public static By RateChangeViewIcon = By.id("gv_inbox_imgBtnPageRedirection_0");
	    
	    public static By AlreadyExistdocket = By.id("MsgControl_lblMsg");
	    
	    
	}

