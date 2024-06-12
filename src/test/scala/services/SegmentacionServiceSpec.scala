import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SegmentacionServiceSpec extends AnyFlatSpec with Matchers {

  "segmentarPaquetes" should "correctly segment packages by postal code" in {
    val paquetes = List(
      Paquete("08001", 3.5, "ENV001"),
      Paquete("08002", 1.8, "ENV002"),
      Paquete("08003", 2.3, "ENV003"),
      Paquete("08004", 0.5, "ENV004")
    )
    val zona1 = Set("08001", "08002")
    val zona2 = Set("08003", "08004")

    val (zona1Paquetes, zona2Paquetes) = segmentarPaquetes(paquetes, zona1, zona2)

    zona1Paquetes should contain theSameElementsAs List(
      Paquete("08001", 3.5, "ENV001"),
      Paquete("08002", 1.8, "ENV002")
    )

    zona2Paquetes should contain theSameElementsAs List(
      Paquete("08003", 2.3, "ENV003"),
      Paquete("08004", 0.5, "ENV004")
    )
  }
}
