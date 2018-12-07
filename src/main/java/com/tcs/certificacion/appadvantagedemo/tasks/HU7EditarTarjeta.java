package com.tcs.certificacion.appadvantagedemo.tasks;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU7CarritoCompras;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class HU7EditarTarjeta implements Task{
	
	private String metodoPago;
	private String cardNumber;
	private String cvvNumber;
	private String month;
	private String year;
	private String titular;
	
	public HU7EditarTarjeta(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HU7CarritoCompras.METODO_PAGO.of(metodoPago))
				          ,Click.on(HU7CarritoCompras.EDITAR_TARJETA)
				          ,Enter.theValue(cardNumber).into(HU7CarritoCompras.NUMERO_TARJETA)
				          ,Enter.theValue(cvvNumber).into(HU7CarritoCompras.CLAVE)
				          ,Click.on(HU7CarritoCompras.MES.of(month))
				          ,Click.on(HU7CarritoCompras.ANIO.of(year))
				          ,Enter.theValue(titular).into(HU7CarritoCompras.TITULAR_TARJETA)
				          ,Click.on(HU7CarritoCompras.BTN_PAY_NOW_M));
	}
	
	public static HU7EditarTarjeta conMetodoPago(String metodoPago) {
		return Tasks.instrumented(HU7EditarTarjeta.class, metodoPago);
	}
	
	public HU7EditarTarjeta conNumeroTarjeta(String cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	public HU7EditarTarjeta yConClave(String cvvNumber) {
		this.cvvNumber = cvvNumber;
		return this;
	}
	
	public HU7EditarTarjeta yConMes(String month) {
		this.month = month;
		return this;
	}
	
	public HU7EditarTarjeta yConAnio(String year) {
		this.year = year;
		return this;
	}
	
	public HU7EditarTarjeta yConNombreTitular(String titular) {
		this.titular = titular;
		return this;
	}

}
