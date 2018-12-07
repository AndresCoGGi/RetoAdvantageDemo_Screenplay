package com.tcs.certificacion.appadvantagedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class HU3LeerUrl implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
	  return BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
	}
	
	public static HU3LeerUrl deRedSocial() {
		return new HU3LeerUrl();
	}

}
