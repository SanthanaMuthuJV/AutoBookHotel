package org.hotelstepdefition;

import org.hotelbookingbase.BaseClassCucu;
import org.hotelpojo.POJOAdactinHotel;

import cucumber.api.java.en.When;

public class Adacitin extends BaseClassCucu {
	POJOAdactinHotel p;
	
	@When("To Launch The Url of Adacitin Appln")
	public void toLaunchTheUrlOfAdacitinAppln() {
		implicity();
		urlLanch("http://adactinhotelapp.com/");
	}

	@When("To Pass The Valid Username and Password")
	public void toPassTheValidUsernameAndPassword() {
	    p = new POJOAdactinHotel();
	    sendKeys(p.getUser(), "SANDAL2098");
	    sendKeys(p.getPass(), "I0NT66");
	}

	@When("Check Whether Submit button Click or Not")
	public void checkWhetherSubmitButtonClickOrNot() {
		clickWebElement(p.getSubmitbtn());
	}



	@When("the user has to select the location in a particular filed")
	public void theUserHasToSelectTheLocationInAParticularFiled() {
		clickWebElement(p.getLocation());
		clickWebElement(p.getSelelocation());
		
	}

	@When("the user has to choose how many children in a particular filed and click the search btn")
	public void theUserHasToChooseHowManyChildrenInAParticularFiledAndClickTheSearchBtn() {
             clickWebElement(p.getBaby());
             clickWebElement(p.getBabycount());
             clickWebElement(p.getSubmitbtn2());
             
	}

	@When("User has to select the hotelroom and cilck the continue btn")
	public void userHasToSelectTheHotelroomAndCilckTheContinueBtn() {
		clickWebElement(p.getRoomsele());
		clickWebElement(p.getContinuebtn());
	}

	@When("user has to pass firstname and lastname in particular filed")
	public void userHasToPassFirstnameAndLastnameInParticularFiled() {
		sendKeys(p.getFirstname(), "Santhana");	
		sendKeys(p.getLastname(), "Muthu");
		}

	@When("user has to give their address in particular filed")
	public void userHasToGiveTheirAddressInParticularFiled() {
		sendKeys(p.getAddress(), "T.nager Chennai");
	}

	@When("user has to pass the {int}digits credircard number and select the cardtype")
	public void userHasToPassTheDigitsCredircardNumberAndSelectTheCardtype(Integer int1) {
		sendKeys(p.getCardno(), "9876567832143456");
		clickWebElement(p.getCardtype());
		clickWebElement(p.getCardtypesele());
	}
	@When("user has to pass the expri month&year details in particular filed")
	public void userHasToPassTheExpriMonthYearDetailsInParticularFiled() {
		clickWebElement(p.getMonth());
		clickWebElement(p.getMonthsele());
		clickWebElement(p.getYear());
		clickWebElement(p.getYearsele());
		
	}

	@When("user has to give the ccv number of card and click the booknow btn")
	public void userHasToGiveTheCcvNumberOfCardAndClickTheBooknowBtn() {
		sendKeys(p.getCcvno(), "858");
		clickWebElement(p.getBooknow());
	}
	

	@When("user check whether see the order no or not , then orderno print in consloe when order no get")
	public void userCheckWhetherSeeTheOrderNoOrNotThenOrdernoPrintInConsloeWhenOrderNoGet() {
		getInsertTxt(p.getOrderno());
	}


}
