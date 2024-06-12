import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import java.time.{LocalDate, LocalTime}

class EntregaServiceSpec extends AnyFlatSpec with Matchers {

  "registrarEntrega" should "create an Entrega with current date and time" in {
    val entrega = registrarEntrega("ENV001", "12345678X")
    entrega.codigoEnvio shouldEqual "ENV001"
    entrega.dni shouldEqual "12345678X"
    entrega.fecha shouldEqual LocalDate.now()
    entrega.hora.getHour shouldEqual LocalTime.now().getHour
  }

  "entregarPaquete" should "register and notify delivery" in {
    // Mock or simulate the notification function if necessary
    val paquete = Paquete("08001", 3.5, "ENV001")
    entregarPaquete(paquete, "12345678X")
    // Here you would check if the notification was sent, using a mock framework or by capturing stdout
  }
}
