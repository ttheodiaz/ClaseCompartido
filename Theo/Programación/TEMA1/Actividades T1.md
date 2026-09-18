Actividad 1: Diseña un algoritmo que calcule el precio de unas zapatillas deportivas con un precio habitual de 85€ si éstas se encuentran rebajadas un 15%.

Entradas:
    Precio: p
Variables:
    final: f
Instrucciones:
    final <- precio * 0,85
Salidas:
    numero final

Actividad 2: Diseña un algoritmo que visualice en pantalla cuánto dinero le dará el banco a un cliente después de seis meses si éste realiza un depósito en una cuenta con el 2,75% de interés anual. El banco debe llevar a cabo una retención del 18% de los intereses para Hacienda.

Entradas:
    numero dinero:
Variables:
    numero interes:
    numero retencion:
    numero limpio:
Instrucciones:
    interes <- dinero * (0.0275 / 2)
    retencion <- interes * 0.18
    limpio <- interes - retencion
Salidas:
    numero limpio

Actividad 3: Modifica el algoritmo anterior para que tanto el valor del depósito como el plazo del mismo se pregunten al usuario.

Entradas:
    introduce numero del @dinero -->
    numero de meses @meses -->
Variables:
    numero interes:
    numero retencion:
    numero limpio:
Instrucciones:
    interes <- dinero * (0.002292 * meses)
    retencion <- interes * 0.18
    limpio <- interes - retencion
Salidas:
    numero limpio

Actividad 4: Diseña un algoritmo que pida al usuario los valores de los lados de un rectángulo (ancho y alto). A partir de estos datos es necesario calcular y escribir en pantalla las longitudes, el perímetro y el área del rectángulo.

Entradas:
    introduce @Ancho (cm):
    introduce @Alto (cm):
Variables:
    Ancho
    Alto
    Area
    Perimetro
Instrucciones:
    Area <- Ancho * Alto
    Perimetro <- 2 * (Ancho + Alto)
Salidas:
    El perimetro es = Perimetro
    Y el area es = Area

Actividad 5: Diseña un algoritmo para calcular y mostrar el área (2·π·r2 + 2·π·r·h) y el volumen (π·r2·h) de un cilindro. Los valores del diámetro y la altura se solicitarán al usuario.

Entradas:
    introduce @diametro:
    introduce @altura:
Variables:
    area
    volumen
    radio
    diametro
    altura
Instrucciones:
    radio <- diametro / 2
    area <- (2 * π * (radio * radio)) + (2 * π * radio * altura)
    volumen <- π * (radio * radio) * altura
Salidas:
    El area es @area y el volumen es @volumen

Actividad 6: Diseña un algoritmo que pida al usuario su edad. En función de la edad introducida, mostrará un mensaje indicando si es menor o mayor de edad.

Entradas:
    @edad: 21
Variables:
    edad
Instrucciones:
    si edad >= 18
        eres mayor de edad
    si no
        eres menor de edad
Salidas:
    eres mayor de edad

Actividad 7: Diseña un algoritmo que pida al usuario 3 números. Si el primero es positivo, se calculará el producto de los otros dos. En caso contrario, se debe hacer la suma. Muestra en ambos casos el resultado.

Entradas:
    @num1  4
    @num2. 6
    @num3  5
Variables:
    num1
    num2
    num3
Instrucciones:
    si num1 >= 0
        num2 * num3
    si no
        num2 + num3
Salidas:
    30

Actividad 8: Diseña un algoritmo que solicite al usuario una cantidad de segundos y los convierta en días, horas, minutos y segundos. Visualiza el resultado por pantalla.

Entradas:
    introduce @segundos:
Variables:
    numero dias:
    numero horas:
    numero minutos:
    numero segundosRestantes:
    numero resto:
Instrucciones:
    dias <- segundos / 86400
    resto <- segundos % 86400
    horas <- resto / 3600
    resto <- resto % 3600
    minutos <- resto / 60
    segundosRestantes <- resto % 60

