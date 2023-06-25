import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeSupport;

public class SalonFrame extends JFrame {

    private PropertyChangeSupport observed;
    SalonPanel panel;

    public SalonFrame(String salon_de_baile){
        observed = new PropertyChangeSupport(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(panel,BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);



    }

    public void ConsultaDatos(){
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
    }


    public static void main(String[] args) {
        new SalonFrame("Salon de Baile");

        SalonPanel pistaPanel = new SalonPanel();

    }



}
