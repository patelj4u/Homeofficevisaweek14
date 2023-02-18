package gov.uk.check.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;
import org.testng.Assert;

public class MyStepdefs {
    @Given("^User on Home Page$")
    public void userOnHomePage() {
    }

    @When("^I click Accecpt Cookies$")
    public void iClickAccecptCookies() {
        new StartPage().clickOnAccecptCookies();
    }

    @And("^I click start Button$")
    public void iClickStartButton() {
        new StartPage().clickStartNow();
    }

    @And("^I select from dropdown Nationality as \"([^\"]*)\"$")
    public void iSelectFromDropdownNationalityAs(String country)  {
        new StartPage().setCountryDropDown(country);
    }


    @And("^I click on continue button$")
    public void iClickOnContinueButton1() {
        new StartPage().clickOnContinue();
    }

    @And("^I select reasonfortravel$")
    public void iSelectReasonfortravel() {
        new ReasonForTravelPage().clickOnTourism();
    }
    @And("^I click on Continue button$")
    public void iClickOnContinueButton() {
        new ReasonForTravelPage().setClickcontinue();
    }

    @Then("^I Can see the result \"([^\"]*)\"$")
    public void iCanSeeTheResult(String msg)  {
        Assert.assertEquals(msg,new ResultPage().verifyText());

    }

    @And("^I select reason for travel for work$")
    public void iSelectReasonForTravelForWork() {
        new ReasonForTravelPage().clickVisitList();
    }
    @And("^I click next stepbutton$")
    public void iClickNextStepbutton() {
        new ReasonForTravelPage().clickNextStepButton();
    }

    @And("^I select length of stay$")
    public void iSelectLengthOfStay() {
        new DurationOfStayPage().setMoreThanSixMonthsLengthOfStay();
    }

    @And("^I cilck next step button$")
    public void iCilckNextStepButton() {
        new DurationOfStayPage().clickNextStepButton();
    }

    @And("^I select Type of job$")
    public void iSelectTypeOfJob() {
        new ReasonForTravelPage().setReasonForVisitList();
    }

    @And("^I click Next stpe button$")
    public void iClickNextStpeButton() {
        new ReasonForTravelPage().setClickcontinue();
    }

    @Then("^I can see the Result \"([^\"]*)\" successfully$")
    public void iCanSeeTheResultSuccessfully(String text)  {
        Assert.assertEquals(text,new ResultPage().verifyResultText());
    }

    @And("^I select from dropdown reason for stay with partner or family$")
    public void iSelectFromDropdownReasonForStayWithPartnerOrFamily() {
        new ReasonForTravelPage().setReasonForVisitList1();
    }

    @And("^I select on YES FOR FAMILY VISA STATUS$")
    public void iSelectOnYESFORFAMILYVISASTATUS() {
        new FamilyImmigrationStatusPage().immigrationstatus();
    }

    @And("^I click Next step button$")
    public void iClickNextStepButton() {
        new FamilyImmigrationStatusPage().selectImmigrationStatus1();
    }


    @Then("^I can see the result message \"([^\"]*)\"$")
    public void iCanSeeTheResultMessage(String msg)  {
        Assert.assertEquals(msg,new ResultPage().verifyResultText2());
    }


}

