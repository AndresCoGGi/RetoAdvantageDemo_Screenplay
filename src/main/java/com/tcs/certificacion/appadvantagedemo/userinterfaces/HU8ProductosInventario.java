package com.tcs.certificacion.appadvantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HU8ProductosInventario {
	
	public static final Target MENSAJE_ERROR = Target.the("Mensaje de error inventario")
			.locatedBy("//label[@data-ng-class='message._class']");
    public static final Target BTN_ADD = Target.the("Boton de add to cart")
    		.locatedBy("//button[@class='roboto-medium ng-scope disable']");
}
