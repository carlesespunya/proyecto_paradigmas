import java.time.LocalDate
import java.time.LocalTime

case class Entrega(fecha: LocalDate, hora: LocalTime, codigoEnvio: String, dni: String)
