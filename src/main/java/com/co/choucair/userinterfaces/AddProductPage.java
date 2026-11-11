package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddProductPage {

    public static final Target PRODUCT_BUTTON = Target.the("click in te button product")
            .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target CART_BUTTON = Target.the("click in te button cart")
            .located(By.id("shopping_cart_container"));
}
