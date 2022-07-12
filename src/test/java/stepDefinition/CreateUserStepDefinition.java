package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import uTest.Bancolombia.helpers.Constant;
import uTest.Bancolombia.question.home.CreateUserQuestion;
import uTest.Bancolombia.task.browser.OpenUp;
import uTest.Bancolombia.Interaction.JoinTodayTask;
import uTest.Bancolombia.task.frmCreateUser.RegisterDevices;
import uTest.Bancolombia.task.frmCreateUser.RegisterLastStep;
import uTest.Bancolombia.task.frmCreateUser.RegistreAboutYourSelf;
import uTest.Bancolombia.task.frmCreateUser.RegistreLocation;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUserStepDefinition {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("apolcarv wants to create an account in the Utest community")
    public void apolcarvWantsToCreateAnAccountInTheUtestCommunity() {
        theActorCalled(Constant.MR_ROBOT).wasAbleTo(OpenUp.browserURL());
    }

    @When("you completely fill out the form")
    public void youCompletelyFillOutTheForm() {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(JoinTodayTask.toAccess());
        theActorCalled(Constant.MR_ROBOT).attemptsTo(RegistreAboutYourSelf.fillFormPage1());
        theActorCalled(Constant.MR_ROBOT).attemptsTo(RegistreLocation.fillFormPage2());
        theActorCalled(Constant.MR_ROBOT).attemptsTo(RegisterDevices.fillFormPage3());
        theActorCalled(Constant.MR_ROBOT).attemptsTo(RegisterLastStep.fillFormPage4());
    }

    @Then("successfully view the created account.")
    public void successfullyViewTheCreatedAccount() {
        theActorInTheSpotlight().should(seeThat(CreateUserQuestion.accountCreatedSuccess()));
    }



}
