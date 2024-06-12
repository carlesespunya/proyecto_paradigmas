import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import java.time.{LocalDate, LocalTime}

class EntregaSpec extends AnyFlatSpec with Matchers {

  "An Entrega" should "be created with correct attributes" in {
    val entrega = Entrega(LocalDate.now(), LocalTime.now(), "ENV001", "12345678X")
    entrega.codigoEnvio shouldEqual "ENV001"
    entrega.dni shouldEqual "12345678X"
  }
}
