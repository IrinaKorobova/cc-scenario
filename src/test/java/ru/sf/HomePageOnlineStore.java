package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

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

    public void errorImage () {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Assert.assertTrue(webDriver.findElement(By.className("page-search__not-found-image")).isDisplayed());
    }

}
