package com.tcs.certificacion.appadvantagedemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import java.util.Map;

import org.hamcrest.Matchers;

import com.tcs.certificacion.appadvantagedemo.questions.HU7VerificarCantidad;
import com.tcs.certificacion.appadvantagedemo.questions.HU8Validar;
import com.tcs.certificacion.appadvantagedemo.questions.HU8Ver;
import com.tcs.certificacion.appadvantagedemo.tasks.HU4Agregar;
import com.tcs.certificacion.appadvantagedemo.tasks.HU4Elegir;
import com.tcs.certificacion.appadvantagedemo.tasks.HU4Seleccionar;
import com.tcs.certificacion.appadvantagedemo.tasks.HU8ClickBoton;
import com.tcs.certificacion.appadvantagedemo.util.drivers.MyDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class HU8_VerificarInventario {

	Actor actor;

	@Given("^que el usuario haya seleccionado un producto$")
	public void queElUsuarioHayaSeleccionadoUnProducto(Map<String, String> datosProducto) throws InterruptedException {
		actor = Actor.named("Andres");
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
		Thread.sleep(3000);
		actor.wasAbleTo(HU4Seleccionar.categoria(datosProducto.get("Categoria")));
		actor.wasAbleTo(HU4Elegir.producto(datosProducto.get("nombreProducto")));
	}

	@When("^el ingrese una cantidad mayor a la disponible$")
	public void elIngreseUnCantidadMayorALaDisponible(Map<String, String> cantidad) {
		actor.attemptsTo(HU4Agregar.cantidad(cantidad.get("cantidad")), HU8ClickBoton.addToCart());
	}

	@Then("^el vera un mensaje (.*)$")
	public void elVeraUnMensajeOopsWeOnlyHaveInStockWeUpdatedYourOrderAccordingly(String mensaje) {
		actor.should(seeThat(HU8Validar.mensaje(), Matchers.is(mensaje)));	
	}
	
	@Then("^el vera agregados solo los productos disponibles$")
	public void elVeraAgregadosSoloLosProductosDisponibles(Map<String, String> cantidadEsperada) {
		actor.should(seeThat(HU7VerificarCantidad.deProductos(),is("QTY: "+cantidadEsperada.get("cantidadEsperada"))));
	}
	
	@Given("^que el usuario haya seleccionado un producto que no tenga disponiblidad$")
	public void queElUsuarioHayaSeleccionadoUnProductoQueNoTengaDisponiblidad(Map<String, String> datosProducto) throws InterruptedException {
		actor = Actor.named("Andres");
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
		Thread.sleep(3000);
		actor.wasAbleTo(HU4Seleccionar.categoria(datosProducto.get("Categoria")));
		actor.wasAbleTo(HU4Elegir.producto(datosProducto.get("nombreProducto")));
	}

	@Then("^el boton de agregar al canasto aparece (.*)$")
	public void elBotonDeAgregarAlCanastoApareceNoDisponible(String disponibilidad) {
		actor.should(seeThat(HU8Ver.botonAddToCart(),is(disponibilidad)));
	}

}
