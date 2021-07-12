package co.com.qvision.certificacion.demoqa.stepdefinitions.windows;

import co.com.qvision.certificaion.demoqa.models.AlertModel;
import co.com.qvision.certificaion.demoqa.models.MenuModel;
import co.com.qvision.certificaion.demoqa.questions.alerts.AlertQuestion;
import co.com.qvision.certificaion.demoqa.tasks.MenuTask;
import co.com.qvision.certificaion.demoqa.tasks.alerts.AlertTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class AlertsStepDefinition {

    @Dado("que el usuario del modulo Alert y windows en el item Alerts")
    public void queElUsuarioDelModuloAlertYWindowsEnElItemAlerts(MenuModel menuModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuTask.seleccionarOpcion(menuModel.getModulo(), menuModel.getIntem()));
    }

    @Cuando("selecciono el primer boton alert button")
    public void seleccionoElPrimerBotonAlertButton(AlertModel alertModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(AlertTask.alertTask(alertModel));
    }

    @Entonces("verifico el mensaje You clicked a button")
    public void verificoElMensajeYouClickedAButton(AlertModel alertModel) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Valida mensaje de alert",
                AlertQuestion.alertQuestion(), Matchers.equalTo(alertModel.getMensaje())));
    }
}
