package Programas;
import java.util.Scanner;
public class Ejercisio1Tarea08 {
    public static void main(String[] args) {
        int i, mesConMayorTemp = 0;
        String mes = "";
        double temperatura, promedioTemp = 0.0, sumaTemp = 0.0, mayorTemp = Double.MIN_VALUE;
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.println("Ingrese las temperaturas promedio del primer semestre:");
        // Proceso de datos
        for (i = 1; i <= 6; i++) {
            System.out.print("Ingrese la temperatura promedio del mes " + i + ": ");
            temperatura = lectura.nextDouble();
            sumaTemp += temperatura; // Acumular temperaturas

            // Verificar si la temperatura es mayor que la mayor registrada
            if (temperatura > mayorTemp) {
                mayorTemp = temperatura; // Actualizar la mayor temperatura
                mesConMayorTemp = i; // Guardar el mes
            }
        }
        // Determinar el mes con la mayor temperatura
        switch (mesConMayorTemp) {
            case 1: mes = "Enero"; break;
            case 2: mes = "Febrero"; break;
            case 3: mes = "Marzo"; break;
            case 4: mes = "Abril"; break;
            case 5: mes = "Mayo"; break;
            case 6: mes = "Junio"; break;
        }
        // Calcular el promedio de temperaturas
        promedioTemp = sumaTemp / 6;
        // Salida de datos
        System.out.println("La suma de las temperaturas del semestre es: " + sumaTemp);
        System.out.println("El promedio de las temperaturas del semestre es: " + promedioTemp);
        System.out.println("La mayor temperatura estuvo en " + mes + " y asciende a: " + mayorTemp);
    }
}
