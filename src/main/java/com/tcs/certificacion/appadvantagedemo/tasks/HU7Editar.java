package com.tcs.certificacion.appadvantagedemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU7CarritoCompras;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class HU7Editar implements Task{
	
	private String phoneNumber;
	private String city;
	private String address;
	private String postalCode;
	private String region;
	
	public HU7Editar(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	   actor.attemptsTo(Click.on(HU7CarritoCompras.EDIT)
			            ,Enter.theValue(phoneNumber).into(HU7CarritoCompras.NUMERO_CELULAR)
			   			,Enter.theValue(city).into(HU7CarritoCompras.CIUDAD)
			   			,Enter.theValue(address).into(HU7CarritoCompras.DIRECCION)
			   			,Enter.theValue(postalCode).into(HU7CarritoCompras.CODIGO_POSTAL)
			   			,Enter.theValue(region).into(HU7CarritoCompras.REGION)
			   			,Click.on(HU7CarritoCompras.BTN_NEXT));
	}
	
	public static HU7Editar conPhoneNumber(String phoneNumber) {
		return instrumented(HU7Editar.class, phoneNumber);
	}
	
	public HU7Editar yConCity(String city) {
		this.city = city;
		return this;
	}
	
	public HU7Editar yConAddress(String address) {
		this.address = address;
		return this;
	}
	
	public HU7Editar yConPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}
	
	public HU7Editar yConRegion(String region) {
		this.region = region;
		return this;
	}

}
