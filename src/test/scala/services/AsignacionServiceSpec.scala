import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AsignacionServiceSpec extends AnyFlatSpec with Matchers {

  "asignarPaquetes" should "correctly assign packages to Ana and Lucas" in {
    val paquetes = List(
      Paquete("08001", 3.5, "ENV001"),
      Paquete("08002", 1.8, "ENV002"),
      Paquete("08003", 2.3, "ENV003"),
      Paquete("08004", 0.5, "ENV004")
    )
    val zona1 = Set("08001", "08002")
    val zona2 = Set("08003", "08004")

    val (lucasPaquetes, anaPaquetes) = asignarPaquetes(paquetes, zona1, zona2)

    lucasPaquetes should contain theSameElementsAs List(
      Paquete("08001", 3.5, "ENV001"),
      Paquete("08003", 2.3, "ENV003")
    )

    anaPaquetes should contain theSameElementsAs List(
      Paquete("08002", 1.8, "ENV002"),
      Paquete("08004", 0.5, "ENV004")
    )
  }
}
