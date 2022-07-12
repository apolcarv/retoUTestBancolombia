package uTest.Bancolombia.Interaction;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import uTest.Bancolombia.helpers.Constant;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static uTest.Bancolombia.ui.home.HomeUi.BUTTON_JOIN_TODAY;
import static uTest.Bancolombia.ui.home.HomeUi.VALID_LOGO_HOME;

public class JoinTodayTask implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(VALID_LOGO_HOME, isVisible()).forNoMoreThan(Constant.SHORT).seconds(),Click.on(BUTTON_JOIN_TODAY));
    }
    public static JoinTodayTask toAccess(){
        return new JoinTodayTask();
    }
}
