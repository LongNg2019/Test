package StepDefinitions;

import com.Airbnb.pages.HomePage;
import com.Airbnb.pages.SignupPage;
import com.Airbnb.pages.SignupwithEmailPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.CommonMethods;
import utils.TestBase;

public class SignupwithEmailTest {
	

	private static final String May = null;

	@Given("^user is on Airbnb page$")
	public void user_is_on_Airbnb_page() throws Throwable {
	   TestBase.setUp();
	
	}

	@When("^user clicks on Sign-up button$")
	public void user_clicks_on_Sign_up_button() throws Throwable {
		HomePage.signUpButton().click();
	}

	@When("^user clicks on Signup with email$")
	public void user_clicks_on_Signup_with_email() throws Throwable {
		SignupPage.signUpwithEmail().click();
		
	}

	@When("^user enters all the required information$")
	public void user_enters_all_the_required_information() throws Throwable {
		CommonMethods.sendText(SignupwithEmailPage.emailAddress("longnguyen9105@gmail.com"));
		CommonMethods.sendText(SignupwithEmailPage.firstNameBox("long"));
		CommonMethods.sendText(SignupwithEmailPage.lastNameBox("nguyen"));
		CommonMethods.selectValueFromDD(SignupwithEmailPage.birthdayMonth(May));
		CommonMethods.selectValueFromDD(SignupwithEmailPage.birthdayDay(13));
		CommonMethods.selectValueFromDD(SignupwithEmailPage.birthdayYear(1991));

	}

	@When("^user click on Sign up button$")
	public void user_click_on_Sign_up_button() throws Throwable {
		SignupwithEmailPage.submitButton().click();
	}

	@Then("^user is successfully signed up$")
	public void user_is_successfully_signed_up() throws Throwable {
	   
	}

}