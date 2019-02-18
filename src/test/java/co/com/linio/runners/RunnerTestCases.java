package co.com.linio.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/feature/addproduct.feature",
        glue = "co.com.linio.stepdefinitions",
        tags = {
                "@addproduct"
        },
        snippets = SnippetType.CAMELCASE

)

public class RunnerTestCases {

}
