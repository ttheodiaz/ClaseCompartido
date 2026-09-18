public class Ejercicio8 {
    public static void main (String[] args) {
        
        double diametro = 10;
        double altura = 20;
        double radio = diametro / 2;
        double area = (2 * 3.14 * (radio * radio)) + (2 * 3.14 * radio * altura);
        double volumen = 3.14 * (radio * radio) * altura;

        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);
    }
}