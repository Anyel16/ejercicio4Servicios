import modelo.RevisionAlarma;
import modelo.TrabajoPintura;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        int opcion2 = 0;
        Scanner sc = new Scanner(System.in);

        try {

            TrabajoPintura trabajo1=new TrabajoPintura("Juan", LocalDate.now(),"Ana", 100,10);

            do {

                //Try catch para evitar que el programa termine si hay un error

                System.out.println("ELIGE EL TIPO DE OBRA:" +
                        "\n1.- Pintura" +
                        "\n2.- Alarma" +
                        "\n0.- Salir");

                System.out.println("Enter la opcion elegida: ");

                opcion = sc.nextInt();
                //Este problema pasa cuando queremos leer un tipo de dato numético,
                // sea del tipo que sea y seguidamente queremos leer un String.
                //SOLUCION
                sc.nextLine();

                //Ejemplo de switch case en Java
                switch (opcion) {

                    case 1:
                        System.out.println("Quiere que su obra sea:" +
                                "\n1.- Coste Total" +
                                "\n2.- Detalle de la Obra");

                        System.out.println("Enter la opcion elegida: ");
                        opcion2 = sc.nextInt();

                        if (opcion2 == 1){
                            System.out.println("El precio de la obra es de" +trabajo1.costeTotal() +"€");
                        } else if (opcion2 == 2) {
                            System.out.println(trabajo1.detalleServicio());
                        } else {
                            System.out.println("Esa opción no entraba dentro de las opciones, FIN DEL PROGRAMA");
                        }
                        break;
                    case 2:
                        RevisionAlarma revision1=new RevisionAlarma("Juan",10);

                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }//switch

                System.out.println("\n"); //Mostrar un salto de línea en Java


            } while (opcion != 0);//while
            System.out.println("Hasta pronto");
        } //try
        catch (Exception e) {
            System.out.println("Uoop! Error!");
        }//catch
    }
}