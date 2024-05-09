package com.e2e.ui;

import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;

public class SearchForms extends PageObject {
    public static By SEARCH_ITEM_1 = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    public static By ADD_ITEM_1 = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    public static By SEARCH_ITEM_2 = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a");
    public static By ADD_ITEM_2 = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    public static By SEARCH_CART = By.xpath("//*[@id=\"cartur\"]");
}