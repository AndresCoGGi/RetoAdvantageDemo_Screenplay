package com.tcs.certificacion.appadvantagedemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU7CarritoCompras;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class HU7PagarConSafepay implements Task{
	
	private String metodoPago;
	private String username;
	private String password;

	public HU7PagarConSafepay(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HU7CarritoCompras.METODO_PAGO.of(metodoPago)),
				          Enter.theValue(username).into(HU7CarritoCompras.USERNAME_SAFEPAY),
				          Enter.theValue(password).into(HU7CarritoCompras.PASSWORD_SAFEPAY),
				          Click.on(HU7CarritoCompras.BTN_PAY_NOW));
	}
	
	public static HU7PagarConSafepay conMetodoDePago(String metodoPago) {
		return instrumented(HU7PagarConSafepay.class, metodoPago);		
	}
	
	public HU7PagarConSafepay yConUsername(String username) {
		this.username = username;
		return this;
	}
	
	public HU7PagarConSafepay yConPassword(String password) {
		this.password = password;
		return this;
	}

}
