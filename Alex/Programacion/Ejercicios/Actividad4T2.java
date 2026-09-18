// Activitat 4: Implementa un programa que calcule el preu
// d'unes sabates esportives amb un preu habitual de 85€
// si aquestes es troben rebaixades un 15%.

public class Actividad4T2 {

    public static void main(String[] args) {

        // ENTRADA
        int preciozapatillas = 85;
        double descuento = 0.15;

        // INSTRUCCIONES
        double preciofinal = preciozapatillas - (preciozapatillas * descuento);
        
        // SALIDA
        System.out.println("El precio final es: " + preciofinal + " euros");

    }

}