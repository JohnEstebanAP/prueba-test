package co.com.pascualbravotest.Userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://pascualbravo.edu.co/")
public class PascualCromeUserInterfase  extends PageObject {
    public static final Target BTN_SPAN_ESTUDIANTES;

    static {
        BTN_SPAN_ESTUDIANTES = Target.the("boton para llevar a estudiante").locatedBy("//a[@href='https://pascualbravo.edu.co//?page_id=41']");
    }

}
