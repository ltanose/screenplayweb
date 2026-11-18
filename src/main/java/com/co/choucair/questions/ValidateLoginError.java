package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.choucair.userinterfaces.SauceLoginPage.TXT_ERROR_VALIDATION;

public class ValidateLoginError implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TXT_ERROR_VALIDATION.resolveFor(actor).getText();
    }

    public static ValidateLoginError of(){
        return new ValidateLoginError();
    }
}
