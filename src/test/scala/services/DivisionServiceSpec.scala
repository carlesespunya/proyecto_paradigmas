import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DivisionServiceSpec extends AnyFlatSpec with Matchers {

  "dividirPaquetesPorPeso" should "correctly divide packages by weight" in {
    val paquetes = List(
      Paquete("08001", 3.5, "ENV001"),
      Paquete("08002", 1.8, "ENV002"),
      Paquete("08003", 2.3, "ENV003"),
      Paquete("08004", 0.5, "ENV004")
    )

    val (pesados, ligeros) = dividirPaquetesPorPeso(paquetes)

    pesados should contain theSameElementsAs List(
      Paquete("08001", 3.5, "ENV001"),
      Paquete("08003", 2.3, "ENV003")
    )

    ligeros should contain theSameElementsAs List(
      Paquete("08002", 1.8, "ENV002"),
      Paquete("08004", 0.5, "ENV004")
    )
  }
}
