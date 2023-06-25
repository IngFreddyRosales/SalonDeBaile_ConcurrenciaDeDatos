import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeSupport;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeSupport;

public class SalonFrame extends JFrame {

    private PropertyChangeSupport observed;
    private SalonPanel panel;

    public SalonFrame(String salon_de_baile) {
        observed = new PropertyChangeSupport(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(700, 500));

        panel = new SalonPanel();
        this.getContentPane().add(panel, BorderLayout.CENTER);

        consultaDatos(); // metodo para mostrar los espacios para rellenar con los datos hombres/mujeres
        this.pack();
        this.setVisible(true);
    }

    public void consultaDatos() {
        JLabel hombreLabel = new JLabel("Hombre:");
        JTextField hombreTextField = new JTextField(10);
        JButton hombreButton = new JButton("Agregar Hombre");

        hombreButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String hombre = hombreTextField.getText();
                Parejas parejas = new Parejas();
                parejas.agregarHombres(hombre);
                hombreTextField.setText("");
            }
        });

        JLabel mujerLabel = new JLabel("Mujer :");
        JTextField mujerTextField = new JTextField(10);
        JButton mujerButton = new JButton("Agregar Mujer");

        mujerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mujer = mujerTextField.getText();
                Parejas parejas = new Parejas();
                parejas.agregarMujeres(mujer);
                mujerTextField.setText("");
            }
        });


        JPanel consultasPanel = new JPanel();
        consultasPanel.add(hombreLabel);
        consultasPanel.add(hombreTextField);
        consultasPanel.add(hombreButton);
        consultasPanel.add(mujerLabel);
        consultasPanel.add(mujerTextField);
        consultasPanel.add(mujerButton);

        this.getContentPane().add(consultasPanel, BorderLayout.NORTH);// Agrega los Jtextfields para ingresar datos




    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SalonFrame salonFrame = new SalonFrame("Salon de Baile");
                salonFrame.addListenener(salonFrame.panel);
                salonFrame.notificar(); // realiza los cambios en el observer (SalonPanel)

                SalonPanel salonPanel = new SalonPanel();


            }
        });
    }

    private void addListenener(SalonPanel panel) {
        observed.addPropertyChangeListener(panel);
    }

    public void notificar() {
        observed.firePropertyChange("CAMBIO HOMBRE", true, false);
        observed.firePropertyChange("CAMBIO MUJER", true, false);
    }





}

