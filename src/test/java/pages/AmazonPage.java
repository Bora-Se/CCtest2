package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement amazonAramaSonucuTest;

    @FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
    public WebElement dropDownMenu;

    // -----------------------------



    @FindBy(xpath = "//span[@class='icp-nav-link-inner']")
    public WebElement languageSection;

    @FindBy(xpath = "(//a[@href='/customer-preferences/edit?ref=icp_cop_flyout_change?preferencesReturnUrl=%2F'])[1]")
    public WebElement changeButtonChangeLanguage;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    public WebElement selectCurrencyDrop;

    @FindBy(xpath = "//input[@class='a-button-input']")
    public WebElement saveChangesButton;

    @FindBy (xpath = "(//a[@class='icp-button'])[2]")
    public WebElement usdButton;

    @FindBy (xpath = "//li[@id='TRY']")
    public WebElement tryBirimi;

    @FindBy (xpath = "(//span[text()='TRY'])[1]")
    public WebElement paraBirimiTest;


}
