package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static com.co.choucair.userinterfaces.InTheCartPage.REMOVE_PRODUCT;

public class RemoveProductCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(REMOVE_PRODUCT)
        );
    }

    public static RemoveProductCart inTheCart() {
        return Tasks.instrumented(RemoveProductCart.class);
    }
}
