import javax.swing.*;

public class Combo {
    private JComboBox aviones;
    private JComboBox asientos;
    private JComboBox destino;

    public void Aviones(){
        aviones = new JComboBox();
        aviones.addItem("Avión 1");
        aviones.addItem("Avión 2");
        aviones.addItem("Avión 3");

    }
    public  void Asientos(){
        asientos = new JComboBox();
        asientos.addItem("Primera Clase");
        asientos.addItem("Turista");
    }
    public void Destino(){
        destino= new JComboBox();
        destino.addItem("America");
        destino.addItem("Africa");
        destino.addItem("Europa");
        destino.addItem("Oceania");
        destino.addItem("Asia");


    }






    public static void main() {

    }
}

