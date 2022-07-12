package uTest.Bancolombia.question.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import uTest.Bancolombia.helpers.Constant;
import uTest.Bancolombia.helpers.Time;

import static uTest.Bancolombia.ui.home.HomeUi.VALIDATE_TEXT_ACCOUNT_CREATED;

public class CreateUserQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        Time.waiting(Constant.INTERMEDIATE);
        String getTextOfThePageHome = Text.of(VALIDATE_TEXT_ACCOUNT_CREATED).answeredBy(actor);
        if(getTextOfThePageHome != null && getTextOfThePageHome.equals(Constant.TEXT_A_VALID)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
    public static CreateUserQuestion accountCreatedSuccess(){
        return new CreateUserQuestion();
    }
}
