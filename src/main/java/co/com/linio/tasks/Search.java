package co.com.linio.tasks;

import co.com.linio.userinterfaces.LinioHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Open;


public class Search implements Task {


    private String product;

    public Search(String product) {
        super();
        this.product = product;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(product).into(LinioHomePage.SEARCH_BAR));
        actor.attemptsTo(Click.on(LinioHomePage.SEARCH_BUTTON));
    }

    public static Search TheProduct(String product) {
        // TODO Auto-generated method stub
        return Tasks.instrumented(Search.class, product);
    }




}
