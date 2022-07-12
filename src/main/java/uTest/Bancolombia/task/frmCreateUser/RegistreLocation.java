package uTest.Bancolombia.task.frmCreateUser;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import uTest.Bancolombia.helpers.Constant;
import uTest.Bancolombia.helpers.Utils;
import java.awt.*;
import java.awt.event.KeyEvent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static uTest.Bancolombia.ui.frmCreateUser.RegistreLocationUi.*;

public class RegistreLocation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(VALID_FORM_PAGE2, isVisible()).forNoMoreThan(Constant.SHORT).seconds(),
                Enter.theValue(Utils.generateCities().get(Constant.ZERO)).into(INPUT_CITY));
        Robot robot = null;
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Enter.theValue(Constant.POSTAL_CODE).into(INPUT_POSTAL_CODE));
        actor.attemptsTo(Click.on(BUTTON_NEXT_PAGE2));
    }
    public static Performable fillFormPage2(){
        return Tasks.instrumented(RegistreLocation.class);
    }
}
