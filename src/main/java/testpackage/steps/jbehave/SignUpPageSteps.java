package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import testpackage.steps.serenity.SignUpSteps;

public class SignUpPageSteps {

    @Steps
    SignUpSteps steps;

    @Given("I open signup page")
    public void openPage() {
        steps.open_signup_page();
    }

    @When("I close cookies warning")
    public void closeCookiesWarning() {
        steps.close_cookies_warning();
    }

    @When("I set month \"$month\"")
    public void setMonth(String month) {
        steps.set_month(month);
    }

    @When("I set day \"$day\"")
    public void setDay(String day) {
        steps.type_day(day);
    }

    @When("I set year \"$year\"")
    public void setYear(String year) {
        steps.type_year(year);
    }

    @When("I check share")
    public void checkShare() {
        steps.set_share(true);
    }

    @When("I uncheck share")
    public void uncheckShare() {
        steps.set_share(false);
    }

    @When("I press signup button")
    public void pressSignUpButton() {
        steps.press_signup_button();
    }

    @When("I type email \"$email\"")
    public void typeEmail(String email) {
        steps.type_email(email);
    }

    @When("I type confirmation email \"$email\"")
    public void typeConfirmationEmail(String email) {
        steps.type_confirmation_email(email);
    }

    @When("I type name \"$name\"")
    public void typeName(String name) {
        steps.type_name(name);
    }

    @When("I set gender \"$gender\"")
    public void setGender(String gender) {
        steps.type_year(gender);
    }

    @When("I type password \"$password\"")
    public void typePassword(String password) {
        steps.type_password(password);
    }

    @Then("I see error \"$errorMessage\"")
    public void shouldSeeErrorMessage(String errorMessage) {
        steps.should_see_error(errorMessage);
    }

    @Then("I do not see error \"$errorMessage\"")
    public void shouldNotSeeErrorMessage(String errorMessage) {
        steps.should_not_see_error(errorMessage);
    }

    @Then("Errors quantity on the page should be \"$number\"")
    public void errorsQuantityShouldBe(int number) {
        steps.errors_quantity_on_page_should_be(number);
    }

    @Then("I see \"$number\" error has text \"$errorMessage\"")
    public void shouldSeeErrorByNumber(int number, String errorMessage) {
        steps.should_see_error_by_number(number, errorMessage);
    }
}
