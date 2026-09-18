
public class Ejercicio9 {
    public static void main (String[] args) {
        double segundos = 5000;
        double dias = segundos / 86400;
        double horas = (segundos % 86400) / 3600;
        double minutos = (segundos % 3600) / 60;
        double segundosRestantes = segundos % 60;

        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundosRestantes);
    }
}
