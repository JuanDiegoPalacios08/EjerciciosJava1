import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // EjemploIf();
        // EjemploIf_else();
        // Ejemplo_if_anidado();
        // Switch();
        // ExpresionSwitch();
        // ExpresionSwitch_Yield();
        // CicloWhile();
        // CicloDoWhile();
        // CicloFor();
        // CicloForBreak();
        // CicloForContinue();
        Ternario();
    }

    public static void EjemploIf() {
        int numero = 10;

        if (numero > 0) {
            // Este código se ejecuta SOLO si 'numero' es mayor que 0
            System.out.println("El número es positivo.");
        }
        // Si numero fuera -5, la línea anterior no se ejecutaría, y el programa
        // continuaría aquí.
    }

    public static void EjemploIf_else() {
        int numero = 7;

        if (numero % 2 == 0) { // Si el residuo de la división por 2 es 0, es par
            System.out.println("El número es par.");
        } else { // Si la condición del if es false...
            System.out.println("El número es impar.");
        }

    }

    public static void Ejemplo_if_anidado() {
        int calificacion = 85;

        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 80) { // Se evalúa SOLO si la primera condición (calificacion >= 90) fue false
            System.out.println("Muy Bien");
        } else if (calificacion >= 70) { // Se evalúa SOLO si las condiciones anteriores fueron false
            System.out.println("Bien");
        } else { // Se ejecuta si ninguna de las condiciones anteriores fue true
            System.out.println("Necesita mejorar");
        }

    }

    public static void Switch() {
        int diaSemana = 3; // 1=Lunes, 2=Martes, etc.
        String nombreDia;

        switch (diaSemana) { // La variable a evaluar
            case 1: // Si diaSemana es 1...
                nombreDia = "Lunes";
                break; // Importante: sale del switch después de ejecutar el código del case
            case 2: // Si diaSemana es 2...
                nombreDia = "Martes";
                break;
            case 3: // Si diaSemana es 3...
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6: // Múltiples casos pueden compartir el mismo bloque de código
            case 7:
                nombreDia = "Fin de semana";
                break;
            default: // Opcional: se ejecuta si el valor de diaSemana no coincide con ningún 'case'
                nombreDia = "Día inválido";
                break; // Es buena práctica poner break incluso en el default
        }
        System.out.println("El día es: " + nombreDia); // Salida: El día es: Miércoles

    }

    public static void ExpresionSwitch() {
        int diaSemana = 3; // 1=Lunes, 2=Martes, etc.

        // Usando switch expression para asignar un valor a una variable
        String nombreDiaModerno = switch (diaSemana) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6, 7 -> "Fin de semana"; // Múltiples casos separados por coma
            default -> "Día inválido";
        }; // Nota el punto y coma al final de la expresión switch

        System.out.println("El día (moderno) es: " + nombreDiaModerno); // Salida: El día (moderno) es: Miércoles

    }

    public static void ExpresionSwitch_Yield() {
        // También puedes usar bloques con 'yield' si necesitas más de una línea de
        // código en un case
        int mes = 2;
        int diasEnMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                // Lógica más compleja si es necesario
                System.out.println("Considerando Febrero...");
                yield 28; // 'yield' devuelve el valor para este case
            }
            default -> {
                System.out.println("Mes inválido.");
                yield -1; // Devuelve -1 para un mes inválido
            }
        };
        System.out.println("Días en el mes " + mes + ": " + diasEnMes);

    }

    public static void CicloWhile() {
        int contador = 0; // Inicialización de una variable de control del bucle

        while (contador < 5) { // Condición: el bucle se repite mientras 'contador' sea menor que 5
            System.out.println("Iteración: " + contador);
            contador++; // Actualización: incrementa 'contador' en 1. ¡Esto es CRUCIAL!
        }
        // Salida:
        // Iteración: 0
        // Iteración: 1
        // Iteración: 2
        // Iteración: 3
        // Iteración: 4
        // Cuando contador llega a 5, la condición (5 < 5) es false, y el bucle termina.

    }

    public static void CicloDoWhile() {
        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0); // La condición se evalúa después de la primera ejecución y en cada iteración
                               // subsiguiente

        System.out.println("Número ingresado: " + numero);
        scanner.close();
        // Este bucle siempre pedirá un número al menos una vez. Si el primer número es
        // positivo, la condición es false y el bucle termina. Si no, seguirá pidiendo
        // hasta que se ingrese uno positivo.

    }

    public static void CicloFor() {
        // Sintaxis: for (inicialización; condición; actualización) { // código }

        for (int i = 1; i <= 10; i++) { // i empieza en 1; el bucle continúa mientras i <= 10; i se incrementa en 1
                                        // después de cada iteración
            System.out.println("Contando: " + i);
        }
        // Salida:
        // Contando: 1
        // Contando: 2
        // ...
        // Contando: 10

    }

    public static void CicloForBreak() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Encontrado el número 5. Saliendo del bucle.");
                break; // Sale del bucle for
            }
            System.out.println("Procesando: " + i);
        }
        System.out.println("Después del bucle.");
        // Salida:
        // Procesando: 1
        // Procesando: 2
        // Procesando: 3
        // Procesando: 4
        // Encontrado el número 5. Saliendo del bucle.
        // Después del bucle.

    }

    public static void CicloForContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // Si i es impar...
                System.out.println("Saltando número impar: " + i);
                continue; // Salta el resto del código en esta iteración (el println de abajo)
            }
            // Este código solo se ejecuta si i es par
            System.out.println("Procesando número par: " + i);
        }
        // Salida:
        // Saltando número impar: 1
        // Procesando número par: 2
        // Saltando número impar: 3
        // Procesando número par: 4
        // ... y así sucesivamente.

    }

    public static void Ternario (){
        int numero = 7;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar" ;
        System.out.println("El numero " +numero+ " es " +resultado);
    }
}
