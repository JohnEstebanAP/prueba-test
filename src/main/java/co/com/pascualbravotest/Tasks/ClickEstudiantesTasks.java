package co.com.pascualbravotest.Tasks;

import co.com.pascualbravotest.Userinterface.PascualCromeUserInterfase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.pascualbravotest.Userinterface.PascualCromeUserInterfase.BTN_SPAN_ESTUDIANTES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickEstudiantesTasks implements Task{

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(BTN_SPAN_ESTUDIANTES)
    );
  }

  public static ClickEstudiantesTasks clickEstudiantesTasks() {
    return instrumented(ClickEstudiantesTasks.class);
  }
}
