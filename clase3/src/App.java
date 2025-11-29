import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ejercicoIMC();
    }

    public static void ejemploConversion(){
         //ejemplo1
         int cantidad = 5;
         int total =4;
         double promedio = (double) total / cantidad; //division entera
         System.out.println("Promedio entero: "+promedio);

         //situacion 1 conversion implicita: pequeño --> grande
         int numeroEntero = 10;
         double numeroDouble = numeroEntero; // conversion implicita
         System.out.println("Numero double (implicito): "+numeroDouble);

         //situacion 2 conversion implicita con operaciones
         byte a = 5;
         byte b = 10;
         int suma = a + b; // a y b se convierten implicitamente a int
         System.out.println("sume implicita: "+suma);        

         //situacion 3 conversion explicita: grande -> pequeño
         double valorDouble = 9.78;
         int valorEntero = (int) valorDouble;
         System.out.println("valor entero (explicito): "+valorEntero);

         //ejemplo chat
         int a2 = 2;
         int b2 = 16;
         double c1 = (double) a2 / b2 ; // 0.125
         double c2 = (double) (a2 / b2); //0.0
         System.out.println(c1 + " : " +c2);
    }

    public static void ejemploScanner(){
        var sc = new Scanner(System.in); //fuente de escucha desde la consola

        System.out.println("Ingrese su edad: ");
        int edadUsuario = sc.nextInt();

        System.out.println("Ingrese su salario: ");
        double salarioUsuario  = sc.nextDouble();

        sc.nextLine(); // Consume el salto de linea pendiente para limpiar el buffer después del nexInt

        System.out.println("Ingrese su nombre completo: ");
        String nombreUsuario = sc.nextLine();

        System.out.println("Hola "+nombreUsuario+", tienes "+edadUsuario+ " años y ganas "+salarioUsuario);
        sc.close();
    }

    public static void ejemploRelacionales(){
        int a = 10;
        int b = 5;
        
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        boolean resultado = a != b;
        System.out.println("El resultado de a != b es: "+resultado);
    }

    public static void ejercicoIMC(){
        var sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.println("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
        
        double imc = peso / (altura * altura);

        System.out.println("------Resultaods-----");
        System.out.println("Su indice de masa corporal (IMC) es: "+imc);
        System.out.println("IMC menor que 18.5 bajo peso: "+(imc < 18.5));
        System.out.println("IMC entre 18.5 y 24.9: Peso normal: "+(imc >= 18.5 && imc <= 24.9));
        System.out.println("IMC mayor que 25  "+(imc > 25));
    }
}
