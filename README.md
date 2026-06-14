# LlanquihueTourApp

## Descripción

Este proyecto realizado con lenguaje Java fue desarrollado para la asignatura Programación Orientada a Objetos I.  
El sistema diseñado permite leer información de tours desde un archivo externo `tours.txt`, crear objetos de tipo 
`Tour`, almacenarlos en un `ArrayList` y aplicar operaciones básicas como recorrido y filtrado.

Este caso está basado en la agencia de turismo Llanquihue Tour, que necesita organizar sus servicios turísticos 
según tipo, destino y precio.

## Estructura del proyecto

```text
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   ├── Servicio.java
│   │   └── Tour.java
│   ├── data/
│   │   └── GestorDatos.java
│   └── ui/
│       └── Main.java
├── resources/
│   └── tours.txt
└── README.md

```
## Clases Implementadas

- `Servicio`: clase base que contiene atributos comunes como código, nombre, destino y precio.
- `Tour`: clase que hereda de Servicio y agrega el tipo de tour.
- `GestorDatos`: clase encargada de leer el archivo tours.txt, separar los datos con split(";"), crear objetos Tour y almacenarlos en un ArrayList.
- `Main`: clase principal donde se recorre la colección completa y se filtran tours según una condición.

## Archivo de datos

- El archivo `tours.txt` se encuentra en la carpeta `resources/`.
Cada línea contiene datos separados por punto y coma en el formato:
"Nombre;Destino;Precio;Tipo"

- Ejemplo:
Ruta Sabores del Sur;Frutillar;25000;gastronómico

## Funcionalidades

- Lectura de datos desde archivo.txt.
- Separación de datos utilizando split (";").
- Creación de objetos Tour.
- Almacenamiento de objetos en un ArrayList.
- Recorrido de la colección completa.
- Filtrado de tours según una condición preestablecida.
- Asignación de códigos por tipo de tour mediante HashMap.

## Instrucciones de ejecución
- Abrir el proyecto en IntelliJ IDEA.
- Verificar que el archivo `tours.txt` se encuentre dentro de la carpeta resources.
- Abrir la clase Main, ubicada en el paquete ui.
- Ejecutar el método main().
- Revisar la salida generada en consola.

### Autora
Nicole Ortega