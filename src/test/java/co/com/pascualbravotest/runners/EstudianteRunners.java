package co.com.pascualbravotest.runners;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/co.com.pascualbravotest/features/Verificar_modulo_estudiante.feature",
        glue = "co.com.pascualbravotest.stepdefinitions"
        )


public class EstudianteRunners {

}
