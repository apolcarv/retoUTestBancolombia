package uTest.Bancolombia.task.frmCreateUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import uTest.Bancolombia.helpers.Utils;
import static uTest.Bancolombia.ui.frmCreateUser.RegiserDevicesUi.*;


public class RegisterDevices implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_YOUR_MOBILE_DECIVE));
        Utils.selectYourMobileDevices();
        actor.attemptsTo(Click.on(INPUT_MODEL));
        Utils.selectModelList();
        actor.attemptsTo(Click.on(INPUT_OPERATING_SYSTEM));
        Utils.selectOperatingSystemList();
        actor.attemptsTo(Click.on(BUTTON_NEXT_PAGE3));
    }
    public static Performable fillFormPage3(){
        return Tasks.instrumented(RegisterDevices.class);
    }
}
