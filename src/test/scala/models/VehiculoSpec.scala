import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class VehiculoSpec extends AnyFlatSpec with Matchers {

  "Vehiculo" should "have correct types" in {
    Furgoneta shouldEqual Furgoneta
    Coche shouldEqual Coche
  }
}
