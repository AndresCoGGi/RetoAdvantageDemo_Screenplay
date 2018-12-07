package com.tcs.certificacion.appadvantagedemo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/hu8verificarinventario.feature"
, glue = "com.tcs.certificacion.appadvantagedemo.stepdefinitions"
, snippets = SnippetType.CAMELCASE
, tags = "@Disponibilidad")

public class Hu8VerificarInventario {

}
