import java.time.{LocalDate, LocalTime}

def registrarEntrega(codigoEnvio: String, dni: String): Entrega = {
  val fecha = LocalDate.now()
  val hora = LocalTime.now()
  Entrega(fecha, hora, codigoEnvio, dni)
}
