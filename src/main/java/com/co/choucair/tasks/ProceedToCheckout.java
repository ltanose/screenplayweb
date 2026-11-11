package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.ProceedToCheckoutPage.CHECKOUT_BUTTON;

public class ProceedToCheckout implements Task {

    public static ProceedToCheckout inTheCart() {
        return Tasks.instrumented(ProceedToCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CHECKOUT_BUTTON, WebElementStateMatchers
                        .isClickable()).forNoMoreThan(2).seconds(),
                Click.on(CHECKOUT_BUTTON)
        );

    }
}
