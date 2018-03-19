# Operation Rate Credit Card Api


## Endpoints

/operationRate/{CreditCardName}
/operationRate/verify


## Parte 1
Crear una clase ejecutable con 3 objetos que haga lo siguiente:
a)                      Invocar un método que devuelva toda la información de una tarjeta
b)                      Informar si una operación es valida
c)                      Informar si una tarjeta es válida para operar
d)                      Identificar si una tarjeta es distinta a otra
e)                      Obtener por medio de un método la tasa de una operación informando marca e importe


```
Clase ejecutable main MainModule.java
```


## Setup develop
Core specs: Java 8, Maven3.5

Es necesario tener instalado Maven 3.5.3, Java 8 

- Clonar el repo en su directorio .
Git clone https://github.com/nocampoal/it-challenge-tc.git

- Bajar las dependencias


## Futures/Contemplaciones 

## Se entiende que para obtener la tasa de una operacion es necesario saber con que tarjeta operamos (nombre tarjeta) que es quien contiene la tasa. Para el caso de consulta de una tarjeta inexistente la api retorna bad request 400 y un msj.