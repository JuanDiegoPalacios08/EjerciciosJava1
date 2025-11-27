public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Veremos los Tipos de Datos en Java");
        System.out.println("Lo subiremos en una rama diferente para practica");
        byte  numeroPequeño = 100;
        short numeroMediano = 10000;
        int numeroGrande;

        var numeroMuuyGrande = 100000;
        var n1 = 33;
        long numeroEnorme = 100_000L; // se recomienda usar L para especificar Long
        long numeroEnorme2 = 100_000_000_000L; 

        var numeroFlotante = 3.14F;

        double numeroDouble = 3.12343542343434d; 

        boolean verdadero = true;
        boolean falso = false;
        boolean esMayor = n1 < 18;
        System.out.println(esMayor);

        char caracter = 'A';
        
        String nombre = "Juan Diego Palacios";
        System.out.println(nombre);
        
       // operadores +,-,*,/,%
       int a =10;
       double b = 3;
       var resultadoDivision = a/b;
       System.out.println("Resultado:" + resultadoDivision);
    }
}
