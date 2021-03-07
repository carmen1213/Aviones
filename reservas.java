import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class reservas {



    SimpleDateFormat fecha=new SimpleDateFormat("dd/mm/yyyy");
    private String usuario;
    private String asientos;//esto es el tipo de asiento
    private String destino;
    private int precio;
    Date fecha_salida;
    private String duracion;
public static ArrayList<reservas>reserva= new ArrayList<>();

    public reservas(String usuario, String asientos,String destino, int precio, Date fecha_salida,String duracion) {

        this.usuario=usuario;
        this.asientos=asientos;
        this.destino=destino;
        this.precio=precio;
        this.fecha_salida=fecha_salida;
        this.duracion=duracion;

    }

    public String getusuario() {
        return usuario;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }


    public String getAsiento() {
        return asientos;
    }

    public void setAsiento(String asiento) {
        this.asientos = asiento;
    }


    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino =destino;
    }


    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion =duracion;
    }

    public String toString() {
        return usuario + " " + asientos + " " + precio + " € " + destino + " " + fecha_salida + " " + duracion;
    }


    public static void cargar_datos(){
        try {
            FileWriter fichero = new FileWriter("C:\\Users\\carma\\IdeaProjects\\Avionessininterfaz\\src\\billetes.txt");

            PrintWriter pw = new PrintWriter(fichero);
            for (int i = 1; i < reserva.size(); i++) {
                pw.println(reserva.get(i));

            }

            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leer_txt(){
        try {

            SimpleDateFormat estructura= new SimpleDateFormat("dd/mm/yyyy");
            File myObj = new File(  "C:\\Users\\carma\\IdeaProjects\\Avionessininterfaz\\src\\billetes.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                Date fecha_salida=new Date();
                String data = myReader.nextLine();
                String parte[] = data.split(" ");
                String usuario=parte[0];
                String asiento=parte[1];
                int precio=Integer.parseInt(parte[2]);
                String destino= parte[3];
                String fecha=parte[4];
                try {
                    fecha_salida=estructura.parse(fecha);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                String duracion=parte[5];
                reserva.add(new reservas(usuario,asiento,destino,precio,fecha_salida,duracion));


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
