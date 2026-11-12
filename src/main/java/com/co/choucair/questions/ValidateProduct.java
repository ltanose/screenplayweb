package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.choucair.userinterfaces.InTheCartPage.TITTLE_PRODUCT;


public class ValidateProduct implements Question<String> {


    public static ValidateProduct of(){
        return new ValidateProduct();
    }

    @Override
    public String answeredBy(Actor actor) {
        return TITTLE_PRODUCT.resolveFor(actor).getText();
    }
}
