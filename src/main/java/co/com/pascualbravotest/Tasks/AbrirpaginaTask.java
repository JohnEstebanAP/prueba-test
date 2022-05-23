package co.com.pascualbravotest.Tasks;

import co.com.pascualbravotest.Userinterface.PascualCromeUserInterfase;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirpaginaTask {

  PascualCromeUserInterfase usuario = new PascualCromeUserInterfase();

  @Override
  public <T extends Actor> void performAs(T actor) {
    usuario.open();
  }

  public static AbrirpaginaTask abrirpaginaTask() {
    return instrumented(AbrirpaginaTask.class);
  }
}
