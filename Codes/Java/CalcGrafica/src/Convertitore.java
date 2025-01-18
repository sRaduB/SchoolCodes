import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convertitore {
    private JFrame f;
    private JLabel l;
    private JTextField esa;
    private JTextField dec;
    private JButton e2d;
    private JButton d2e;

    public Convertitore(){
        f = new JFrame("Convertitore esadecimale decimale");
        f.setSize(400, 300);
        f.setLocation(600, 260);
        f.addWindowListener(new GestoreFinestra());
        f.setBackground(Color.WHITE);
        f.setVisible(true);

        esa = new JTextField();
        f.add(esa, "North");
        dec = new JTextField();
        f.add(dec, "South");
        e2d = new JButton("Esadecimale a Decimale");
        f.add(e2d, "West");
        d2e = new JButton("Decimale a Esadecimale");
        f.add(d2e, "East");
        l = new JLabel("<html>Esadecimale su<br>Decimale Giù</html>");
        f.add(l, "Center");
        l.setHorizontalAlignment(SwingConstants.CENTER);
        f.setVisible(true);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == e2d) {
                    // Conversione da esadecimale a decimale
                    String hex = esa.getText();
                    try {
                        int decimale = Integer.parseInt(hex, 16);
                        dec.setText(String.valueOf(decimale));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(f,
                                "Input non valido! Inserisci un numero esadecimale valido.",
                                "Errore", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (e.getSource() == d2e) {
                    // Conversione da decimale a esadecimale
                    String deci = dec.getText();
                    try {
                        int decimale = Integer.parseInt(deci);
                        String hex = Integer.toHexString(decimale).toUpperCase();
                        esa.setText(hex);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(f,
                                "Input non valido! Inserisci un numero decimale valido.",
                                "Errore", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };

        e2d.addActionListener(listener);
        d2e.addActionListener(listener);
    }
}

// per fare un'ascoltatore si può fare dentro alla classe, fuori,