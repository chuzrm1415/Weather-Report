Weather-Report
=======================

* Nombre: Jesús Rojas Monge.
* Carnet: 2015023095



Aplicación para obtener el reporte del tiempo mediante un proveedor ( https://openweathermap.org/ )


### Opciones de compilación:

###### NOTA: La ejecución del programa hace uso de Apache Maven ( https://maven.apache.org/ )

Preparar el ejecutable mediante Maven. (desde la carpeta del proyecto):

```bash
mvn clean install
```

Ejecutar el programa para consulta mediante el nombre de la ciudad:
###### **Cambie la ciudad a consultar*

```bash
mvn exec:java -Dexec.args="city Alajuela"
```

Ejecutar el programa para consulta mediante el zipCode:
###### **Modifique el numero zipCode, seguido del codigo del pais*

```bash
mvn exec:java -Dexec.args="zipcode 30101,cr"
```

## Evaluacion

Nota 7.5

- El tag de revision era "tarea-1" no "v1.0.0"
- No venian los comandos de IMN
- El comando de zip no tenia el nombre solicitado
