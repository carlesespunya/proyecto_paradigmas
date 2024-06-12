import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RepartidorSpec extends AnyFlatSpec with Matchers {

  "A Repartidor" should "be created with correct attributes" in {
    val repartidor = Repartidor("Ana", Coche)
    repartidor.nombre shouldEqual "Ana"
    repartidor.vehiculo shouldEqual Coche
  }
}
