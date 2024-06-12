def dividirPaquetesPorPeso(paquetes: List[Paquete]): (List[Paquete], List[Paquete]) = {
  val (pesados, ligeros) = paquetes.partition(_.peso > 2)
  (pesados, ligeros)
}
