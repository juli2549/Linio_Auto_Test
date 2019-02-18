package co.com.linio.tasks;

import co.com.linio.userinterfaces.LinioHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;


public class Select implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LinioHomePage.SELECTED_PRODUCT));
    }

    public static Select TheProduct() {
        // TODO Auto-generated method stub
        return Tasks.instrumented(Select.class);
    }




}
