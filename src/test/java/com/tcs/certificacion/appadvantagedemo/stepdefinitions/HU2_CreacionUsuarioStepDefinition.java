package com.tcs.certificacion.appadvantagedemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import java.util.List;
import java.util.Map;


import com.tcs.certificacion.appadvantagedemo.models.HU2Usuario;
import com.tcs.certificacion.appadvantagedemo.questions.HU2Leer;
import com.tcs.certificacion.appadvantagedemo.questions.HU2MensajeError;
import com.tcs.certificacion.appadvantagedemo.questions.HU2ValidarBotonRegister;
import com.tcs.certificacion.appadvantagedemo.questions.HU2Ver;
import com.tcs.certificacion.appadvantagedemo.tasks.HU2Confirmar;
import com.tcs.certificacion.appadvantagedemo.tasks.HU2IrHasta;
import com.tcs.certificacion.appadvantagedemo.tasks.HU2RegistrarUsuario;
import com.tcs.certificacion.appadvantagedemo.tasks.HU2Validar;
import com.tcs.certificacion.appadvantagedemo.util.drivers.MyDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class HU2_CreacionUsuarioStepDefinition {

	Actor actor;

	@Given("^que (.*) se encuentra en la pantalla Create Account$")
	public void queElAdministradorSeEncuentraEnLaPantallaCreateAccount(String nombre) throws InterruptedException {
		actor = Actor.named(nombre);
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
		Thread.sleep(5000);
		actor.wasAbleTo(HU2IrHasta.formularioDeRegistro());
	}

	@When("^el diligencia los datos del formulario$")
	public void elDiligenciaLosDatosDelFormulario(List<HU2Usuario> usuario) {
		actor.attemptsTo(HU2RegistrarUsuario.conNombreUsuario(usuario.get(0).getUsername())
				.yConCorreo(usuario.get(0).getEmail()).yConContrasenia(usuario.get(0).getPassword())
				.yConRepitaContrasenia(usuario.get(0).getConfirmPassword()).yConNombre(usuario.get(0).getFirstName())
				.yConApellido(usuario.get(0).getLastName()).yConNumeroCelular(usuario.get(0).getPhoneNumber())
				.yConPais(usuario.get(0).getCountry()).yConCiudad(usuario.get(0).getCity())
				.yConDireccion(usuario.get(0).getAddress()).yConRegion(usuario.get(0).getRegion())
				.yConCodigoPostal(usuario.get(0).getPostalCode()).yConAceptarTerminos(usuario.get(0).getiAgree()));
	}

	@Then("^el se redirecciona a la pagina principal con su nombre de usuario$")
	public void elSeRedireccionaALaPaginaPrincipal(List<List<String>> username) throws InterruptedException {
		System.out.println(username.get(1).get(0));
		Thread.sleep(2000);
		actor.should(seeThat(HU2Leer.NombreDeUsuario(), is(username.get(1).get(0))));
	}

	@When("^el diligencia los datos del formulario exceptuando el campo username$")
	public void elDiligenciaLosDatosDelFormularioExceptuandoElCampoUsername(List<HU2Usuario> usuario) {
		actor.attemptsTo(HU2RegistrarUsuario.conNombreUsuario(usuario.get(0).getUsername())
				.yConCorreo(usuario.get(0).getEmail()).yConContrasenia(usuario.get(0).getPassword())
				.yConRepitaContrasenia(usuario.get(0).getConfirmPassword()).yConNombre(usuario.get(0).getFirstName())
				.yConApellido(usuario.get(0).getLastName()).yConNumeroCelular(usuario.get(0).getPhoneNumber())
				.yConPais(usuario.get(0).getCountry()).yConCiudad(usuario.get(0).getCity())
				.yConDireccion(usuario.get(0).getAddress()).yConRegion(usuario.get(0).getRegion())
				.yConCodigoPostal(usuario.get(0).getPostalCode()).yConAceptarTerminos(usuario.get(0).getiAgree()));
	}

	@Then("^el boton de Register se encuentra (.*)$")
	public void elBotonDeRegisterNoSeHabilita(String boton) {
		actor.should(seeThat(HU2ValidarBotonRegister.deshabilitado(), is(boton)));
	}

	@When("^el diligencia los datos del formulario exceptuando el campo Email$")
	public void elDiligenciaLosDatosDelFormularioExceptuandoElCampoEmail(List<HU2Usuario> usuario) {
		actor.attemptsTo(HU2RegistrarUsuario.conNombreUsuario(usuario.get(0).getUsername())
				.yConCorreo(usuario.get(0).getEmail()).yConContrasenia(usuario.get(0).getPassword())
				.yConRepitaContrasenia(usuario.get(0).getConfirmPassword()).yConNombre(usuario.get(0).getFirstName())
				.yConApellido(usuario.get(0).getLastName()).yConNumeroCelular(usuario.get(0).getPhoneNumber())
				.yConPais(usuario.get(0).getCountry()).yConCiudad(usuario.get(0).getCity())
				.yConDireccion(usuario.get(0).getAddress()).yConRegion(usuario.get(0).getRegion())
				.yConCodigoPostal(usuario.get(0).getPostalCode()).yConAceptarTerminos(usuario.get(0).getiAgree()));
	}

	@When("^el diligencia los datos del formulario exceptuando el campo password$")
	public void elDiligenciaLosDatosDelFormularioExceptuandoElCampoPassword(List<HU2Usuario> usuario) {
		actor.attemptsTo(HU2RegistrarUsuario.conNombreUsuario(usuario.get(0).getUsername())
				.yConCorreo(usuario.get(0).getEmail()).yConContrasenia(usuario.get(0).getPassword())
				.yConRepitaContrasenia(usuario.get(0).getConfirmPassword()).yConNombre(usuario.get(0).getFirstName())
				.yConApellido(usuario.get(0).getLastName()).yConNumeroCelular(usuario.get(0).getPhoneNumber())
				.yConPais(usuario.get(0).getCountry()).yConCiudad(usuario.get(0).getCity())
				.yConDireccion(usuario.get(0).getAddress()).yConRegion(usuario.get(0).getRegion())
				.yConCodigoPostal(usuario.get(0).getPostalCode()).yConAceptarTerminos(usuario.get(0).getiAgree()));
	}

	@When("^el diligencia los datos del formulario exceptuando el campo Confirm password$")
	public void elDiligenciaLosDatosDelFormularioExceptuandoElCampoConfirmPassword(List<HU2Usuario> usuario) {
		actor.attemptsTo(HU2RegistrarUsuario.conNombreUsuario(usuario.get(0).getUsername())
				.yConCorreo(usuario.get(0).getEmail()).yConContrasenia(usuario.get(0).getPassword())
				.yConRepitaContrasenia(usuario.get(0).getConfirmPassword()).yConNombre(usuario.get(0).getFirstName())
				.yConApellido(usuario.get(0).getLastName()).yConNumeroCelular(usuario.get(0).getPhoneNumber())
				.yConPais(usuario.get(0).getCountry()).yConCiudad(usuario.get(0).getCity())
				.yConDireccion(usuario.get(0).getAddress()).yConRegion(usuario.get(0).getRegion())
				.yConCodigoPostal(usuario.get(0).getPostalCode()).yConAceptarTerminos(usuario.get(0).getiAgree()));
	}

	@When("^el diligencia los datos del formulario exceptuando el campo IAgree$")
	public void elDiligenciaLosDatosDelFormularioExceptuandoElCampoIAgree(List<HU2Usuario> usuario) {
		actor.attemptsTo(HU2RegistrarUsuario.conNombreUsuario(usuario.get(0).getUsername())
				.yConCorreo(usuario.get(0).getEmail()).yConContrasenia(usuario.get(0).getPassword())
				.yConRepitaContrasenia(usuario.get(0).getConfirmPassword()).yConNombre(usuario.get(0).getFirstName())
				.yConApellido(usuario.get(0).getLastName()).yConNumeroCelular(usuario.get(0).getPhoneNumber())
				.yConPais(usuario.get(0).getCountry()).yConCiudad(usuario.get(0).getCity())
				.yConDireccion(usuario.get(0).getAddress()).yConRegion(usuario.get(0).getRegion())
				.yConCodigoPostal(usuario.get(0).getPostalCode()).yConAceptarTerminos(usuario.get(0).getiAgree()));
	}

	@When("^el diligencia el campo username con una longitud invalida$")
	public void elDiligenciaElCampoUsernameConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("Username")).yEnElCampo(datos.get("Campo")));
	}

	@Then("^se muestra un mensaje de error$")
	public void seMuestraUnMensajeDeError(Map<String, String> datos) {
		actor.should(seeThat(HU2MensajeError.longitud(), is(datos.get("Mensaje"))));
	}

	@When("^el diligencia el campo Email con una longitud invalida$")
	public void elDiligenciaElCampoEmailConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("Email")).yEnElCampo(datos.get("Campo")));
	}

	@When("^el diligencia el campo Password con una longitud invalida$")
	public void elDiligenciaElCampoPasswordConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("Password")).yEnElCampo(datos.get("Campo")));
	}

	@When("^el diligencia el campo Password y Confirm Password que no coinciden$")
	public void elDiligenciaElCampoPasswordYConfirmPasswordConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Confirmar.conPassword(datos.get("Password")).yConConfirmPassword("Confirm Password"));
	}

	@When("^el diligencia el campo First Name con una longitud invalida$")
	public void elDiligenciaElCampoFirstNameConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("First Name")).yEnElCampo(datos.get("Campo")));
	}

	@When("^el diligencia el campo Last Name con una longitud invalida$")
	public void elDiligenciaElCampoLastNameConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("Last Name")).yEnElCampo(datos.get("Campo")));
	}
	
	@When("^el diligencia el campo Phone Number con una longitud invalida$")
	public void elDiligenciaElCampoPhoneNumberConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("Phone Name")).yEnElCampo(datos.get("Campo")));
	}

	@When("^el diligencia el campo City con una longitud invalida$")
	public void elDiligenciaElCampoCityConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("City")).yEnElCampo(datos.get("Campo")));
	}

	@When("^el diligencia el campo Address con una longitud invalida$")
	public void elDiligenciaElCampoAddressConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("Address")).yEnElCampo(datos.get("Campo")));
	}

	@When("^el diligencia el campo Region con una longitud invalida$")
	public void elDiligenciaElCampoRegionConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("Region")).yEnElCampo(datos.get("Campo")));
	}

	@When("^el diligencia el campo Postal Code con una longitud invalida$")
	public void elDiligenciaElCampoPostalCodeConUnaLongitudInvalida(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("Postal Code")).yEnElCampo(datos.get("Campo")));
	}
	
	@When("^el diligencia un email que no cumple con el formato$")
	public void elDiligenciaUnCorreoQueNoCumpleConElFormato(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("Email")).yEnElCampo(datos.get("Campo")));
	}
	
	@When("^el diligencia una Password que no cumple con el formato$")
	public void elDiligenciaUnaPasswordQueNoCumpleConElFormato(Map<String, String> datos) {
		actor.attemptsTo(HU2Validar.conValor(datos.get("Password")).yEnElCampo(datos.get("Campo")));
	}
	
	@Then("^el podra ver el formulario dividido en tres secciones$")
	public void elPodraVerElFormularioDivididoEnTresSecciones(Map<String, String> secciones) {
		actor.should(seeThat(HU2Ver.seccion("uno"), is(secciones.get("seccion1"))));
		actor.should(seeThat(HU2Ver.seccion("dos"), is(secciones.get("seccion2"))));
		actor.should(seeThat(HU2Ver.seccion("tres"), is(secciones.get("seccion3"))));
	}

}
