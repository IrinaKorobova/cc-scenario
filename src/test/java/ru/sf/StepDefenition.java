package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertThrows;


public class StepDefenition {
    private static final WebDriver webDriver;
    private static final HomePage homePage;
    private static final HomePageOnlineStore homePageOnlineStore;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\сс-scenario\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
        homePageOnlineStore = new HomePageOnlineStore(webDriver);
    }

    @Given("url of NL {string}")
    public void url_of_nl(String url) {
        homePage.go(url);
    }

    @When("open online store")
    public void open_online_store() {
        homePage.openOnlineStore();
    }

    @Then("website is open start search {string}")
    public void website_is_open_start_search(String searchParam) {
        homePageOnlineStore.searchGoods(searchParam);
    }

    @Then("assert that user got Image goods not found")
    public void assert_that_user_got_image_goods_not_found() {
        homePageOnlineStore.errorImage();
    }
}