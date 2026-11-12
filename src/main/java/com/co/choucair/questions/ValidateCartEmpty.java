package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.choucair.userinterfaces.InTheCartPage.CART_EMPTY;

public class ValidateCartEmpty implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return !CART_EMPTY.resolveAllFor(actor).isEmpty();
    }

    public static ValidateCartEmpty of(){
        return new ValidateCartEmpty();
    }
}
