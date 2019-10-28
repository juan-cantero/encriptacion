# *encriptacion*

###### **Debe implementar la clase EncriptadorNaive, que se encarga de transformar cadenas de texto para que puedan ser enviadas por una red de**
###### **computadoras en forma segura. La misma posee una única forma de encriptar que consiste en cambiar el orden de las palabras. Luego,**
###### **debe agregar nuevas formas de encriptar y desencriptar, por ejemplo:**
* 1. Modificando cada aparición de una vocal en el texto por la vocal siguiente en el orden tradicional, esto es: si aparece una a, la
cambia por una e, si aparece una e la cambia por una i y así siguiendo.  Para las consonantes, números y cualquier otro carácter no
realiza ningún cambio.
* 2. Escribiendo cada letra por un numero que la representa. Las letras del abecedario están numeradas la ‘a’ con el 1, la ‘b’ con el 2 y
así siguiendo. El espacio esta representado por el numero 0 y los números están separados por comas. Por ejemplo la palabra
“Diego” se representa por la cadena “4,9,5,7,15”. No se distinguen mayúsculas, ni minúsculas. Asuma que no hay acentos ni otros
caracteres diferentes a las letras y los espacios.
Por su parte, el método desencriptar realiza la inversa de cada uno. Recibe un String como parámetro y retorna otro String donde realizo la
desencriptacion.

*public String encriptar(String texto)*
*public String desencriptar(String texto)*


###### Sobre este enunciado:
* 1. Realice un diagrama de clases UML de la solución propuesta
* 2. Realice los test de unidad necesarios para la clase EncriptadorNaive y sus método encriptar y desencriptar, para que pueda ser
utilizada para encriptar y desencriptar cadenas de texto utilizando las diferentes formas de encriptación.
* 3. Implemente en Java.
