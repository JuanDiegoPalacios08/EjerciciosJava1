import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Menu();
    }

    public static void Menu() {
        var sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Analizador de Numeros y Secuencias ---\n");
            System.out.println("1. Analizar un solo numero.");
            System.out.println("2. Generar secuencia de numeros.");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Analizando un solo numero");
                    System.out.print("Ingrese un numero entero:");
                    int numero = sc.nextInt();
                    String r1 = (numero < 0) ? "Negativo" : "Positivo";
                    System.out.printf("El numero %d es %s%n", numero, r1);
                    String r2 = (numero % 2 == 0) ? "Par" : "Impar";
                    System.out.printf("El numero %d es %s%n", numero, r2);
                    String r3 = (numero <= 100) ? "Menor o igual" : "Mayor";
                    System.out.printf("El numero %d es %s que 100%n", numero, r3);
                    break;
                case 2:
                    System.out.println("Generando una secuencia de numeros");
                    System.out.print("Ingrese el numero inicial");
                    int inicio = sc.nextInt();
                    System.out.print("Ingrese el numero final: ");
                    int fin = sc.nextInt();
                    System.out.print("¿Mostrar solo 'par' o 'impar'?: (p/i) ");
                    sc.nextLine(); // limpiamos el buffer

                    String tipo = sc.nextLine();
                    if (tipo.equals("p")) {
                        for (int i = inicio; i <= fin; i++) {
                            if (i % 2 == 0) {
                                System.out.print(i + " ");
                            } else {
                                continue;
                            }
                        }
                    } else {
                        for (int i = inicio; i <= fin; i++) {
                            if (i % 2 != 0) {
                                System.out.print(i + " ");
                            } else {
                                continue;
                            }
                        }
                    }

                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta Luego!");
                    break;

                default:
                    System.out.println("Opcion no valida.Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }

}
