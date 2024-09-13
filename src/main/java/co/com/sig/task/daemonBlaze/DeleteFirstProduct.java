package co.com.sig.task.daemonBlaze;

import co.com.sig.userinterface.daemonBlaze.Carview;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DeleteFirstProduct  implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Carview.BTN_DELETE_FIRST_ELEMENT.waitingForNoMoreThan(Duration.ofSeconds(5)))

        );
    }
        public static DeleteFirstProduct in() {
            return Tasks.instrumented(DeleteFirstProduct.class);
        }
}
