package com.co.choucair.stepdefinitions;

import com.co.choucair.models.CheckOutData;
import com.co.choucair.questions.ValidateTitleFinishBuy;
import com.co.choucair.tasks.AddProduct;
import com.co.choucair.tasks.FinishTheBuy;
import com.co.choucair.tasks.InputDataCheckout;
import com.co.choucair.tasks.ProceedToCheckout;
import com.co.choucair.utils.KillBrowser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

import java.io.IOException;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class BuyProductStepDefinition {

    @After
    public static void CloseDriver() throws IOException, InterruptedException {
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
    }

    @Given("I add a product to the cart")
    public void iAddAProductToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProduct.inTheCart()
        );
    }

    @And("we proceed to checkout")
    public void weProceedToCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ProceedToCheckout.inTheCart()
        );
    }

    @When("I am adding the details for the purchase.")
    public void iAmAddingTheDetailsForThePurchase(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InputDataCheckout.inTheBuy(CheckOutData.data(dataTable))
        );
    }

    @And("I complete the purchase")
    public void iCompleteThePurchase() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FinishTheBuy.inTheBuy()
        );
    }
    @Then("validate completion text (.*)$")
    public void validateCompletionTextThankYouForYourOrder(String text) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateTitleFinishBuy.inThePage(), equalTo(text)) );
    }

}
