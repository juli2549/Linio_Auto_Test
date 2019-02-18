package co.com.linio.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import co.com.linio.userinterfaces.LinioHomePage;


public class OpenThe implements Task {

    private LinioHomePage linioHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(linioHomePage));
    }

    public static OpenThe Application() {
        // TODO Auto-generated method stub
        return Tasks.instrumented(OpenThe.class);
    }

}
