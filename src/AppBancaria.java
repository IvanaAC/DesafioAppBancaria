import java.util.Scanner;

public class AppBancaria {

    public static void main(String[] args) {
        //declaración de variables
        String nombre = "Bruce Wayne";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        //adicionar datos del cliente
        System.out.println("*****************************");
        System.out.println("\nNombre del cliente: " + nombre); //Alt+92 es \
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + saldo + "$");
        System.out.println("\n*****************************");

        //menú de opciones
        String menu = """
                *** Ingrese el número de la opción deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch(opcion) {
                case 1: //visualizar saldo
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2: //hacer un retiro
                    System.out.println("¿Cúal es la cantidad que desea retirar?");
                    double cantidadARetirar = teclado.nextDouble();
                    if (cantidadARetirar> saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - cantidadARetirar;
                        System.out.println("El saldo actualizado es: " + saldo + "$");
                    }
                    break;
                case 3: //hacer un depósito
                    System.out.println("¿Cúal es la cantidad a depositar?");
                    double cantidadADepositar = teclado.nextDouble();
                    saldo += cantidadADepositar;
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 9: //salir
                    System.out.println("""
                            Saliendo del programa.
                            Gracias por utilizar nuestros servicios.
                            """);
                    break;
                default: //cuando no se cumplen las condiciones
                    System.out.println("La opción no es válida. Intente nuevamente.");

            }

        }

    }
}
