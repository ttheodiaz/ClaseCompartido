public class Ejercicio11 {
    //Actividad 11: Queremos resolver expresiones del tipo ax+b=c, es decir, ecuaciones de primer grado, en las que x es la incógnita, a y b son los coeficientes y c es el resultado.
//Implementa un programa en el que se pida al usuario los valores de los coeficientes y el resultado, y que nos devuelva el valor de x. El coeficiente a no puede ser 0 (no debes controlar nada de la lógica del programa, sólo introducir los datos).
//Aquí tienes un ejemplo de ejecución:
//Coeficiente a: 2
//Coeficiente b: 3
//Resultado de la ecuación: 8
//En la ecuación 2.0x + 3.0 = 8.0, x = 2.5
    public static void main (String[] args) {
        double a = 20;
        double b = 3;
        double c = 8;
        double x = (c - b) / a;
        System.out.println("En la ecuación " + a + "x + " + b + " = " + c + ", x = " + x);  
    }
}
