package com.tcs.certificacion.appadvantagedemo.tasks;

import com.tcs.certificacion.appadvantagedemo.userinterfaces.HU4Productos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class HU4Elegir implements Task{
	
	private String nombreProducto;
	
	public HU4Elegir(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HU4Productos.PRODUCTO.of(nombreProducto)));
	}
	
	public static HU4Elegir producto(String nombreProducto) {
		return Tasks.instrumented(HU4Elegir.class, nombreProducto);
	}

}
