import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nombreVendedor = "";
        double salarioBase = 1500.000;
        double comisionTotal = 0.0;
        double metaMensual = 2000.000;
        boolean esSupervisor = false;
        int clienteAtendidos = 0;
        double descuentosOtorgados = 0.0;
        double totalVendido = 0.0;
        int ventasRealizadas = 0;

        // Bienvenida
        System.out.println("==========================================");
        System.out.println("Bienvenido al sistema de gestión de ventas");
        System.out.println("==========================================");
        System.out.print("Ingrese su Nombre:");
        nombreVendedor = sc.nextLine();

        System.out.println("¿Es usted supervisor (1= Si, 2= No)?");
        int rolDecision = sc.nextInt();

        esSupervisor = (rolDecision == 1) ? true : false;
        salarioBase = esSupervisor ? 2000.000 : 1500.000;
        String cargo = esSupervisor ? "Supervisor de ventas" : "vendedor";

        System.out.println("Hola " + nombreVendedor + " :)");
        System.out.println("Cargo " + cargo);
        System.out.println(" Meta mensual de ventas: " + metaMensual);

        /* Menu principal con un do while */
        int opcionMenu;
        boolean sistemaActivo = true;

        do {
            System.out.println("==========================================");
            System.out.println(" Resumen actual ");
            System.out.println("==========================================");
            System.out.println(" Vendedor " + nombreVendedor);
            System.out.println(" Total Vendido: " + totalVendido);
            System.out.println(" Meta Mensual " + metaMensual);
            System.out.println(" Progreso " + (totalVendido / metaMensual));
            System.out.println(" Ventas realizadas " + ventasRealizadas);
            System.out.println(" Comision acumulada " + comisionTotal);

            // Menu principal
            System.out.println("Menu Principal ");
            System.out.println("1. Registrar una nueva venta");
            System.out.println("2. Ver estadistica detallada");
            System.out.println("3. Calcular el salario mensual");
            System.out.println("4. Evaluar cumplimiento de meta");
            System.out.println("5. Procesar devolucion");
            System.out.println("6. Cerrar seccion");
            System.out.print("\nSelecciona una opcion");

            opcionMenu = sc.nextInt();
            while (opcionMenu < 1 || opcionMenu > 6) {
                System.out.println("Opcion invalida por favor digita un numero valido");
                opcionMenu = sc.nextInt();
            }

            switch (opcionMenu) {
                case 1:
                    System.out.println("=========================");
                    System.out.println("Registro de nueva venta");
                    System.out.println("=========================");

                    clienteAtendidos++;
                    System.out.println("Catalogo de productos");
                    System.out.println("1. laptop - 1600.000");
                    System.out.println("2. tablet - 1000.000");
                    System.out.println("3. celular - 2000.000");
                    System.out.println("4. Auriculares - 100.000");
                    System.out.println("5. Mouse inalambrico - 100.000");
                    System.out.println(" Cuantos productos diferentes comprara el cliente");
                    int cantidadProductos = sc.nextInt();

                    // validacion con un while

                    while (cantidadProductos < 1 || cantidadProductos > 5) {
                        System.out.println("Ingrese un numero valido");
                        cantidadProductos = sc.nextInt();
                    }
                    double totalVenta = 0.0;

                    for (int i = 1; i <= cantidadProductos; i++) {
                        System.out.println("\n --- Producto # " + i + "---");
                        System.out.println("Seleccione el producto entre 1 - 5");
                        int productoSeleccionado = sc.nextInt();
                        System.out.println(" Cantidad a comprar: ");
                        int cantidad = sc.nextInt();

                        double precioUnitario = 0.0;
                        String nombreProducto = "";

                        // switch para el precio del producto
                        switch (productoSeleccionado) {
                            case 1:
                                precioUnitario = 1600.000;
                                nombreProducto = "laptop";
                                break;
                            case 2:
                                precioUnitario = 1000.000;
                                nombreProducto = "Tablet";
                                break;
                            case 3:
                                precioUnitario = 2000.000;
                                nombreProducto = "Celular";
                                break;
                            case 4:
                                precioUnitario = 100.000;
                                nombreProducto = "Auriculares";
                                break;
                            case 5:
                                precioUnitario = 100.000;
                                nombreProducto = "Mouse inalambrico";
                                break;
                            default:
                                precioUnitario = 0.0;
                                nombreProducto = "Nombre no valido";
                                break;
                        }
                        double subtotal = precioUnitario * cantidad;
                        System.out.println("Cantidad " + cantidad + " x " + nombreProducto + " =$ " + subtotal);
                    }
                    System.out.println("Subtotal " + totalVenta);
                    System.out.println("Aplicar descuento di tiene tarjeta de fidelidad (1. Si , 2. No)");
                    int tieneTarjeta = sc.nextInt();

                    double descuento = 0.0;

                    if (tieneTarjeta == 1) {
                        if (totalVenta >= 200.000) {
                            descuento = totalVenta * 0.15;
                            System.out.println(" Descuento aplicado del 15% por compra mayor a 200.000");
                        } else if (totalVenta >= 120.000) {
                            descuento = totalVenta * 0.10;
                            System.out.println("Descuento aplicado del 10% por compra mayor a 120.000");
                        } else if (totalVenta >= 70.000) {
                            descuento = totalVenta * 0.05;
                            System.out.println("Descuento aplicado es del 5% por comprar mayores a 70.000");
                        } else {
                            System.out.println("Compra minima para aplicar a un descuento es de 70.000");
                        }
                        descuentosOtorgados = descuentosOtorgados + descuento;
                    }
                    totalVenta = totalVenta - descuento;
                    System.out.println("Total a pagar " + totalVenta);
                    // Seleccion del metodo de pago
                    System.out.println("\n metodo de pago");
                    System.out.println("1.Efectivo");
                    System.out.println("2. Tarjeta de Credito");
                    System.out.println("3. Transferencia Bancaria");
                    System.out.println("Seleccione");
                    int metodoPago = sc.nextInt();

                    String metodoTexto = "";

                    switch (metodoPago) {
                        case 1:
                            metodoTexto = "efectivo";
                            System.out.println(" Monto recibido $");
                            double montoRecibido = sc.nextDouble();
                            double cambio = montoRecibido - totalVenta;

                            // operador ternario
                            String mensaje = (cambio >= 0) ? "Cambio " + cambio : " Monto insuficiente";
                            System.out.println(mensaje);
                            if (cambio < 0) {
                                System.out.println("Venta cancelada");
                                break;
                            }
                            break;
                        case 2:
                            metodoTexto = " Tarjeta de credito";
                            System.out.println(" Pago procesado correctamente");

                            break;
                        case 3:
                            metodoTexto = "Transferencia bancaria";
                            System.out.println("Transferencia confirmada");
                            break;
                        default:
                            metodoTexto = "Metodo no valido para pagar";
                            System.out.println(" Metodo de pago no valido ");
                            break;
                    }
                    if (metodoPago >= 1 && metodoPago <= 3) {
                        double comision = 0.0;
                        if (totalVenta >= 110.000) {
                            comision = totalVenta * 0.08;
                        } else if (totalVenta >= 80.000) {
                            comision = totalVenta * 0.05;
                        } else {
                            comision = totalVenta + 0.03;
                        }
                        // bonus por ser supervisor
                        comision = esSupervisor ? comision * 1.2 : comision;
                        comisionTotal = comisionTotal + comision;
                        totalVendido = totalVendido + totalVenta;
                        ventasRealizadas++;

                        System.out.println("Venta registrada exitosamente ");
                        System.out.println(" Tickect " + ventasRealizadas);
                        System.out.println(" Monto " + totalVenta);
                        System.out.println(" Metodo " + metodoTexto);
                        System.out.println(" Tu comision " + comision);
                        break;
                    }
                case 2:
                    System.out.println("Estadistica detallada");
                    System.out.println("Vendedor " + nombreVendedor);
                    System.out.println("Salario Base " + salarioBase);
                    System.out.println("Rendimiento");
                    System.out.println("Ventas realizadas " + ventasRealizadas);
                    System.out.println("Clientes atendidos " + clienteAtendidos);
                    System.out.println("Total vendido " + totalVendido);
                    System.out.println("Meta mensual " + metaMensual);

                    // calcular el porcentaje de meta
                    double porcentajeMeta = (totalVendido / metaMensual) * 100;
                    System.out.println("Cumplimiento " + porcentajeMeta + " %");
                    System.out.println("Comision");
                    System.out.println("Comisiones acumuladas " + comisionTotal);

                    // calcular el promedio de venta
                    double promedioVenta = (ventasRealizadas > 0) ? totalVendido / ventasRealizadas : 0;
                    System.out.println("Promedio de venta " + promedioVenta);
                    System.out.println("Descuento aplicado " + descuentosOtorgados);

                    System.out.println("Calificacion al vendedor ");
                    if (totalVendido >= metaMensual * 1.5) {
                        System.out.println("VENDEDOR ESTRELLA");
                    } else if (totalVendido >= metaMensual * 0.8) {
                        System.out.println("Cumpliste la meta");
                    } else if (totalVendido >= metaMensual * 0.2) {
                        System.out.println("Sigue mejorando");
                    } else {
                        System.out.println("Reunion proximamente");
                    }
                    break;

                case 3:
                    System.out.println("Calcular el salario");
                    System.out.println("Salario base "+salarioBase);
                    System.out.println("Comision "+comisionTotal);
                    double bonificacion = 0.0;

                    if (totalVendido >= metaMensual) {
                        if (totalVendido >= metaMensual *2) {
                            bonificacion = 200.000;
                            System.out.println("Bonificacion de excelencia");
                        }else if (totalVendido >= metaMensual *1.5) {
                            bonificacion = 120.000;
                            System.out.println("Bonificacion de destacado");    
                        }else{
                            System.out.println("Sin bonificacion no se alcanzo la meta");
                        }
                    }

                    double salarioTotal = salarioBase + comisionTotal + bonificacion;
                    double deducciones = salarioTotal = salarioTotal *0.12;
                    double salarioNeto = salarioTotal - deducciones;

                    System.out.println("Bonificacion "+bonificacion);
                    System.out.println("====================================");
                    System.out.println("Salario bruto "+salarioTotal);
                    System.out.println("Salario con deducciones "+deducciones);
                    System.out.println("====================================");
                    System.out.println("Salario neto "+salarioNeto);
                    break;

                default:
                    break;
            }
        } while (sistemaActivo);
    }
}
