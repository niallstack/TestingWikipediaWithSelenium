package com.stack.niall;

import org.openqa.selenium.By;

/**
 * Created by niall on 02/05/2017.
 */
public class WikiPage {
    //The english page link
    public static final By LOC_LNK_ENGLISHLINK = By.xpath("//a[@id='js-link-box-en']");

    //The search box
    public static final By LOC_SRCH_SEARCHBOX = By.id("searchInput");

    //Search button
    public static final By LOC_BTN_SEARCH = By.id("searchButton");

}
