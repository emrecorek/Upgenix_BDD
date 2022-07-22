package com.upgenix.step_definitions;

import com.upgenix.pages.Emre_UpgnxCalendarPage;
import com.upgenix.utilities.Driver;
import com.upgenix.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class Emre_Calendar_Steps {

    Emre_UpgnxCalendarPage upgnx = new Emre_UpgnxCalendarPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("user goes to the login page")
    public void userGoesToTheLoginPage() {

        Driver.getDriver().get("https://qa.upgenix.net/web/login");

    }


    @And("user enters correct credentials")
    public void userEntersCorrectCredentials(Map<String, String> credentials) {

        upgnx.emailInputBox.sendKeys(credentials.get("username"));
        upgnx.passwordInputBox.sendKeys(credentials.get("password"));
        upgnx.loginButton.click();

    }

    @And("user login successfully")
    public void userLoginSuccessfully() {

        Assert.assertTrue(upgnx.loginVerification.isDisplayed());

    }

    @Then("user clicks calendar")
    public void userClicksCalendar() {

        upgnx.calendar.click();

        Assert.assertTrue(upgnx.weekButton.getAttribute("class").contains("active"));
    }

    @Given("user on the calendar page")
    public void userOnTheCalendarPage() {

        upgnx.calendar.click();

    }

    @When("user clicks on the day section")
    public void userClicksOnTheDaySection() {

        upgnx.dayButton.click();

    }

    @And("user sees daily display")
    public void userSeesDailyDisplay() {
        WaitUtils.waitVisibilityOfElement(upgnx.loadingAlert);
        Assert.assertTrue(upgnx.dayButton.getAttribute("class").contains("active"));
    }

    @And("user clicks on the month section")
    public void userClicksOnTheMonthSection() {

        upgnx.monthButton.click();
    }

    @And("user sees monthly display")
    public void userSeesMonthlyDisplay() {
        WaitUtils.waitVisibilityOfElement(upgnx.loadingAlert);
        Assert.assertTrue(upgnx.monthButton.getAttribute("class").contains("active"));
    }

    @And("user clicks on the week section")
    public void userClicksOnTheWeekSection() {
        upgnx.weekButton.click();
    }

    @Then("user sees weekly display")
    public void userSeesWeeklyDisplay() {
        WaitUtils.waitVisibilityOfElement(upgnx.loadingAlert);
        Assert.assertTrue(upgnx.weekButton.getAttribute("class").contains("active"));
    }

    @When("user click on any time box")
    public void userClickOnAnyTimeBox() {
        upgnx.timeBox.click();
    }

    @And("user sees little create box")
    public void userSeesLittleCreateBox() {
        Assert.assertEquals("Create", upgnx.createBox.getText());
    }

    @And("user writes the summary of the event in the inbox")
    public void userWritesTheSummaryOfTheEventInTheInbox() {
        upgnx.inputCreateBox.sendKeys("lunch");
    }

    @And("user clicks on the create button and sees event")
    public void userClicksOnTheCreateButton() {
        int totalEventsBefore = upgnx.events.size();
        upgnx.createButton.click();

        WaitUtils.waitVisibilityOfElement(upgnx.loadingAlert);
        Assert.assertEquals(totalEventsBefore + 1, upgnx.events.size());
    }


    @When("user clicks on the created event")
    public void userClicksOnTheCreatedEvent() {
        WaitUtils.waitVisibilityOfElement(upgnx.loadingAlert);
        upgnx.eventBox.click();
    }

    @And("user sees event in the opening box")
    public void userSeesEventInTheOpeningBox() {
        Assert.assertTrue(upgnx.eventBoxTitle.isDisplayed());

    }

    @And("user clicks the edit button")
    public void userClicksTheEditButton() {
        upgnx.editButton.click();
    }

    @And("user sees edit box")
    public void userSeesEditBox() {
        Assert.assertTrue(upgnx.meetingSubjectInbox.isDisplayed());

    }

    @And("user writes new summary in the meeting subject inbox {string}")
    public void userWritesNewSummaryInTheMeetingSubjectInbox(String subject) {
        upgnx.meetingSubjectInbox.clear();
        upgnx.meetingSubjectInbox.sendKeys(subject);
    }


    @And("user clicks the save button")
    public void userClicksTheSaveButton() {
        upgnx.saveButton.click();
    }


    @Then("user sees the edited event name {string}")
    public void userSeesTheEditedEventName(String nameOfEvent) {
        WaitUtils.waitVisibilityOfElement(upgnx.loadingAlert);
        Assert.assertEquals(nameOfEvent,upgnx.nameOfEvent.getText());
    }


}
