package com.tcs.certificacion.appadvantagedemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import java.util.Map;
import com.tcs.certificacion.appadvantagedemo.questions.HU3LeerUrl;
import com.tcs.certificacion.appadvantagedemo.tasks.HU3Ir;
import com.tcs.certificacion.appadvantagedemo.util.drivers.MyDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class HU3_RedesSocialesStepDefinitions {
	
	Actor actor;
	
	
	@Given("^que (.*) se encuentra en la pagina inicial de DEMO$")
	public void queElUsuarioSeEncuentraEnLaPaginaInicialDeDEMO(String nombre) {
		actor = Actor.named(nombre);
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));	
	}

	@When("^el seleccion la red social Linkedin$")
	public void elSeleccionLaRedSocialLinkedin() throws InterruptedException {
		Thread.sleep(5000);
		actor.attemptsTo(HU3Ir.aLaRedSocial("follow_linkedin"));
	}

	@Then("^se redireccionara a la url de la pagina Linkedin$")
	public void seRedireccionaraALaUrlDeLaPaginaLinkedin(Map<String, String> url){
		actor.should(seeThat(HU3LeerUrl.deRedSocial(), is(url.get("url"))));
	}

	@When("^el seleccion la red social Facebook$")
	public void elSeleccionLaRedSocialFacebook() throws InterruptedException {
		Thread.sleep(5000);
		actor.attemptsTo(HU3Ir.aLaRedSocial("follow_facebook"));
	}

	@Then("^se redireccionara a la url de la pagina Facebook$")
	public void seRedireccionaraALaUrlDeLaPaginaFacebook(Map<String, String> url) {
		actor.should(seeThat(HU3LeerUrl.deRedSocial(), is(url.get("url"))));
	}

	@When("^el seleccion la red social Twitter$")
	public void elSeleccionLaRedSocialTwitter() throws InterruptedException {
		Thread.sleep(5000);
		actor.attemptsTo(HU3Ir.aLaRedSocial("follow_twitter"));
	}

	@Then("^se redireccionara a la url de la pagina Twitter$")
	public void seRedireccionaraALaUrlDeLaPaginaTwitter(Map<String, String> url) {
		actor.should(seeThat(HU3LeerUrl.deRedSocial(), is(url.get("url"))));
	}

}
