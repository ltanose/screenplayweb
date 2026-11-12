package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InTheCartPage {

    public static final Target TITTLE_PRODUCT = Target.the("name the product in the cart")
            .located(By.id("item_4_title_link"));

    public static final Target REMOVE_PRODUCT = Target.the("REMOVE the product in the cart")
            .located(By.id("remove-sauce-labs-backpack"));

    public static final Target CART_EMPTY = Target.the("cart empty")
            .located(By.xpath("//*[@class = 'removed_cart_item']"));
}
