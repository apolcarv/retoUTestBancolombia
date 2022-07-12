package uTest.Bancolombia.ui.frmCreateUser;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegiserDevicesUi extends PageObject {


    public static final Target BUTTON_NEXT_PAGE3 = Target.the("clic button next")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target INPUT_YOUR_MOBILE_DECIVE = Target.the("clik flied your Mobile Devices")
            .located(By.xpath("//div[@name='handsetMakerId']//span[@class='ui-select-placeholder text-muted']"));

    public static final Target INPUT_MODEL = Target.the("clik flied model")
            .located(By.xpath("//div[@name='handsetModelId']//span[@class='ui-select-placeholder text-muted']"));

    public static final Target INPUT_OPERATING_SYSTEM = Target.the("clik flied operating System")
            .located(By.xpath("//div[@name='handsetOSId']//span[@class='ui-select-placeholder text-muted']"));

    private static List<WebElement> yourMobileDevicesList() {
        String xpath = "//div[@ng-bind-html='device.name | highlight: $select.search']";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    private static List<WebElement> modelList() {
        String xpath = "//div[@ng-bind-html='model.name | highlight: $select.search']";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    private static List<WebElement> operatingSystemList() {
        String xpath = "//div[@ng-bind-html='osVersion.name | highlight: $select.search']";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static List<WebElement> getYourMobileDevicesList() {
        return yourMobileDevicesList();
    }

    public static List<WebElement> getModelList() {
        return modelList();
    }

    public static List<WebElement> getOperatingSystemList() {
        return operatingSystemList();
    }
}
