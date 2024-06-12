import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PaqueteSpec extends AnyFlatSpec with Matchers {

  "A Paquete" should "be created with correct attributes" in {
    val paquete = Paquete("08001", 3.5, "ENV001")
    paquete.codigoPostal shouldEqual "08001"
    paquete.peso shouldEqual 3.5
    paquete.codigoEnvio shouldEqual "ENV001"
  }
}
