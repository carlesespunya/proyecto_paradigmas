import java.time.LocalDate
import java.time.LocalTime

def registrarEntrega(codigoEnvio: String, dni: String): Entrega = {
  // Obtenemos la fecha y hora actuales
  val fecha = LocalDate.now()
  val hora = LocalTime.now()
  // Creamos una instancia de Entrega
  Entrega(fecha, hora, codigoEnvio, dni)
}
