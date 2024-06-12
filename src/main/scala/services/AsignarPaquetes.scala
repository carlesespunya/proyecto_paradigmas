def asignarPaquetes(paquetes: List[Paquete], zona1: Set[String], zona2: Set[String]): (List[Paquete], List[Paquete]) = {
  val (zona1Paquetes, zona2Paquetes) = segmentarPaquetes(paquetes, zona1, zona2)

  val (pesadosZona1, ligerosZona1) = dividirPaquetesPorPeso(zona1Paquetes)
  val (pesadosZona2, ligerosZona2) = dividirPaquetesPorPeso(zona2Paquetes)

  val lucasPaquetes = pesadosZona1 ++ pesadosZona2
  val anaPaquetes = ligerosZona1 ++ ligerosZona2

  (lucasPaquetes, anaPaquetes)
}
