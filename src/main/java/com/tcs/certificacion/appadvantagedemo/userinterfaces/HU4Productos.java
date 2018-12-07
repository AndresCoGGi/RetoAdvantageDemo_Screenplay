package com.tcs.certificacion.appadvantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HU4Productos {
	
	public static final Target BTN_BUY_NOW = Target.the("Boton Buy Now")
			.locatedBy("//button[@name='buy_now']");
	public static final Target PRODUCTO = Target.the("Seleccionar prodcuto")
			.locatedBy("//a[contains(text(),'{0}')]");
    public static final Target VISTA_PRODUCTO = Target.the("Vistas del producto")
    		.locatedBy("//div[@id='lengthAllImages']//div");
    public static final Target COLOR_PRODUCTO = Target.the("Seleccionar color producto")
    		.locatedBy("//span[@title='{0}']");
    public static final Target COLOR_SELECCIONADO = Target.the("Color selecionado")
    		.locatedBy("//span[contains(@class,'colorSelected')]");
    public static final Target SECCION_ESPECIFICACIONES = Target.the("Seccion especificacion")
    		.locatedBy("//h2[@translate='PRODUCT_SPECIFICATIONS']");
    public static final Target BTN_ADDTOCART = Target.the("Boton add to cart")
    		.locatedBy("//button[@name='save_to_cart']");
    public static final Target CANTIDAD = Target.the("Ingresar cantidad")
    		.locatedBy("//input[@name='quantity']");
}
	