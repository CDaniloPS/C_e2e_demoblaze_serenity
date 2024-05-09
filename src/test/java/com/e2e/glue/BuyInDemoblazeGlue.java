package com.e2e.glue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import com.e2e.tasks.*;
import com.e2e.ui.HomeForm;

@Slf4j
public class BuyInDemoblazeGlue {

    @Managed
    WebDriver driver;

    private WebDriver navegador;

    private Actor guest = Actor.named("Guest");
    private HomeForm homeForm = new HomeForm();

    @Given("what Guest enter to the home page")
    public void whatGuestEnterToTheHomePage() {
        // Write code here that turns the phrase above into concrete actions
    	guest.can(BrowseTheWeb.with(navegador));
    	guest.wasAbleTo(Open.browserOn(homeForm));
    }
    
    @When("he add two products to the cart")
    public void heAddTwoProductsToTheCart() throws InterruptedException {
       	guest.attemptsTo(
                DoCompra.withActor()
        );
        guest.wasAbleTo(Open.browserOn(homeForm));
        guest.attemptsTo(
                DoCompra2.withActor()
        );
        guest.wasAbleTo(Open.browserOn(homeForm));
    }

    @And("he view to the cart")
    public void heViewToTheCart(){
    	guest.attemptsTo(
                DoVerCarrito.withActor()
        );
    	guest.attemptsTo(
                DoCarritoOk.withActor()
        );
    }

    @Then("he complete the purchase form")
    public void heCompleteThePurchaseForm() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	Thread.sleep(1000);
    	guest.attemptsTo(
                DoFormOrder.withoptions()
        );
    }
    @And("he finish Checkout")
    public void heFinishCheckout() throws InterruptedException{
        Thread.sleep(1000);
    	guest.attemptsTo(
                DoFinaliza.withoptions()
        );
    }

}
