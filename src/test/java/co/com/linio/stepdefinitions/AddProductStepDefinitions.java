package co.com.linio.stepdefinitions;
/*
import com.librerianacional.certification.LibreriaNacional.exceptions.CauseResultNotWaited;
import com.librerianacional.certification.LibreriaNacional.questions.TheResultAccountPage;
import co.com.linio.tasks;
import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalHomePage;
*/
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import co.com.linio.tasks.OpenThe;
import co.com.linio.tasks.Search;
import co.com.linio.tasks.Select;
import co.com.linio.tasks.AddTheProductTo;
import co.com.linio.questions.TheAddedProduct;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class AddProductStepDefinitions {
    @Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");

    @Before
    public void InitialSetup() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that the user open the application$")
    public void thatTheUserOpenTheApplication() throws Exception {
        hisBrowser.manage().window().maximize();
        user.wasAbleTo(OpenThe.Application());
    }

    @When("^user search the product (.*)$")
    public void userSearchTheProduct(String product) {
        user.attemptsTo(Search.TheProduct(product));
    }

    @When("^user select an iPhone XR$")
    public void userSelectAnIphoneXS() {
        user.attemptsTo(Select.TheProduct());
    }

    @When("^user add the product to the shopping cart$")
    public void userAddTheProductToTheShoppingCart()  {
        user.attemptsTo(AddTheProductTo.TheShoppingCart());
    }

    @Then("^user verifies that the iphone is added in the shopping cart page$")
    public void userVerifiesThatTheIphoneIsAddedInTheShoppingCartPage() {

        user.should(seeThat(TheAddedProduct.isVisibleInThePageCart()));
    }

}

