package programas;
import java.util.Scanner;
public class Ejercisio3Tarea08 {
    public static void main(String[] args) {
        int i, mesConMayorCalificacion = 0;
        String mes = "";
        double calificacion, promedioCalificacion = 0.0, sumaCalificaciones = 0.0, mayorCalificacion = 0.0;
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.println("Ingrese las calificaciones del curso durante seis meses:");
        // Proceso de datos
        for (i = 1; i <= 6; i++) {
            System.out.print("Ingrese la calificación del mes " + i + ": ");
            calificacion = lectura.nextDouble();
            sumaCalificaciones += calificacion; // Acumular calificaciones

            // Verificar si la calificación es mayor que la mayor registrada
            if (calificacion > mayorCalificacion) {
                mayorCalificacion = calificacion; // Actualizar la mayor calificación
                mesConMayorCalificacion = i; // Guardar el mes
            }
        }
        // Determinar el mes con la mayor calificación
        switch (mesConMayorCalificacion) {
            case 1: mes = "Enero"; break;
            case 2: mes = "Febrero"; break;
            case 3: mes = "Marzo"; break;
            case 4: mes = "Abril"; break;
            case 5: mes = "Mayo"; break;
            case 6: mes = "Junio"; break;
        }
        // Calcular el promedio de calificaciones
        promedioCalificacion = sumaCalificaciones / 6;
        // Salida de datos
        System.out.println("La suma de las calificaciones del semestre es: " + sumaCalificaciones);
        System.out.println("El promedio de las calificaciones del semestre es: " + promedioCalificacion);
        System.out.println("La mayor calificación está en " + mes + " y asciende a: " + mayorCalificacion);
    }
}
