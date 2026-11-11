package com.co.choucair.tasks;

import com.co.choucair.models.UserLoginData;
import com.co.choucair.userinterfaces.SauceLoginPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    UserLoginData userLoginData;

    public Login(UserLoginData userLoginData) {
        this.userLoginData = userLoginData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SauceLoginPage.TXT_USER, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(userLoginData.getUser()).into(SauceLoginPage.TXT_USER),
                Enter.theValue(userLoginData.getPass()).into(SauceLoginPage.TXT_PASS),
                JavaScriptClick.on(SauceLoginPage.BTN_SUBMIT),
                WaitUntil.the(SauceLoginPage.TXT_VALIDATION, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static Login onTheSite(UserLoginData userLoginData){
        return Instrumented.instanceOf(Login.class).withProperties(userLoginData);
    }
}
