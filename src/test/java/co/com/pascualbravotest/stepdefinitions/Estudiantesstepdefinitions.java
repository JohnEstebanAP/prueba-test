package co.com.pascualbravotest.stepdefinitions;

import co.com.pascualbravotest.Tasks.AbrirPaginaTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Estudiantesstepdefinitions {
//
//  WebDriver driver;

  @Before
  public void initialConfiguration() {

    setTheStage(new OnlineCast());
  }

  @Dado("El usuario en la pagina pascual bravo")
  public void elUsuarioEnLaPaginaPascualBravo() {
    theActorCalled("La jefa").attemptsTo(new AbrirPaginaTask());

//    System.setProperty(
//        "webdriver.chrome.driver",
//        "src/test/resources/co.com.pascualbravotest/driver/chromedriver");
//        driver = new ChromeDriver();
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
