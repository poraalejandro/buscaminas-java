#### Posición: Programador Java júnior FNMT

#### Nombre y apellidos: Alejandro Gómez Pora

#### Fecha: 29/11/2021

# BUSCAMINAS

Escribe en pseudocódigo (o en el lenguaje deseado) el diseño de una versión simplificada del buscaminas con un tablero
de 8x8. Esta versión simplificada no implementa los números que avisan al jugador de minas cercanas, es decir, el
jugador jugará a ciegas. Sin embargo, sí que podrá descubrir casillas y saber si había una mina o no en su interior. No
es necesario implementar las funciones de entrada del usuario ni las de salida/visualización.

# TEST

### PRUEBA CUESTIONARIO JAVA:

A continuación te proponemos una serie de preguntas que hemos planteado el equipo de desarrollo de EQTic. Trata de
responder sin extenderse más de lo que conlleva una respuesta clara y precisa. Hemos estimado un tiempo máximo de 45
minutos para realizar esta prueba.

##### 1. ¿Qué es MVC?

MVC (Modelo-Vista-Controlador) es un patrón de diseño de software utilizado común y precursor de la Arquitectura
Hexagonal, para implementar interfaces de usuario, datos y lógica de control. Permite separar la lógica de negocios y su
visualización.

##### 2. ¿Cuándo y por qué son los getters y setters importantes?

Los getter y los setter permiten añadir protección a los datos. También previene de realizar cambios indeseados en otra
arte del código dónde se usen las variables.

##### 3. ¿Qué significa la palabra clave “static”, y dónde puede ser usada?

Cuando declaramos un campo estático , se crea exactamente una única copia de ese campo y se comparte entre todas las
instancias de esa clase.

##### 4. ¿Cuáles son las diferencias entre interfaces, clases abstractas, clases e  instancias?

Una interfaz solo puede extender de otra interfaz(o incluso varias a la vez), tener métodos abstractos y públicos, y
solo tener variables public static final.

Las clases abstractas, pueden tener constructores, implementaciones de método por defecto y solo se pueden heredar una
sola vez de ellas. La principal diferencia de una clase abstracta respecto a una convencional es que debe tener al menos
un método abstracto.

La instancia es el objeto o evento concreto que nace de la estructura definida en la clase.

##### 5. ¿Cómo pruebas tu código?

Para probar el código lo básico es hacer las pruebas unitarias con JUnit y también tenemos pruebas de Integración para
hacer pruebas punto a punto.

##### 6. ¿Cuáles son los datos primitivos en Java?

Números enteros (byte, short, int, long). Números reales (float, double). Carácter (char). Booleano o lógico (boolean).

##### 7. ¿Cómo puedo convertir una cadena en un entero?

Haciendo uso de la clase Integer y de su método parseInt().

##### 8. ¿Cuáles son las diferencias entre TRY – CATCH – FINNALLY?

El bloque catch sólo se ejecuta si se lanza una excepción en el bloque try. El bloque finally se ejecuta siempre después
del bloque try(-catch), tanto si se lanza una excepción como si no.

### PREGUNTAS SQL

##### 9. ¿Qué es una foreign key? Pon un ejemplo/caso.

Es una key para relacionar dos tablas. Ejemplo: Tenemos la tabla Productos y Pedidos, cada una con su key, ProductID y
OrderID respectivamente. ProductID la utilizaremos también en la tabla Pedidos y así relacionar las tablas. Ahora
sabremos que producto es el que va en el pedido.

##### 10. ¿Qué es una secuencia? Pon un ejemplo/caso.

Una secuencia es un objeto que genera una secuencia de valores numéricos. Se puede definir su intervalo o su orden. Se
puede tener más de una por tabla. Ejemplo: Podemos utilizar una secuencia para generar valores que serán a signados a un
campo ID en una tabla de facturas.

##### 11. ¿Cómo diseñaría una base de datos si tuviera que almacenar un formulario de 3 campos  (cadena de 10 caracteres), dónde uno de estos campos queremos que sea un desplegable y  queremos poder cambiar la etiqueta del desplegable rápidamente?

Tomando la premisa de que lo que se desea modificar son los valores del desplegable de manera sencilla sin afectar al
formulario, se propone hacer un modelo de la siguiente manera:

Formulario usa los campos Columna1, Columna2 y Columna3 de la Tabla 1.

Tabla 1:

- Columna 1: NOMBRE_CAMPO_1(char10)
- Columna 2: NOMBRE_CAMPO_2(char10)
- Columna 3: FK_Tabla2.id

Tabla 2:

- Columna 1: id (int)
- Columna 2: NOMBRE_CAMPO (char10)

Cuando deseemos hacer modificaciones rápidas en el desplegable del formulario, modificamos el valor de Tabla2.Columna2.
