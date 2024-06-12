def segmentarPaquetes(paquetes: List[Paquete], zona1: Set[String], zona2: Set[String]): (List[Paquete], List[Paquete]) = {
  // Divide la lista de paquetes en dos listas según el criterio dado
  val (zona1Paquetes, zona2Paquetes) = paquetes.partition(paquete => zona1.contains(paquete.codigoPostal))
  (zona1Paquetes, zona2Paquetes)
}
