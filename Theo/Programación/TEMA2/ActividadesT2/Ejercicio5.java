//Actividad 5: Implementa un programa que visualice en pantalla cuánto dinero le dará el banco a un cliente después de seis meses si éste realiza un depósito en una cuenta con el 2,75% de interés anual. El banco debe llevar a cabo una retención del 18% de los intereses para Hacienda.

public class Ejercicio5 {
    public static void main(String[] args) {
        double deposito = 1000;
        double interesAnual = 0.0275;
        double retencion = 0.18;

        double interes = deposito * (interesAnual / 2);
        double retencionHacienda = interes * retencion;
        double dineroFinal = deposito + interes - retencionHacienda;

        System.out.println("Dinero final seis meses después: " + dineroFinal);
    }
}