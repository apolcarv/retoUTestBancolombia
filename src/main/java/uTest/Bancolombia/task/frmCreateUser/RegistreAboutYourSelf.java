package uTest.Bancolombia.task.frmCreateUser;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import uTest.Bancolombia.helpers.Constant;
import uTest.Bancolombia.helpers.Date;
import uTest.Bancolombia.helpers.Utils;

import java.util.Locale;
import java.util.Random;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static uTest.Bancolombia.ui.frmCreateUser.RegistreAboutYourSelfUi.*;

public class RegistreAboutYourSelf implements Task {
    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(VALID_FORM_PAGE1, isVisible()).forNoMoreThan(Constant.SHORT).seconds(),
                Enter.theValue(faker.name().firstName()).into(INPUT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(faker.name().lastName()).into(INPUT_LAST_NAME));
        String correo = faker.internet().emailAddress().replace(" ", "_");
        actor.attemptsTo(Enter.theValue(correo).into(INPUT_EMAIL_ADDRESS));
        Date.selectRandomYear();
        Date.selectRandomMonth();
        Date.selectRandomDay();
        actor.attemptsTo(Click.on(COMBO_BOX_LENGUAGES));
        Utils.selectRandomLanguages();
        actor.attemptsTo(Click.on(BUTTON_NEXT_PAGE1));
    }
    public static Performable fillFormPage1(){
        return Tasks.instrumented(RegistreAboutYourSelf.class);
    }
}
