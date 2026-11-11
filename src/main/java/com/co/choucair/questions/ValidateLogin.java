package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.choucair.userinterfaces.SauceLoginPage.TXT_VALIDATION;

public class ValidateLogin implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TXT_VALIDATION.resolveFor(actor).getText();
    }

    public static ValidateLogin of(){
        return new ValidateLogin();
    }
}
