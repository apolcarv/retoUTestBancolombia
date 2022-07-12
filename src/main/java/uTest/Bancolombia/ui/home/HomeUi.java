package uTest.Bancolombia.ui.home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUi extends PageObject {

    public static final Target VALID_LOGO_HOME = Target.the("validate the image in the house")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__logo navbar-brand hidden-xs']//img[@alt='uTest home page']"));

    public static final Target BUTTON_JOIN_TODAY = Target.the("click in the Button join today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    public static final Target VALIDATE_TEXT_ACCOUNT_CREATED = Target.the("validate the account created with success")
            .located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freelance software testers!\")]"));

}
