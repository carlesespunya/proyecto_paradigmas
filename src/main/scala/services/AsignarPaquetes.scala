def asignarPaquetes(paquetes: List[Paquete], zona1: Set[String], zona2: Set[String]): (List[Paquete], List[Paquete]) = {
  // Segmentamos los paquetes por zonas
  val (zona1Paquetes, zona2Paquetes) = segmentarPaquetes(paquetes, zona1, zona2)

  // Dividimos los paquetes por peso en cada zona
  val (pesadosZona1, ligerosZona1) = dividirPaquetesPorPeso(zona1Paquetes)
  val (pesadosZona2, ligerosZona2) = dividirPaquetesPorPeso(zona2Paquetes)

  // Lucas maneja la furgoneta (paquetes pesados) y Ana el coche (paquetes ligeros)
  val lucasPaquetes = pesadosZona1 ++ pesadosZona2
  val anaPaquetes = ligerosZona1 ++ ligerosZona2

  (lucasPaquetes, anaPaquetes)
}
