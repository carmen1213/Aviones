import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Aviones {


    public static void main(String[] args) {
        boolean salir = true;


        Scanner sc = new Scanner(System.in);

        while (salir == true) {

            System.out.println("\n DATOS DE LOS VUELOS");
            System.out.println("1-Crear Reserva");
            System.out.println("2-Cancelar Reserva ");
            System.out.println("3-Ver reservas");
            System.out.println("4-Salir");
            System.out.println("\n Introduce el numero que desee:");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    sc.nextLine();
                    System.out.println("Dame el nombre del cliente");
                    String usuario = sc.nextLine();
                    System.out.println("Indica el destino al que quiere viajar");
                    String destino = sc.nextLine();
                    System.out.println("Indica la fecha de salida");
                    String fechasalida = sc.nextLine();
                    System.out.println("Indica el tipo de asientos con el que quiere viajar (Turista / Primera Clase)");
                    String asientos = sc.nextLine();

                    int precio = 0;

                    if (asientos.equalsIgnoreCase("Turista")) {
                        precio = 45;
                    } else {
                        precio = 80;
                    }


                    String[] horas = new String[]{"1:00", "1:30", "2:00", "2:30", "3:00", "3:30", "4:00"};
                    Random aleatorio = new Random();
                    String t_vuelo = horas[aleatorio.nextInt(horas.length)];


                    reservas.reserva.add(new reservas(usuario, asientos, destino, precio, ParseFecha(fechasalida), t_vuelo));



                    System.out.println(asientos +" : "+ precio +"€");
                    System.out.println("La reserva se ha realizado correctamente");

                    reservas.cargar_datos();

                    break;


                case 2:
                    sc.nextLine();
                    System.out.println("Dime tu nombre de usuario");
                    String nombre = sc.nextLine();
                    for (int i = 0; i <reservas.reserva.size() ; i++) {
                        if (nombre.equalsIgnoreCase(reservas.reserva.get(i).getusuario())){
                            reservas.reserva.remove(i);



                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < reservas.reserva.size() ; i++) {
                        System.out.println(reservas.reserva.get(i)+"\t");

                    }
                    break;


                case 4:
                    sc.nextLine();
                    System.out.println("Finalizando la pagina");
                    salir = false;
                    break;
                default:
                    System.out.println("El numero introducido no corresponde a ningun valor correcto");
            }

        }
        sc.close();
    }


    public static Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }
}









