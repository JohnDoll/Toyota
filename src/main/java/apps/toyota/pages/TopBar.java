package apps.toyota.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.orasi.core.interfaces.impl.internal.ElementFactory;
import com.orasi.utils.PageLoaded;
import com.orasi.core.interfaces.*;

public class TopBar{

    @FindBy(xpath = "//button/span[contains(text(), 'Your Location:')]")
    private Button btnYourLocation;

    @FindBy(linkText = "Notebook")
    private Link lnkNotebook;

    @FindBy(linkText = "Certified Used Vehicles")
    private Link lnkCertUsedVehicles;

    @FindBy(linkText = "Owners")
    private Link lnkOwners;

    @FindBy(linkText = "Español")
    private Link lnkEspanol;

    @FindBy(xpath = "//button/span[contains(text(), 'Search')]")
    private Button btnSearch;

    @FindBy(xpath = "//button/span[contains(text(), 'Select Vehicle')]")
    private Button btnSelectVehicle;

    @FindBy(xpath = "//button/span[contains(text(), 'Shopping Tools')]")
    private Button btnShoppingTools;

    @FindBy(linkText = "Find a Dealer")
    private Link lnkFindDealer;

    @FindBy(linkText = "Build & Price")
    private Link lnkBuildAndPrice;

    @FindBy(linkText = "Local Specials")
    private Link lnkLocalSpecials;

    private WebDriver driver;

    public TopBar(WebDriver driver){
        this.driver = driver;
        ElementFactory.initElements(driver, this);
    }

    public boolean pageLoaded(){
        return new PageLoaded().isPageHTMLLoaded(this.getClass(), driver, btnSearch);
    }

    public boolean pageLoaded(Element element){
        return new PageLoaded().isPageHTMLLoaded(this.getClass(), driver, element);
    }

    public TopBar initialize(){
        return ElementFactory.initElements(driver, this.getClass());
    }

}