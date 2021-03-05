import com.toedter.calendar.JCalendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static java.awt.Font.BOLD;

public class Interfaz extends JFrame {
    private JComboBox aviones;
    private JComboBox asientos;
    private JComboBox destino;
    private JCalendar calendar;
    private JButton cancelar;
    private JButton reiniciar;
    private JButton aceptar;

    Font h = new Font("Times New Roman", BOLD, 14);

    public Interfaz (){
        super("Reserva Plazas de Avion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel general = new JPanel();
        JPanel Primer = new JPanel();
        Primer.setLayout(new GridLayout(2,2));

        aviones = new JComboBox();
        aviones.addItem("Avión 1");
        aviones.addItem("Avión 2");
        aviones.addItem("Avión 3");
        aviones.addActionListener(new ListenerAviones());

        asientos = new JComboBox();
        asientos.addItem("Primera Clase");
        asientos.addItem("Turista");


        destino= new JComboBox();
        destino.addItem("America");
        destino.addItem("Africa");
        destino.addItem("Europa");
        destino.addItem("Oceania");
        destino.addItem("Asia");


        calendar = new JCalendar();

        add(general);
        Primer.add(aviones);
        Primer.add(asientos);
        Primer.add(destino);
        Primer.add(calendar);

        general.add(Primer);
        Primer.add(calendar);
        setSize(600, 600);
        setVisible(true);
    }


    public static void main() {
        Interfaz in = new Interfaz();
    }


    private class ListenerAviones implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
