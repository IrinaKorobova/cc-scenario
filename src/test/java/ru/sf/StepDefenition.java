package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class StepDefenition {

    private static final WebDriver webdriver;
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\сс-scenario\\src\\test\\resources\\chromedriver.exe");
        webdriver =  new ChromeDriver();
    }

    @Given("url of NL {string}")
    public void url_of_nl(String url) {
        webdriver.get(url);
    }

    @When("open online store")
    public void open_online_store() {
        webdriver.findElement(By.className("info-buttons__item")).click();
    }
    @Then("website is open start search {string}")
    public void website_is_open_start_search(String searchParam) {
        WebElement searchField = webdriver.findElement(By.className("ns-input"));
        searchField.sendKeys(searchParam);
        searchField.submit();
    }
    @Then("assert that user got message {string}")
    public void assert_that_user_got_message(String errorMassage) {
        final var actualMassage = webdriver.findElement(By.className("base-title")).getText();
        Assert.assertEquals(errorMassage, actualMassage);
    }


}
