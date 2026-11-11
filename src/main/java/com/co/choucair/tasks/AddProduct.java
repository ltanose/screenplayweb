package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.co.choucair.userinterfaces.AddProductPage.CART_BUTTON;
import static com.co.choucair.userinterfaces.AddProductPage.PRODUCT_BUTTON;

public class AddProduct implements Task {

    public static AddProduct inTheCart() {
        return Tasks.instrumented(AddProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(PRODUCT_BUTTON, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(2).seconds(),
                Click.on(PRODUCT_BUTTON),
                WaitUntil.the(CART_BUTTON, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(5).seconds(),
                Click.on(CART_BUTTON)
        );
    }
}
