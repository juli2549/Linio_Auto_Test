package co.com.linio.tasks;

import co.com.linio.userinterfaces.LinioHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromElement;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget.*;
import net.serenitybdd.screenplay.questions.Text;

import java.lang.annotation.Target;



public class AddTheProductTo implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.remember("productName",Text.of(LinioHomePage.TITLE_PRODUCT).toString().trim());
        //System.out.println(Text.of(LinioHomePage.TITLE_PRODUCT).toString().trim());
        actor.attemptsTo(Click.on(LinioHomePage.ADD_TO_CART_BUTTON));
        try {
            Thread.sleep(4000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        actor.attemptsTo(Click.on(LinioHomePage.GO_TO_CART));
    }

    public static AddTheProductTo TheShoppingCart() {

        return Tasks.instrumented(AddTheProductTo.class);
    }




}
