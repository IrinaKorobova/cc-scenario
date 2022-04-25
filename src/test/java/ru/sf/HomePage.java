package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private static final String URL = "https://www.nlstar.com/ru/";
    private static final String SEARCH_FIELD_CLASS = "info-buttons__item";

    private final WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void go () {
        webDriver.get(URL);
    }

    public void openOnlineStore () {
        webDriver.findElement(By.className(SEARCH_FIELD_CLASS)).click();
    }
}
