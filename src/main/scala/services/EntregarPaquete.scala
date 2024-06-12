def entregarPaquete(paquete: Paquete, dni: String): Unit = {
  val entrega = registrarEntrega(paquete.codigoEnvio, dni)
  notificarUsuario(paquete.codigoEnvio)
  // Aquí podríamos guardar la entrega en una base de datos o sistema de registro
}
