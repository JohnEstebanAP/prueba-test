package co.com.pascualbravotest.stepdefinitions;

import co.com.pascualbravotest.Tasks.AbrirPaginaTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static co.com.pascualbravotest.Tasks.AbrirPaginaTask.abrirpaginaTask;
import static co.com.pascualbravotest.Tasks.ClickEstudiantesTasks.clickEstudiantesTasks;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Estudiantesstepdefinitions {


  @Before
  public void initialConfiguration() {setTheStage(new OnlineCast());}
  @Dado("El usuario en la pagina pascual bravo")
  public void elUsuarioEnLaPaginaPascualBravo() {
    theActorCalled("John Esteban Alvarez").attemptsTo(
            abrirpaginaTask()
    );
  }

  @Cuando("Dar click en el modulo estudiante")
  public void darClickEnElModuloEstudiante() {
    theActorInTheSpotlight().attemptsTo(
            clickEstudiantesTasks()
    );
  }

  @Entonces("El usuario visualiza la informacion")
  public void elUsuarioVisualizaLaInformacion() {}
}

// antes, test, despues



//WebDriver driver;
//  By estudianteLinkLocator = By.linkText("Estudiante");
//  By estudianteName = By.name("Estudiante");
// By estudiantePageLocator = By.xpath("//a[@href='https://pascualbravo.edu.co//?page_id=41']");
//System.setProperty("webdriver.chrome.driver","src/test/resources/co.com.pascualbravotest/driver/chromedriver");
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("https://pascualbravo.edu.co/");
//driver.navigate().to("https://pascualbravo.edu.co/");

//    driver.findElement(estudiantePageLocator);
//    try {
//      Thread.sleep(2000);
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }
//    if(driver.findElement(estudiantePageLocator).isDisplayed()){
//      driver.findElement(estudiantePageLocator).click();
//    }else{
//      System.out.print("No se encontro el boton de Estudiantes");
//    }
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    driver.close();