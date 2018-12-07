package com.tcs.certificacion.appadvantagedemo.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Set;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class HU3Cambiar implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		Set<String> setVentanas = Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles();
		setVentanas.remove(Serenity.getWebdriverManager().getCurrentDriver().getWindowHandle());
		Serenity.getWebdriverManager().getCurrentDriver().switchTo().window(setVentanas.iterator().next());
	}

	public static HU3Cambiar aVentana() {
		return instrumented(HU3Cambiar.class);
	}

}
