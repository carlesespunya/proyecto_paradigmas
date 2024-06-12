import java.time.LocalDate
import java.time.LocalTime

object Main extends App {

  // Ejemplo de datos de paquetes
  val paquetes = List(
    Paquete("08001", 3.5, "ENV001"),
    Paquete("08002", 1.8, "ENV002"),
    Paquete("08003", 2.3, "ENV003"),
    Paquete("08004", 0.5, "ENV004")
  )

  // Definimos las zonas por código postal
  val zona1 = Set("08001", "08002")
  val zona2 = Set("08003", "08004")

  // Creamos los repartidores
  val ana = Repartidor("Ana", Coche)
  val lucas = Repartidor("Lucas", Furgoneta)

  // Asignamos los paquetes a los repartidores
  val (lucasPaquetes, anaPaquetes) = asignarPaquetes(paquetes, zona1, zona2)

  // Mostramos los paquetes asignados a cada repartidor
  println(s"Paquetes asignados a Lucas (Furgoneta): ${lucasPaquetes.mkString(", ")}")
  println(s"Paquetes asignados a Ana (Coche): ${anaPaquetes.mkString(", ")}")

  // Función para simular la entrega de paquetes
  def entregarPaquetes(repartidor: Repartidor, paquetes: List[Paquete]): Unit = {
    paquetes.foreach { paquete =>
      println(s"${repartidor.nombre} está entregando el paquete con código ${paquete.codigoEnvio}")
      entregarPaquete(paquete, "12345678X") // Simulamos un DNI
    }
  }

  // Entregamos los paquetes asignados
  entregarPaquetes(lucas, lucasPaquetes)
  entregarPaquetes(ana, anaPaquetes)
}
