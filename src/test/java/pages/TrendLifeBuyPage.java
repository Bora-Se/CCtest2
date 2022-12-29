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

    // ==================== LOGIN ---->> DASHBOARD   =======================>>>
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

    // ==================== MY ORDER   =======================>>>
    // 1801- My Order sayfasindaki urun boardindan Order Details butonuna tiklayinca ilgili siparisin detay sayfasina gidildigi dogrulanmali.
    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/my-purchase-orders'])[1]")
    public WebElement myOrderLink; //a[@class='position-relative d-flex align-items-center active']--HATALI

    @FindBy(xpath = "(//a[text()='Order Details'])[2]")   //a[text()='Cancel Order']  //a[text()='Order Details']
    public WebElement orderDetailsButton; //a[text()='Order Details']

    @FindBy(xpath = "//div[@class='order_details_list_box']")
    public WebElement orderDetailsListBox;

    @FindBy(xpath = "//div[@class='dashboard_white_box_body dashboard_orderDetails_body']")
    private WebElement orderDetailsBody;

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

    // 1802- Order ID, Status, Order date, Order Amount, Package, Price, Est arrival date, TAX Amount information is displayed.
    @FindBy(xpath = "//h4[text()='Order ID:  ']")       //(//h4[text()='Order ID: '])[1] hatali
    public WebElement detailsOrderID;
    @FindBy(xpath = "//h4[text()='Status: ']")
    public WebElement detailsStatus;
    @FindBy(xpath = "//h4[text()='Order date :  ']") //h4[text()='Order date :  ']
    public WebElement detailsOrderDate;
    @FindBy(xpath = "(//h4[text()='Order amount: '])[1]")
    public WebElement detailsOrderAmount;
    @FindBy(xpath = "//h4[text()='Package : 22122303521333']")
    public WebElement detailsPackage;
    @FindBy(xpath = "//h4[text()='Price: $ 124']")
    public WebElement detailsPrice;
    @FindBy(xpath = "//p[text()='Est arrival date: 28 Dec - 31 Dec']")
    public WebElement detailsEstArrivalDate;
    @FindBy(xpath = "//h4[text()='TAX Amount:  ']")
    public WebElement detailsTAXAmount;

    // 1803- Order Details sayfasinda ilgili siparis süreci ile ilgili;
    // Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.
    @FindBy(xpath = "//h5[text()='Pending']")
    public WebElement detailsPending;
    @FindBy(xpath = "//h5[text()='Processing']")
    public WebElement detailsProcessing;
    @FindBy(xpath = "//h5[text()='Shipped']")
    public WebElement detailsShipped;
    @FindBy(xpath = "//h5[text()='Recieved']")
    public WebElement detailsRecieved;
    @FindBy(xpath = "//h5[text()='Delivered']")
    public WebElement detailsDelivered;

    //1804- Order Details sayfasinda; Pending, Processing, Shipped, Recieved, Delivered
    //        #  asamalarinin aciklamalarini iceren textlerin görünür oldugu dogrulanmali.
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[1]")
    public WebElement detailsPendingText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[2]")
    public WebElement detailsProcessingText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[3]")
    public WebElement detailsShippedText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[4]")
    public WebElement detailsRecievedText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[5]")
    public WebElement detailsDeliveredText;

    //---- 1805- My Order sayfasindaki Cancel Order butonunun Cancel sekmesine yönlendirme yaptigi dogrulanmali.
    @FindBy(xpath = "(//a[text()='Cancel Order'])[2]")   // Dikkat- Cancel da Send islemini 3. de yaptim
    public WebElement cancelOrderButton;
    @FindBy(xpath = "//h3[text()='Select cancel reason']")
    public WebElement selectCancelReasonTab;

    //-- 1806- Cancel sekmesindeki Reason textbox'inin aktif oldugu ve send butonuna tiklaninca girilen order'in iptal edildigi dogrulanmali.
    @FindBy(xpath = "(//input[@class='nice-select-search'])[2]")
    public WebElement reasonBox;
    @FindBy(xpath = "//button[text()='Send']")
    public WebElement sendButton;
    @FindBy(xpath = "Yok") //Dikkat 3. urunun iptal buttonu ve tiklayinca iptal oldu
    public WebElement cancelOrderButton3;
    @FindBy(xpath = "Yok")
    public WebElement sendButton3;
    @FindBy(xpath = "//a[text()='Order Cancelled']") //Dikkat 3. urunun iptal buttonu
    public WebElement orderCancelledButton3;

    //-- 1807- Order Details sayfasinda ürünle ilgili Shipping Info, Billing Info, Payment Info bilgilerine erisilebilir oldugu dogrulanmali
    @FindBy(xpath = "//h4[text()='Shipping Info ']")
    public WebElement detailsShippingInfo;
    @FindBy(xpath = "//h4[text()='Billing Info ']")
    public WebElement detailsBillingInfo;
    @FindBy(xpath = "//h4[text()='Payment Info ']")
    public WebElement detailsPaymentInfo;


    // ==================== MY WALLET   =======================>>>
    // 1901- Dashboard sayfasinda bulunan side bar'daki My Wallet linkinin Wallet sayfasina yönlendirdigi dogrulanmali.
    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/wallet/customer/my-wallet-index']")
    public WebElement myWalletLink;

    @FindBy(xpath = "")   //a[text()='Cancel Order']
    public WebElement Button;









//h4[text()='My Wallet']               myWalletTitle buraya geldigi 1901

    //span[text()='Total Balance']     gorunurlugu 1902
    //h4[text()='Running Balance']
    //h4[text()='Pending Balance']

    //span[text()='Recharge Wallet']   gorunurlugu   tiklayinca da 1903
    //h3[text()='Recharge Amount']     gorunurlugu

    //input[@id='recharge_amount'] EnterRechargeAmountBox  varoldugu 1904

    //h5[text()='Cancel']    cancel butonunun goruldugu ve tiklayinca iptal ettigi
    //h4[text()='Wallet Recharge History']


    // url   https://trendlifebuy.com/wallet/customer/my-wallet-index







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


}

