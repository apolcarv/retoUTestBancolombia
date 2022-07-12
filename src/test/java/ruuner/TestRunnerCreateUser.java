package ruuner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/feature/createuser.feature"}
        , glue = {"stepDefinition"}
        , tags = "@stories"
        , snippets =  CucumberOptions.SnippetType.CAMELCASE)
public class TestRunnerCreateUser {
}
