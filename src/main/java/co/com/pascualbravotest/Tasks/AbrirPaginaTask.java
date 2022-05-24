package co.com.pascualbravotest.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.pascualbravotest.Userinterface.PascualCromeUserInterfase;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaTask implements Task{

  @Override
  public <T extends Actor> void performAs(T actor) {
    PascualCromeUserInterfase usuario = new PascualCromeUserInterfase();
    usuario.open();
  }

  public static AbrirPaginaTask abrirpaginaTask() {
    return instrumented(AbrirPaginaTask.class);
  }
}
