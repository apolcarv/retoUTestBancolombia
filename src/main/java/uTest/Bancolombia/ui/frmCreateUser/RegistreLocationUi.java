package uTest.Bancolombia.ui.frmCreateUser;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistreLocationUi extends PageObject {


    public static final Target VALID_FORM_PAGE2 = Target.the("validate form of the page 2")
            .located(By.xpath("//span[@class='sub-title']"));
    public static final Target INPUT_CITY = Target.the("insert name city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("insert name city")
            .located(By.id("zip"));
    public static final Target BUTTON_NEXT_PAGE2 = Target.the("clic button next")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
