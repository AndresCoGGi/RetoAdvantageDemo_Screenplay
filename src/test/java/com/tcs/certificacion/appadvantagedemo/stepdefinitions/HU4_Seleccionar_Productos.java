package com.tcs.certificacion.appadvantagedemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import java.util.List;
import java.util.Map;


import com.tcs.certificacion.appadvantagedemo.models.HU4Producto;
import com.tcs.certificacion.appadvantagedemo.questions.HU4ObtenerCantidad;
import com.tcs.certificacion.appadvantagedemo.questions.HU4Ver;
import com.tcs.certificacion.appadvantagedemo.questions.HU4VerBoton;
import com.tcs.certificacion.appadvantagedemo.questions.HU4VerColor;
import com.tcs.certificacion.appadvantagedemo.questions.HU4Verificar;
import com.tcs.certificacion.appadvantagedemo.questions.HU4Visualizar;
import com.tcs.certificacion.appadvantagedemo.tasks.HU4Agregar;
import com.tcs.certificacion.appadvantagedemo.tasks.HU4Elegir;
import com.tcs.certificacion.appadvantagedemo.tasks.HU4Seleccionar;
import com.tcs.certificacion.appadvantagedemo.tasks.HU4SeleccionarColor;
import com.tcs.certificacion.appadvantagedemo.util.drivers.MyDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class HU4_Seleccionar_Productos {
	
	Actor actor;
	
	@Given("^que el (.*) se encuentra en la pagina principal de DEMO$")
	public void queElUsuarioSeEncuentraEnLaPaginaPrincipalDeDEMO(String nombre) {
		actor = Actor.named(nombre);
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
	}

	@When("^el selecciona una categoria$")
	public void elSeleccionUnaCategoria(Map<String ,String> categorias) throws InterruptedException {
		Thread.sleep(5000);
		actor.attemptsTo(HU4Seleccionar.categoria(categorias.get("Categoria")));
	}

	@Then("^el podra ver el boton (.*)$")
	public void elPodraVerElBotonBUYNOW(String boton) {
		actor.should(seeThat(HU4Ver.botonBuyNow(), is(boton)));
	}
	
	@Given("^que el administrador ya selecciono una categoria$")
	public void queElAdministradorYaSeleccionoUnaCategoria(Map<String ,String> categoria) throws InterruptedException {
		actor = Actor.named("el administrador");
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
		Thread.sleep(5000);
		actor.wasAbleTo(HU4Seleccionar.categoria(categoria.get("Categoria")));
	}

	@When("^el selecciona un producto$")
	public void elSeleccionaUnProducto(List<HU4Producto> producto) {
		actor.attemptsTo(HU4Elegir.producto(producto.get(0).getNombreProducto()));
	}

	@Then("^el podra ver la imagen del producto en sus diferentes angulos$")
	public void elPodraVerLaImagenDelProductoEnSusDiferentesAngulos() {
		actor.should(seeThat(HU4Visualizar.producto(), is(true)));
	}
	
	@Given("^que el administrador ya selecciono un producto$")
	public void queElAdministradorYaSeleccionoUnProducto(Map<String, String> producto) throws InterruptedException {
		actor = Actor.named("el administrador");
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
		Thread.sleep(5000);
		actor.wasAbleTo(HU4Seleccionar.categoria(producto.get("Categoria")));
		actor.wasAbleTo(HU4Elegir.producto(producto.get("nombreProducto")));
	}

	@When("^el selecciona un color$")
	public void elSeleccionaUnColor(List<HU4Producto> producto) {
		actor.attemptsTo(HU4SeleccionarColor.delProducto(producto.get(0).getColor()));
	}

	@Then("^el podra ver el color seleccionado$")
	public void elPodraVerElColorSeleccionado(Map<String, String> producto) {
		actor.should(seeThat(HU4VerColor.deProducto(), is(producto.get("colorResultante"))));
	}
	
	@Then("^el podra ver una seccion llamada (.*)$")
	public void elPodraVerUnaSeccionLlamadaPRODUCTSPECIFICATIONS(String seccion) {
		actor.should(seeThat(HU4Verificar.seccion(), is(seccion)));
	}
	
	@Then("^el podra visualizar el boton (.*)$")
	public void elPodraVisualizarElBotonADDTOCART(String botonAddCart) {
		actor.should(seeThat(HU4VerBoton.addToCart(), is(botonAddCart)));
	}
	
	@When("^el aumenta la cantidad de productos$")
	public void elAumentaLaCantidadDeProductos(List<HU4Producto> cantidad) {
	    actor.attemptsTo(HU4Agregar.cantidad(cantidad.get(0).getCantidad()));
	}

	@Then("^el vera el contador aumentado$")
	public void elVeraElContadorAumentado(Map<String, String> cantidadEsperada) {
		actor.should(seeThat(HU4ObtenerCantidad.deProductos(), is(cantidadEsperada.get("CantidadEsperada"))));
	}
	
}
