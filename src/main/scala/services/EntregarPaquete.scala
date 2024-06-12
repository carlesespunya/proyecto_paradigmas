def entregarPaquete(paquete: Paquete, dni: String): Unit = {
  // Registramos la entrega
  val entrega = registrarEntrega(paquete.codigoEnvio, dni)
  // Notificamos al usuario
  notificarUsuario(paquete.codigoEnvio)
  // Aquí podríamos guardar la entrega en una base de datos o sistema de registro
}
