# LlanquihueTourApp

## Descripción

Esta aplicación Java fue desarrollada para la agencia Llanquihue Tour.  
El objetivo de esta semana es representar distintos servicios turísticos mediante una jerarquía de clases con herencia simple.

El sistema lee información desde un archivo de texto, valida los datos principales, crea objetos según el código del servicio y los almacena en una colección `ArrayList`. Luego muestra todos los servicios cargados y realiza un filtro por código desde la clase `Main`.


## Objetivo de la Semana 6

Implementar una jerarquía de clases utilizando Programación Orientada a Objetos, aplicando:

- Clase base con atributos comunes.
- Subclases con atributos específicos.
- Uso de `super(...)` en los constructores.
- Sobrescritura del método `toString()`.
- Organización del proyecto por paquetes.
- Creación y visualización de objetos desde la clase principal.

## Estructura
```text
LlanquihueTourApp/
  src/
    model/
      ServicioTuristico.java
      RutaGastronomica.java
      PaseoLacustre.java
      ExcursionCultural.java
      Guia.java
    data/
      GestorServicios.java
    ui/
      Main.java
  resources/
    tours.txt
  README.md
```
## Paquetes y clases

### model

Contiene las clases que representan el modelo del sistema.

- `ServicioTuristico`: clase base con los atributos comunes de los servicios turísticos.
- `RutaGastronomica`: subclase que representa rutas gastronómicas e incorpora el número de paradas.
- `PaseoLacustre`: subclase que representa paseos lacustres e incorpora el tipo de embarcación.
- `ExcursionCultural`: subclase que representa excursiones culturales e incorpora el lugar turístico o histórico.
- `Guia`: clase que representa al guía responsable del servicio.

### data

Contiene la clase encargada de leer y crear los objetos.
- `GestorServicios`: lee el archivo tours.txt, valida sus datos y crea objetos de las subclases correspondientes según el código del servicio.

### ui

Contiene la clase principal del programa.
- `Main`: ejecuta el programa, muestra todos los servicios turísticos y filtra los servicios culturales por código.

## Archivo de datos

El archivo resources/tours.txt utiliza ocho campos separados por punto y coma:

codigo;nombre;destino;precio;duracionHoras;nombreGuia;telefonoGuia;atributoEspecial

- Ejemplo: 
01GA; Ruta Sabores del Sur;Frutillar;25000;5;Camila Soto;+56956732190;4

## Códigos de servicio
- 01GA: Ruta gastronómica.
- 02LA: Paseo lacustre.
- 03CU: Excursión cultural.

Según el código leído desde el archivo, el sistema crea un objeto de la subclase correspondiente.

## Validaciones Implementadas

- Cantidad correcta de campos por línea.
- Campos obligatorios no vacíos.
- Precio numérico y mayor que cero.
- Duración numérica y mayor que cero.
- Código de servicio reconocido.
- Teléfono del guía no vacío.
- Manejo de errores mediante bloques try-catch.

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que tours.txt este dentro de resources.
3. Ejecutar la clase Main del paquete ui.
4. Revisar la salida generada en consola.

## Autora

Nicole Ortega