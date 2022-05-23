package co.com.pascualbravotest.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Estudiantesstepdefinitions {

  WebDriver driver;

  @Before
  public void initialConfiguration() {

    setTheStage(new OnlineCast());
  }

  private void setTheStage(OnlineCast onlineCast) {}

  @Dado("El usuario en la pagina pascual bravo")
  public void elUsuarioEnLaPaginaPascualBravo() {
//    System.setProperty(
//        "webdriver.chrome.driver",
//        "src/test/resources/co.com.pascualbravotest/driver/chromedriver");
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.navigate().to("https://pascualbravo.edu.co/");
//    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    //    driver.close();
  }

  @Cuando("Dar click en el modulo estudiante")
  public void darClickEnElModuloEstudiante() {}

  @Entonces("El usuario visualiza la informacion")
  public void elUsuarioVisualizaLaInformacion() {}
}

// antes, test, despues
