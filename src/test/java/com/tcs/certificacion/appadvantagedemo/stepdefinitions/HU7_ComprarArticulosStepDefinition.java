package com.tcs.certificacion.appadvantagedemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import java.util.List;
import java.util.Map;


import com.tcs.certificacion.appadvantagedemo.models.HU2Usuario;
import com.tcs.certificacion.appadvantagedemo.models.HU4Producto;
import com.tcs.certificacion.appadvantagedemo.questions.HU7Pasar;
import com.tcs.certificacion.appadvantagedemo.questions.HU7Ver;
import com.tcs.certificacion.appadvantagedemo.questions.HU7VerificarCantidad;
import com.tcs.certificacion.appadvantagedemo.questions.HU7VerificarImagen;
import com.tcs.certificacion.appadvantagedemo.questions.HU7VerificarNombre;
import com.tcs.certificacion.appadvantagedemo.tasks.HU4Elegir;
import com.tcs.certificacion.appadvantagedemo.tasks.HU4Seleccionar;
import com.tcs.certificacion.appadvantagedemo.tasks.HU7Click;
import com.tcs.certificacion.appadvantagedemo.tasks.HU7Editar;
import com.tcs.certificacion.appadvantagedemo.tasks.HU7EditarTarjeta;
import com.tcs.certificacion.appadvantagedemo.tasks.HU7IrAlModulo;
import com.tcs.certificacion.appadvantagedemo.tasks.HU7IrHasta;
import com.tcs.certificacion.appadvantagedemo.tasks.HU7PagarConSafepay;
import com.tcs.certificacion.appadvantagedemo.tasks.IniciarSesion;
import com.tcs.certificacion.appadvantagedemo.util.drivers.MyDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class HU7_ComprarArticulosStepDefinition {
	
	Actor actor;
	
	@Given("^que (.*) a seleccionado un producto (.*) de la categoria (.*)$")
	public void queElUsuarioASeleccionadoUnProducto(String nombre,String nombreProducto,String categoria) throws InterruptedException {
		actor = Actor.named(nombre);
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
		Thread.sleep(5000);
		actor.wasAbleTo(HU4Seleccionar.categoria(categoria)
				       , HU4Elegir.producto(nombreProducto));
	}

	@When("^el ingresa al canasto de compras$")
	public void elIngresaAlCanastoDeCompras() {
		actor.attemptsTo(HU7Click.boton());
	}

	@Then("^el podra ver el detalle del producto$")
	public void elPodraVerElDetalleDelProducto(List<HU4Producto> producto) {
		actor.should(seeThat(HU7VerificarImagen.deProducto(), is(true)));
		actor.should(seeThat(HU7VerificarCantidad.deProductos(), is("QTY: "+producto.get(0).getCantidad())));
		actor.should(seeThat(HU7VerificarNombre.delProducto(), is(producto.get(0).getNombreProducto().toUpperCase())));
	}
	
	@Given("^que el usuario se encuentra logueado en la pagina de DEMO$")
	public void queElUsuarioSeEncuentraLogueadoEnLaPaginaDeDEMO(List<HU2Usuario> datos) throws InterruptedException {
		actor = Actor.named("Andres");
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
		Thread.sleep(5000);
		actor.wasAbleTo(IniciarSesion.conUsername(datos.get(0).getUsername())
															  .yConPassword(datos.get(0).getPassword()));
	}

	@Given("^con un producto agregado$")
	public void conUnProductoAgregado(Map<String, String> producto) throws InterruptedException {
		Thread.sleep(3000);
		actor.wasAbleTo(HU4Seleccionar.categoria(producto.get("Categoria")));
		actor.wasAbleTo(HU4Elegir.producto(producto.get("nombreProducto")));
	}

	@Given("^en la vista ORDER PAYMENT$")
	public void enLaVistaORDERPAYMENT() throws InterruptedException {
		Thread.sleep(3000);
		actor.wasAbleTo(HU7Click.boton());
		actor.wasAbleTo(HU7IrAlModulo.orderPayment());
	}

	@When("^el edite los campos de Shipping details$")
	public void elEditeLosCamposDeShippingDetails(List<HU2Usuario> datosEditar) throws InterruptedException {
		Thread.sleep(8000);
		actor.attemptsTo(HU7Editar.conPhoneNumber(datosEditar.get(0).getPhoneNumber())
								  .yConAddress(datosEditar.get(0).getAddress())
								  .yConCity(datosEditar.get(0).getCity())
								  .yConPostalCode(datosEditar.get(0).getPostalCode())
								  .yConRegion(datosEditar.get(0).getRegion()));
	}

	@Then("^el vera la pestaña de metodo de pago con el mensaje (.*)$")
	public void elVeraLaPestañaDeMetodoDePago(String mensaje) {
		actor.should(seeThat(HU7Pasar.aSeccion(), is(mensaje)));
	}
	
	@Given("^el esta en la vista de PAYMENT METHOD$")
	public void elEstaEnLaVistaDePAYMENTMETHOD() {
		actor.wasAbleTo(HU7Click.boton());
		actor.wasAbleTo(HU7IrHasta.paymentMethod());
	}

	@When("^el diligencia los datos$")
	public void elDiligenciaLosDatos(Map<String,String> datosCompra) {
		actor.attemptsTo(HU7PagarConSafepay.conMetodoDePago(datosCompra.get("metodoDePago"))
				                           .yConUsername(datosCompra.get("username"))
				                           .yConPassword(datosCompra.get("password")));
	}

	@Then("^el podra ver el mensaje (.*)$")
	public void elPodraVerElMensajeThankYouForBuyingWithAdvantage(String mensaje) {
		actor.should(seeThat(HU7Ver.mensajeDeCompra(), is(mensaje)));
	}
	
	@When("^el edita los datos$")
	public void elIngresaLosDatos(Map<String, String> datosCompra) {
		actor.attemptsTo(HU7EditarTarjeta.conMetodoPago(datosCompra.get("metodoDePago"))
										 .conNumeroTarjeta(datosCompra.get("cardNumber"))
										 .yConClave(datosCompra.get("cvvNumber"))
										 .yConMes(datosCompra.get("Month"))
										 .yConAnio(datosCompra.get("Year"))
										 .yConNombreTitular(datosCompra.get("cardHolderName")));
	}

}
