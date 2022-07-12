package uTest.Bancolombia.ui.frmCreateUser;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterLastStepUi extends PageObject {


    public static final Target VALID_FORM_PAGE4 = Target.the("validate form of the page 4")
            .located(By.xpath("//span[@class='sub-title']"));

    public static final Target INPUT_INSERT_PASSWORD= Target.the("Create your uTest password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD= Target.the("Insert your uTest confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_BOX_STAY_INFORMED = Target.the("click check box stay informed")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));

    public static final Target CHECK_BOX_TERMS_OF_USE = Target.the("click check box terms of use the uTest")
            .located(By.id("termOfUse"));

    public static final Target CHECK_BOX_PRIVACY_SECURITY_POLICY = Target.the("click check box Accept privacy & security policy")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_NEXT_PAGE4 = Target.the("clic button next")
            .located(By.id("laddaBtn"));
}
