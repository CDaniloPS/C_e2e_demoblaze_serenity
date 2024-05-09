package com.e2e.ui;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoForm extends PageObject {
	public static By SEARCH_CART = By.xpath("//*[@id=\"cartur\"]");
	public static By PLACE_ORDER_BUTTON= By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
}
