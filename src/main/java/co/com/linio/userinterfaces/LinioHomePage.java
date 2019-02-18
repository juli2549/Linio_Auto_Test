package co.com.linio.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import org.apache.tools.ant.taskdefs.Tar;


@DefaultUrl("https://www.linio.com.co")
public class LinioHomePage extends PageObject {
    public static final Target SEARCH_BAR = Target.the("Search bar").located(By.name("q"));
    public static final Target SEARCH_BUTTON = Target.the("Search Button").locatedBy("//div[@class='input-group-btn']/button[1]");
    public static final Target SELECTED_PRODUCT = Target.the("Selected Product").locatedBy("//div[@class='catalogue-product-section col-lg-10 col-md-9']/div[2]/div[4]/a");
    public static final Target TITLE_PRODUCT = Target.the("Title of product").locatedBy("//div[@class='product-title col-xs-12']/h1/span");
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart Button").locatedBy("//div[@class='product-bg-container product-general-info variation-info']//button[1]");
    public static final Target GO_TO_CART = Target.the("Add to cart Button").locatedBy("//a[contains(text(),'Ir al carrito')]");

}
