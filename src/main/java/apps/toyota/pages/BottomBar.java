package apps.toyota.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.orasi.core.interfaces.impl.internal.ElementFactory;
import com.orasi.utils.PageLoaded;
import com.orasi.core.interfaces.*;

public class BottomBar{

    private final String xpathLoc = "//ul[@name='tcom-footer-links-list']/li/a[contains(text(), '";

    @FindBy(xpath = xpathLoc + "Trade-In Value')]")
    private Link tradeInValue;

    @FindBy(xpath = xpathLoc + "Build Your Toyota')]")
    private Link buildYourToyota;

    @FindBy(xpath = xpathLoc + "Search Inventory')]")
    private Link searchInventory;

    @FindBy(xpath = xpathLoc + "Find A Dealer')]")
    private Link findADealer;

    @FindBy(xpath = xpathLoc + "Local Specials')]")
    private Link localSpecials;

    @FindBy(xpath = xpathLoc + "Request AQuote')]")
    private Link requestAQuote;

    @FindBy(xpath = xpathLoc + "Accessories')]")
    private Link accessories;

    @FindBy(xpath = xpathLoc + "Find Your Match')]")
    private Link findYourMatch;

    @FindBy(xpath = xpathLoc + "Notebook')]")
    private Link notebook;

    @FindBy(xpath = xpathLoc + "Toyota Certified Used Vehicles')]")
    private Link toyotaCertifiedUsedVehicles;

    @FindBy(xpath = xpathLoc + "Careers')]")
    private Link careers;

    @FindBy(xpath = xpathLoc + "Our Company')]")
    private Link ourCompany;

    @FindBy(xpath = xpathLoc + "Toyota USA Newsroom')]")
    private Link toyotaUsaNewsroom;

    @FindBy(xpath = xpathLoc + "Toyota Worldwide')]")
    private Link toyotaWorldwide;

    @FindBy(xpath = xpathLoc + "Toyota Racing')]")
    private Link toyotaRacing;

    @FindBy(xpath = xpathLoc + "TRD USA')]")
    private Link trdUsa;

    @FindBy(xpath = xpathLoc + "All Toyota Vehicles')]")
    private Link allToyotaVehicles;

    @FindBy(xpath = xpathLoc + "SUVs')]")
    private Link suvs;

    @FindBy(xpath = xpathLoc + "Trucks')]")
    private Link trucks;

    @FindBy(xpath = xpathLoc + "Cars')]")
    private Link cars;

    @FindBy(xpath = xpathLoc + "Crossovers')]")
    private Link crossovers;

    @FindBy(xpath = xpathLoc + "Hybrids & Evs')]")
    private Link hybridsAndEvs;

    @FindBy(xpath = xpathLoc + "Hybrid Cars')]")
    private Link hybridCars;

    @FindBy(xpath = xpathLoc + "Hybrid Suvs')]")
    private Link hybridSuvs;

    @FindBy(xpath = xpathLoc + "Upcoming Vehicles')]")
    private Link upcomingVehicles;

    @FindBy(xpath = xpathLoc + "Concept Vehicles')]")
    private Link conceptVehicles;

    @FindBy(xpath = xpathLoc + "TRD Pro Series')]")
    private Link trdProSeries;

    @FindBy(xpath = xpathLoc + "Espanol')]")
    private Link espanol;

    @FindBy(xpath = xpathLoc + "Toyota Financial Services')]")
    private Link toyotaFinancialServices;

    @FindBy(xpath = xpathLoc + "Toyota Rent A Car')]")
    private Link toyotaRentACar;

    @FindBy(xpath = xpathLoc + "Mobile Phone Compatability')]")
    private Link mobilePhoneCompatability;

    @FindBy(xpath = xpathLoc + "Toyota Mobility Feature')]")
    private Link toyotaMobilityFeature;

    @FindBy(xpath = xpathLoc + "Entune')]")
    private Link entune;

    @FindBy(xpath = xpathLoc + "Car Tips & Advice')]")
    private Link carTipsAndAdvice;

    @FindBy(xpath = xpathLoc + "Dealers')]")
    private Link dealers;

    @FindBy(xpath = xpathLoc + "Safety Recalls & Service Campaigns')]")
    private Link safetyRecallsAndServiceCampaigns;

    @FindBy(xpath = xpathLoc + "Contact Us')]")
    private Link contactUs;

    @FindBy(xpath = xpathLoc + "Faqs')]")
    private Link faqs;

    @FindBy(xpath = xpathLoc + "Privacy Policy')]")
    private Link privacyPolicy;

    @FindBy(xpath = xpathLoc + "Legalterms')]")
    private Link legalterms;

    @FindBy(xpath = xpathLoc + "Site Map')]")
    private Link siteMap;

    @FindBy(xpath = xpathLoc + "AdChoices')]")
    private Link adChoices;

    @FindBy(xpath = xpathLoc + "View All Disclosures')]")
    private Link viewAllDisclosures;

    @FindBy(xpath = "//input[@class='tcom-nav-search-input']")
    private Textbox search;

    @FindBy(xpath = xpathLoc + "Sign Up For Toyota Updates')]")
    private Link signUpForToyotaUpdates;

    @FindBy(className = "tcom-social-facebook")
    private Link facebook;

    @FindBy(className = "tcom-social-youtube")
    private Link youtube;

    @FindBy(className = "tcom-social-twitter")
    private Link twitter;

    @FindBy(className = "tcom-social-googleplus")
    private Link googlePlus;

    @FindBy(className = "tcom-social-instagram")
    private Link instagram;

    private WebDriver driver;

    public BottomBar(WebDriver driver){
        this.driver = driver;
        ElementFactory.initElements(driver, this);
    }

    public boolean pageLoaded(){
        return new PageLoaded().isPageHTMLLoaded(this.getClass(), driver, faqs);
    }

    public boolean pageLoaded(Element element){
        return new PageLoaded().isPageHTMLLoaded(this.getClass(), driver, element);
    }

    public BottomBar initialize(){
        return ElementFactory.initElements(driver, this.getClass());
    }

}