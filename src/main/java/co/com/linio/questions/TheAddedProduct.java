package co.com.linio.questions;
import co.com.linio.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

public class TheAddedProduct implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        //return Text.of(CartPage.TITLE_PRODUCT_ADDED).viewedBy(actor).asString();
        return Visibility.of(CartPage.TITLE_PRODUCT_ADDED).viewedBy(actor).asBoolean();
    }


    public static TheAddedProduct isVisibleInThePageCart() {
        return new TheAddedProduct();
    }
}
