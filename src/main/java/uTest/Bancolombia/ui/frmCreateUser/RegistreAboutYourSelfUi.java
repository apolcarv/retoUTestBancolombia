package uTest.Bancolombia.ui.frmCreateUser;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistreAboutYourSelfUi extends PageObject {

    public static final Target VALID_FORM_PAGE1 = Target.the("validate form of the page 1")
            .located(By.xpath("//span[@class='sub-title']"));

    public static final Target INPUT_FIRST_NAME = Target.the("fill field firts name")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("fill field last  name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("fill field email address")
            .located(By.id("email"));

    public static final Target COMBO_BOX_LENGUAGES = Target.the("Select preferent lenguages")
            .located(By.xpath("//input[@type='search']"));

    public static final Target BUTTON_NEXT_PAGE1 = Target.the("clic button next")
            .located(By.xpath("//a[@class='btn btn-blue']"));

    private static List<WebElement> locatorListYear() {
        String xpath = "//*[@id='birthYear']/option";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    private static List<WebElement> locatorListMonth() {
        String xpath = "//*[@id='birthMonth']/option";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    private static List<WebElement> locatorListDay() {
        String xpath = "//*[@id='birthDay']/option";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    private static List<WebElement> languagesList() {
        String xpath = "//div[@ng-bind-html='language.name | highlight: $select.search']";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static List<WebElement> getlocatorListYear() {
        return locatorListYear();
    }

    public static List<WebElement> getlocatorListMonth() {
        return locatorListMonth();
    }

    public static List<WebElement> getlocatorListDay() {
        return locatorListDay();
    }

    public static List<WebElement> getLocatorLanguagesList(){
        return languagesList();
    }

}
