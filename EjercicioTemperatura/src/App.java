import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        final String FECHE_MEDICION = "29/11/2025";
        final String NOMBRE_CANAL = "Tv noticias";
        final int TEMPERATURA_ALERTA_CALOR = 35;
        final int TEMPERATURA_ALERTA_FRIO = 5;
        final double VIENTO_FUERTE = 30.0; // (KM/H)

        //variables del programa
        double fuerzaViento;
        boolean lluviaDiaAnterior;
        boolean posiblePrecipitaciones;
        double temperaturaMaximaDiaAnterior;
        double temperaturaMinimaDiaAnterior;
        double promedioTemperatura;
        String horaMedicion;
        double visibilidadKm;
        int temperaturaExacta;
        double temperaturaHoy;

        //Entrada de datos
        System.out.println("------------------------------------------");
        System.out.println("Reporte del clima "+NOMBRE_CANAL);
        System.out.println("------------------------------------------");

        System.out.println("Temperatura maxima del dia anterior");
        temperaturaMaximaDiaAnterior = entrada.nextDouble();

        System.out.println("Temperatura minima del dia anterior");
        temperaturaMinimaDiaAnterior = entrada.nextDouble();

        System.out.println("Fuerza del viento (km/h)");
        fuerzaViento = entrada.nextDouble();

        System.out.println("Hubo lluvia el dia anterior ?? responde con (true/false)");
        lluviaDiaAnterior = entrada.nextBoolean();

        System.out.println("Hubo posibls precipitaciones ?? responde con (true/false)");
        posiblePrecipitaciones = entrada.nextBoolean();

        System.out.println("Visibilidad en Km");
        visibilidadKm = entrada.nextDouble();

        System.out.println("Hora de medición");
        horaMedicion = entrada.next();

        //CALCULOS CON OPERADORES ARITMETICOS
        promedioTemperatura = (temperaturaMaximaDiaAnterior + temperaturaMinimaDiaAnterior) /2.0;

        //casting double a int
        temperaturaExacta = (int) promedioTemperatura;

        //CALCULAR LA TEMPERATURA DEL DIA DE HOY
        temperaturaHoy = promedioTemperatura;

        //OPERADORES LOGICOS PARA ALERTAS
        boolean hayAlertaCalor = temperaturaHoy >= TEMPERATURA_ALERTA_CALOR;
        boolean hayAlertaFrio = temperaturaHoy <= TEMPERATURA_ALERTA_FRIO;
        boolean hayVientoPeligroso = fuerzaViento > VIENTO_FUERTE;
        boolean hayCondicionesLluvia = lluviaDiaAnterior && posiblePrecipitaciones;
        boolean hayCondicionesExtremas = hayAlertaCalor || hayAlertaFrio || hayVientoPeligroso;

        //OPERADORES RELACIONALES
        boolean visibilidadBuena = visibilidadKm > 10.0;
        boolean visibilidadMala = visibilidadKm < 5.0;
        boolean temperaturaAgradable = temperaturaHoy >= 18.0 && temperaturaHoy <= 25.0;

        //CALCULOS ADICIONALES
        double variacioneTemperatura = temperaturaMaximaDiaAnterior - temperaturaMaximaDiaAnterior;
        double promedioVientoTemperatura = (fuerzaViento + temperaturaHoy) /2.0;
        int temperaturaRedondeada = (int) temperaturaHoy;

        // MOSTRAR LOS RESULTADOS:
        System.out.println("\n ---------------------------------------------------------------");
        System.out.println("                   Resultados del analisis                      ");
        System.out.println("fecha: "+FECHE_MEDICION);
        System.out.println("Hora: "+horaMedicion);

        System.out.println("\n ---- DATOS DEL DIA ANTERIOR ----" );
        System.out.println("Temperatura maxima: "+temperaturaMaximaDiaAnterior +" grados");
        System.out.println("Temperatura minima: "+temperaturaMinimaDiaAnterior +" grados");
        System.out.println("Promedio: "+promedioTemperatura +" grados");
        System.out.println("Promedio exacto: "+temperaturaExacta +" grados");
        System.out.println("Variacion termica: "+variacioneTemperatura+" grados");

        System.out.println("\n Condiciones actuales");
        System.out.println("Fuera del viento: "+fuerzaViento+" km/h");
        System.out.println("lluvia dia anterior: "+lluviaDiaAnterior);
        System.out.println("Posibles precipitaciones: "+posiblePrecipitaciones);

        System.out.println("\n  Temperatura pronostica para hoy es:");
        System.out.println("Temperatura del dia de hoy"+temperaturaHoy+" grados");
        System.out.println("Temperatura redondeada: "+temperaturaRedondeada+" grados");

        System.out.println("\n  Analisis con operadores logicos:");
        System.out.println("Hay alerta de calor: "+hayAlertaCalor);
        System.out.println("Hay alerta de frio: "+hayAlertaFrio);
        System.out.println("Vientos peligrosos: "+hayVientoPeligroso);
        System.out.println("Condiciones de lluvia: "+hayCondicionesLluvia);
        System.out.println("Condiciones Extremas: "+hayCondicionesExtremas);
        System.out.println("visibilidad Buena: "+visibilidadBuena);
        System.out.println("Visibilidad Mala: "+visibilidadMala);
        System.out.println("Temperatura Agradable: "+temperaturaAgradable);

        System.out.println("\n  Calculos Adicionales:");
        System.out.println("Promedio viento temperatura: "+promedioTemperatura);

        System.out.println("\n  =====================================================");
        System.out.println("                  REPORTE TERMINADO                      ");
        System.out.println("\n  =====================================================");
    }
}
