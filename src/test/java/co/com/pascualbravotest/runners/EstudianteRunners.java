package co.com.pascualbravotest.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/co.com.pascualbravotest/features/Verificar_modulo_estudiante.feature",
        glue = "co.com.pascualbravotest.stepdefinitions"
)

@RunWith(CucumberWithSerenity.class)

public class EstudianteRunners {
        public EstudianteRunners(){

        }
}
