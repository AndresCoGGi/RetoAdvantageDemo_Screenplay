package com.tcs.certificacion.appadvantagedemo.tasks;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU4Productos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class HU4SeleccionarColor implements Task{
	
	private String color;
	
	public HU4SeleccionarColor(String color) {
		this.color = color;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HU4Productos.COLOR_PRODUCTO.of(color)));
	}
	
	public static HU4SeleccionarColor delProducto(String color) {
		return Tasks.instrumented(HU4SeleccionarColor.class, color);
	}

}
