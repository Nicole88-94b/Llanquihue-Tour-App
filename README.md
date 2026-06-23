# LlanquihueTourApp

## Descripción

Aplicación Java para gestionar tours de la agencia Llanquihue Tour. El sistema 
lee datos desde un archivo de texto, valida su contenido, crea objetos y los 
almacena en un ArrayList. Luego muestra la colección completa y filtra tours por 
código.

## Estructura
```text
LlanquihueTourApp/
  src/
    model/
      Servicio.java
      Tour.java
      Guia.java
    data/
      GestorDatos.java
    ui/
      Main.java
  resources/
    tours.txt
  README.md
```
## Paquetes y clases

- `model.Servicio`: clase base con código, nombre, destino y precio.
- `model.Tour`: hereda de Servicio, agrega el tipo y contiene un objeto Guía.
- `model.Guia`: representa al guía responsable y sus datos de contacto.
- `data.GestorDatos`: lee y valida el archivo, crea objetos y los guarda en un ArrayList.
- `ui.Main`: ejecuta la carga, muestra todos los tours y filtra los tours culturales.

## Archivo de datos

El archivo resources/tours.txt utiliza seis campos separados por punto y coma:

nombre;destino;precio;tipo;guia;telefono

## Validaciones

- Cantidad correcta de campos.
- Campos obligatorios no vacíos.
- Precio numérico y mayor que cero.
- Tipo de tour reconocido.
- Manejo de errores de lectura con try-catch.

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que tours.txt este dentro de resources.
3. Ejecutar la clase Main del paquete ui.
4. Revisar la carga completa y el filtro en consola.

## Autora

Nicole Ortega