package com.e2e.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.e2e.ui.FormularioForm;

public class DoFormOrder implements Task {
    
	public String name;
	public String country;
	public String city;
	public String card;
	public String month;
	public String year;

    public DoFormOrder() {
		this.name = "Guest";
		this.country = "Ecuador";
		this.city = "Quito";
		this.card = "555-44332211";
		this.month = "5";
		this.year = "25";
    }

    public static Performable withoptions(){
        return instrumented(DoFormOrder.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor)  {
        actor.attemptsTo(
                 Enter.theValue(name).into(FormularioForm.NAME_FIELD),
				 Enter.theValue(country).into(FormularioForm.COUNTRY_FIELD),
				 Enter.theValue(city).into(FormularioForm.CITY_FIELD),
                 Enter.theValue(card).into(FormularioForm.CREDIT_CART_FIELD),
                 Enter.theValue(month).into(FormularioForm.MONTH_FIELD),
                 Enter.theValue(year).into(FormularioForm.YEAR_FIELD),
            	 Click.on(FormularioForm.PURCHASE_ORDER_BUTTON)
        );
    }
}