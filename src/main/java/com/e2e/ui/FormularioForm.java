package com.e2e.ui;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class FormularioForm  extends PageObject {
    //Place Order
    public static By NAME_FIELD= By.id("name");
    public static By COUNTRY_FIELD= By.id("country");
    public static By CITY_FIELD= By.id("city");
    public static By CREDIT_CART_FIELD= By.id("card");
    public static By MONTH_FIELD= By.id("month");
    public static By YEAR_FIELD= By.id("year");
    public static By PURCHASE_ORDER_BUTTON= By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
}