Salidas:
    dias, horas, minutos y segundosRestantes


Actividad 9: Una temperatura expresada en grados Celsius (lo que se conoce como grados centígrados) puede ser convertida a la temperatura equivalente en Fahrenheit aplicando la siguiente fórmula: f=(9/5)c+32, donde f representa los grados Fahrenheit y c los grados Celsius. Diseña un algoritmo que solicite al usuario el número de grados Celsius e indique el equivalente en Fahrenheit.

Entradas:
    introduce @gradoscelsius
Variables:
    gradoscelsius
    fahrenheit
Instrucciones:
    fahrenheit <- (9 / 5) * c + 32
Salidas:
    "Grados fahrenheit = (fahrenheit)"


Actividad 10: Diseña un algoritmo que pida y calcule la suma de una serie de números introducidos por teclado. El programa finalizará cuando el usuario introduzca un -1.

Entradas:
    introduce numero (repetir hasta -1)
Variables:
    numero[lista]
    suma
Instrucciones:
    suma <- 0
    Leer numero
    Si numero >= -1 
        mostrar suma y terminar
    Si no
        suma <- suma + n
Salidas:
    suma

Actividad 11: Diseña un algoritmo que visualice el mayor número de una serie de números introducidos por teclado. La serie de números finalizará cuando el usuario introduzca un -1.

Entradas:
    introduce numero (repetir hasta -1)
Variables:
    numero[lista]
    mayor
Instrucciones:
    mayor <- 0
    Leer numero (repetir hasta que se acaben los numeros)
    Si numero >= -1
        mostrar mayor y terminar
    Si mayor < numero
        mayor <- numero
    Si no
        Comprobar siguiente numero
Salidas:
    Mayor

Actividad 12: ¿Qué crees que pueden hacer las siguientes sentencias? La actividad consiste en averiguar y explicar brevemente qué acción crees que realiza cada línea de código.



```java
int x;
int tamano = 27;
String nombre = "Fido";
Perro miPerro = new Perro (nombre, tamano);

x = tamano - 5;
if (x < 15) miPerro.ladra (8);

while (x < 3) {
   miPerro.juega ();
}

int[] lista = {2, 4, 6, 8};

System.out.print ("Hola");
System.out.print ("Perro: " + nombre);

String num = "8";
int z = Integer.parseInt (num);

try {
   leerFichero ("miFichero.txt");
}
catch (FileNotFoundException ex) {
   System.out.println ("Fichero no encontrado");
}
```

int x; Declara una variable

int tamano = 27; indica un numero y lo guarda en la variable "tamano"

String nombre = "Fido"; Indica una palabra y la guarda en la variable "nombre"

Perro miPerro = new Perro (nombre, tamano); Esto no se muy bien lo que hace, parece que hace como un grupo con la informacion de antes

x = tamano - 5; Utiliza la variable creada previamente para darle un valor, en este caso "tamano" - 5

if (x < 15) miPerro.ladra (8); Condicional, si X es menor que 15, el perro ladra 8 veces

while (x < 3) { miPerro.juega (); } Bucle, mientras x sea menor que 3 el perro juega.

int[] lista = {2, 4, 6, 8}; Crea una lista con esos 4 números dentro.

System.out.print ("Hola"); Imprime la palabra "Hola".

System.out.print ("Perro: " + nombre); Imprime "Perro:" y el nombre del perro (Fido).

String num = "8"; Guarda el texto "8" en la variable num.

int z = Integer.parseInt (num); No tengo claro lo que hace esto.

try { leerFichero ("miFichero.txt"); } catch (FileNotFoundException ex) { System.out.println ("Fichero no encontrado"); } <- Intenta leer un arcvivo, y si no lo encuentra, en vez de que se roma el programa, muestra el mensaje "Fichero no encontrado".
