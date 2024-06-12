def dividirPaquetesPorPeso(paquetes: List[Paquete]): (List[Paquete], List[Paquete]) = {
  // Partition separa los paquetes en pesados y ligeros
  val (pesados, ligeros) = paquetes.partition(_.peso > 2)
  (pesados, ligeros)
}
