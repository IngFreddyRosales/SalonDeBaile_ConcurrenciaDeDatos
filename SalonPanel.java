import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SalonPanel extends JPanel implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        repaint();
    }


    /*private synchronized void dibujarPista() {
        Graphics gPista = pistaPanel.getGraphics();
        gPista.clearRect(0, 0, pistaPanel.getWidth(), pistaPanel.getHeight());

        int x = 10;
        int y = 10;

        for (Bailarin hombre : hombres) {
            gPista.setColor(Color.BLUE);
            gPista.fillOval(x, y, 10, 10);
            x += 20;
        }

        x = 10;
        y += 30;

        for (Bailarin mujer : mujeres) {
            gPista.setColor(Color.PINK);
            gPista.fillOval(x, y, 10, 10);
            x += 20;
        }
    }*/
}
