package uTest.Bancolombia.task.frmCreateUser;

import com.github.javafaker.Faker;
import com.ibm.as400.access.jdbcClient.StringFormatUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import uTest.Bancolombia.helpers.Constant;
import uTest.Bancolombia.helpers.Utils;

import java.util.Locale;
import java.util.Random;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static uTest.Bancolombia.ui.frmCreateUser.RegisterLastStepUi.*;


public class RegisterLastStep implements Task {
    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    @Override
    public <T extends Actor> void performAs(T actor) {
        String pwd = Utils.decode64(Utils.getPassword().get(Constant.ZERO));
        actor.attemptsTo(WaitUntil.the(VALID_FORM_PAGE4, isVisible()).forNoMoreThan(Constant.SHORT).seconds(),
                Enter.theValue(pwd).into(INPUT_INSERT_PASSWORD),
                Enter.theValue(pwd).into(INPUT_CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(CHECK_BOX_STAY_INFORMED),
                Click.on(CHECK_BOX_TERMS_OF_USE),
                Click.on(CHECK_BOX_PRIVACY_SECURITY_POLICY));
        actor.attemptsTo(Click.on(BUTTON_NEXT_PAGE4));
    }
    public static Performable fillFormPage4(){
        return Tasks.instrumented(RegisterLastStep.class);
    }
}
