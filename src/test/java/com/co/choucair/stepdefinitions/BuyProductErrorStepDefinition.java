package com.co.choucair.stepdefinitions;

import com.co.choucair.questions.ValidateErrorDataCheckOut;
import com.co.choucair.utils.KillBrowser;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

import java.io.IOException;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class BuyProductErrorStepDefinition {

    @After
    public static void CloseDriver() throws IOException, InterruptedException {
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
    }

    @Then("validate failed message (.*)$")
    public void validateFailedMessageMessage(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateErrorDataCheckOut.inTheForm(), equalTo(message)));
    }

}
