public class App {
    public static void main(String[] args) throws Exception {
        int miNumero = 10;
        System.out.println("Antes de llamar al método: " + miNumero); // Salida: 10

        modificarNumero(miNumero); // Pasamos una copia de miNumero (el valor 10)

        System.out.println("Después de llamar al método: " + miNumero); // Salida: 10 (la variable original no cambió)
    
        // Llamamos a sumar() y usamos el valor retornado
        int sumaTotal = sumar(5, 3);
        System.out.println("La suma es: " + sumaTotal); // Salida: La suma es: 8

        // Llamamos a esPar() y usamos el valor retornado en un condicional
        int miNumero2 = 4;
        if (esPar(miNumero2)) {
            System.out.println(miNumero2 + " es un número par."); // Salida: 4 es un número par.
        }

        // Llamamos a unirCadenas() y mostramos el resultado directamente
        System.out.println(unirCadenas("Hola", "Mundo")); // Salida: Hola Mundo
    }

     public static void modificarNumero(int num) {
        System.out.println("Dentro del método - Antes de modificar: " + num); // Muestra la copia
        num = num * 2; // Modifica la copia local
        System.out.println("Dentro del método - Después de modificar: " + num); // Muestra la copia modificada
    }

    // Método que suma dos números enteros y devuelve el resultado (un int)
    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado; // Devuelve el valor de 'resultado'
        // Cualquier código después de 'return' en este método NO se ejecutará
    }

    // Método que verifica si un número es par y devuelve un boolean
    public static boolean esPar(int numero) {
        return numero % 2 == 0; // Devuelve directamente el resultado de la expresión booleana
    }

    // Método que concatena dos cadenas y devuelve un String
    public static String unirCadenas(String cad1, String cad2) {
        return cad1 + " " + cad2;
    }
}


