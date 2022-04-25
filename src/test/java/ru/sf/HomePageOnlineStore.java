package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageOnlineStore {

    private final WebDriver webDriver;

    public HomePageOnlineStore(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void searchGoods (String goodName) {
        WebElement searchField = webDriver.findElement(By.className("ns-input"));
        searchField.sendKeys(goodName);
        searchField.submit();
    }

}
