package com.e2e.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
//@DefaultUrl("https://www.saucedemo.com/checkout-step-two.html")
import org.openqa.selenium.WebElement;
public class FinalizaForm extends PageObject

{
String msg ="Thank you for your purchase!";
    public static By CONFIRM_TEXT= By.xpath("/html/body/div[10]/h2");
    public static By CONFIRM_BUTTON= By.xpath("/html/body/div[10]/div[7]/div/button");

    public static final Target OVERVIEW_MESSAGE = Target.the("Checkout: Overview").located(By.className("title"));
    public static final Target COMPLETE_MESSAGE = Target.the("Thank you for your order").located(By.xpath("//div[2]/div/div/h1"));
   
}
