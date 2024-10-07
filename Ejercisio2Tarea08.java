package programas;
import java.util.Scanner;
public class Ejercisio2Tarea08 {
    public static void main(String[] args) {
         int i, mesConMayorGasto = 0;
        String mes = "";
        double gasto, promedioGasto = 0.0, sumaGastos = 0.0, mayorGasto = 0.0;
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.println("Ingrese los gastos mensuales del primer semestre (S/.):");
        // Proceso de datos
        for (i = 1; i <= 6; i++) {
            System.out.print("Ingrese el gasto del mes " + i + ": ");
            gasto = lectura.nextDouble();
            sumaGastos += gasto; // Acumular gastos
            // Verificar si el gasto es mayor que el mayor registrado
            if (gasto > mayorGasto) {
                mayorGasto = gasto; // Actualizar el mayor gasto
                mesConMayorGasto = i; // Guardar el mes
            }
        }
        // Determinar el mes con el mayor gasto
        switch (mesConMayorGasto) {
            case 1: mes = "Enero"; break;
            case 2: mes = "Febrero"; break;
            case 3: mes = "Marzo"; break;
            case 4: mes = "Abril"; break;
            case 5: mes = "Mayo"; break;
            case 6: mes = "Junio"; break;
        }
        // Calcular el promedio de gastos
        promedioGasto = sumaGastos / 6;
        // Salida de datos
        System.out.println("La suma de los gastos del semestre es:  S/." + sumaGastos);
        System.out.println("El promedio de los gastos del semestre es: S/. " + promedioGasto);
        System.out.println("El mayor gasto lo hiciste en " + mes + " y asciende a: S/. " + mayorGasto);
    }
}
