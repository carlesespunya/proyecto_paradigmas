# Proyecto de Gestión y Reparto de Paquetería

## Introducción

Este proyecto desarrolla una versión preliminar de un software para mejorar el sistema de gestión y reparto de una empresa de paquetería en una pequeña ciudad. El software segmenta los paquetes por código postal, asigna paquetes a dos repartidores (Ana y Lucas) y gestiona el reparto diario basado en el peso de los paquetes. Además, notifica al usuario cuando el paquete ha sido entregado.

## Requisitos Cumplidos

### Implementación Modular y Legible (Scala v3)
- **Código Modular**: La estructura del código está organizada en modelos (`models`), servicios (`services`), y un archivo principal (`Main.scala`).
- **Legibilidad**: El código está bien comentado, siguiendo las mejores prácticas de programación funcional y orientada a objetos.

### Memoria Explicativa
Se incluye una memoria de máximo 2 páginas explicando el enfoque utilizado, desde la identificación de entidades hasta la implementación.

### Elementos Evaluables
- **Figuras Relevantes de Scala v3**: Se utilizan `case class` para las entidades y `sealed trait` para los tipos de vehículos.
- **Uso Híbrido de POO y PF**: La estructura del código utiliza POO para los modelos y PF para las operaciones.
- **Exploración de Figuras Documentadas**: Se utilizaron figuras documentadas en la documentación oficial de Scala.
- **Comentarios que Potencian la Comprensión**: El código incluye comentarios que explican decisiones no obvias y mejoran la comprensión.

## Estructura del Proyecto

```plaintext
project-root/
│
├── build.sbt                   # Archivo de configuración de SBT
├── project/
│   ├── build.properties        # Configuración del proyecto
│   └── plugins.sbt             # Plugins de SBT
│
├── src/
│   ├── main/
│   │   ├── scala/
│   │       ├── models/
│   │       │   ├── Paquete.scala          # Definición de la clase Paquete
│   │       │   ├── Repartidor.scala       # Definición de la clase Repartidor
│   │       │   ├── Vehiculo.scala         # Definición del trait Vehiculo y sus implementaciones
│   │       │   └── Entrega.scala          # Definición de la clase Entrega
│   │       │
│   │       ├── services/
│   │       │   ├── SegmentacionService.scala     # Lógica de segmentación de paquetes
│   │       │   ├── DividirPaquetesPorPeso.scala  # Lógica de división de paquetes por peso
│   │       │   ├── AsignarPaquetes.scala         # Lógica de asignación de paquetes a repartidores
|   │       │   ├── NotificarUsuario.scala        # Lógica de notificación de entregas|
│   │       │   └── EntregarPaquete.scala         # Lógica de entregas
│   │       │   └── RegistrarEntrega.scala        # Lógica de registro de entregas
│   │       │
│   │       ├── Main.scala                 # Punto de entrada del programa
│   │    
│   │
│   │ 
│   │
│   └── test/
│       ├── scala/
│           ├── models/
│           │   ├── PaqueteSpec.scala       # Tests para la clase Paquete
│           │   ├── RepartidorSpec.scala    # Tests para la clase Repartidor
│           │   ├── VehiculoSpec.scala      # Tests para el trait Vehiculo
│           │   └── EntregaSpec.scala       # Tests para la clase Entrega
│           │
│           ├── services/
│           │   ├── SegmentacionServiceSpec.scala  # Tests para SegmentacionService
│           │   ├── DivisionServiceSpec.scala      # Tests para DivisionService
│           │   ├── AsignacionServiceSpec.scala    # Tests para AsignacionService
│           │   └── EntregaServiceSpec.scala       # Tests para EntregaService
│           │
│           └── MainSpec.scala              # Tests para el punto de entrada del programa
│
│ 
│      
└── README.md                    # Documentación del proyecto
```

## Cómo Usar el Proyecto

### Requisitos Previos

- [Scala](https://www.scala-lang.org/download/)
- [SBT](https://www.scala-sbt.org/download.html)

### Pasos para Ejecutar el Proyecto

1. Clonar el repositorio:
    ```sh
    git clone https://github.com/carlesespunya/proyecto_paradigmas.git
    cd proyecto_paradigmas
    ```

2. Compilar el proyecto:
    ```sh
    sbt compile
    ```

3. Ejecutar la aplicación:
    ```sh
    sbt run
    ```

4. Ejecutar las pruebas:
    ```sh
    sbt test
    ```

### Explicación del Funcionamiento

1. **Segmentación de Paquetes**: Los paquetes se dividen por código postal en dos zonas asignadas a Ana y Lucas.
2. **División por Peso**: Los paquetes se dividen en dos categorías basadas en su peso.
3. **Asignación a Repartidores**: Ana recibe los paquetes ligeros (≤ 2kg) y Lucas recibe los paquetes pesados (> 2kg).
4. **Registro y Notificación de Entrega**: Se registra la entrega con fecha, hora y DNI del cliente y se notifica al usuario.

### Conclusión

El sistema desarrollado permite una gestión eficiente del reparto de paquetes en una ciudad pequeña, asignando los paquetes según su código postal y peso a dos repartidores con diferentes tipos de vehículos. La implementación es modular y legible, cumpliendo con los requisitos especificados en el enunciado.
