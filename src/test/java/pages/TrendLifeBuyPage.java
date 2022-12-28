package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendLifeBuyPage {
    public TrendLifeBuyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardLink;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/my-purchase-orders'])[1]")
    public WebElement myOrderLink; //a[@class='position-relative d-flex align-items-center active']

    @FindBy(xpath = "(//a[text()='Order Details'])[2]")   //a[text()='Cancel Order']  //a[text()='Order Details']
    public WebElement orderDetailsButton; //a[text()='Order Details']

    @FindBy(xpath = "//div[@class='order_details_list_box']")
    public WebElement orderDetailsListBox;

    @FindBy(xpath = "//div[@class='dashboard_white_box_body dashboard_orderDetails_body']")
    private WebElement orderDetailsBody;

    @FindBy(xpath = "(//h4[text()='Order ID: '])[1]")
    public WebElement orderID;






    @FindBy(xpath = "(//a[@href=\"https://trendlifebuy.com/profile\"])[1]")
    public WebElement myAccountLink;

    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center '])[2]")
    public WebElement suppTicket;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstnameBoxMyAccount;

    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")
    public WebElement purchaseHistoryLink;

    @FindBy(xpath = "//span[text()='These credentials do not match our records.']")
    public WebElement systemMessage;




    //String requestData=life.orderDetailsBody.getText();
        public void orderAssert(){

        Assert.assertTrue(orderDetailsBody.getText().contains("Order ID"));
        Assert.assertTrue(orderDetailsBody.getText().contains("Status"));
        Assert.assertTrue(orderDetailsBody.getText().contains("Order date"));
        Assert.assertTrue(orderDetailsBody.getText().contains("Order Amount"));
        Assert.assertTrue(orderDetailsBody.getText().contains("Package"));
        Assert.assertTrue(orderDetailsBody.getText().contains("Price"));
        Assert.assertTrue(orderDetailsBody.getText().contains("Est arrival date"));
        Assert.assertTrue(orderDetailsBody.getText().contains("TAX Amount"));
}

}

