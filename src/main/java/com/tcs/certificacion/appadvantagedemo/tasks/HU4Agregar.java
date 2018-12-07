package com.tcs.certificacion.appadvantagedemo.tasks;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU4Productos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class HU4Agregar implements Task{
	
	public String cantidad;

	public HU4Agregar(String cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(cantidad).into(HU4Productos.CANTIDAD));
	}
	
	public static HU4Agregar cantidad(String cantidad) {
		return Tasks.instrumented(HU4Agregar.class, cantidad);
	}

}
