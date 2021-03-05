import com.toedter.calendar.JCalendar;

import javax.swing.*;
import java.awt.*;

public class Calendario extends JFrame {
        JCalendar calendar;

    public Calendario(){
            super("Reserva Hoteles");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            JPanel general = new JPanel();
            general.setLayout(new GridLayout(3, 1, 20, 1));

            calendar = new JCalendar();

            add(general);
            general.add(calendar);
            setSize(300, 200);
            setVisible(true);
        }
        public static void main() {
            new Calendario();

        }}


