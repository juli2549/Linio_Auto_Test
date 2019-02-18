package co.com.linio.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



public class CartPage extends PageObject {

    public static final Target TITLE_PRODUCT_ADDED = Target.the("Title of product Added").locatedBy("//div[@class='cart-item row']/div[2]/div[2]/span/a");

}
