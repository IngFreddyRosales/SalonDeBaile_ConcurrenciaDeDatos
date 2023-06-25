import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import java.util.ArrayList;

public class SalonPanel extends JPanel implements PropertyChangeListener {
    private ArrayList<Bailarin> hombres;
    private ArrayList<Bailarin> mujeres;

    public SalonPanel() {
        hombres = new ArrayList<>();
        mujeres = new ArrayList<>();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("CAMBIO_HOMBRES") || evt.getPropertyName().equals("CAMBIO_MUJERES")) {
            repaint();
        }
    }

    public synchronized void dibujarPista(Graphics gPista) {
        gPista.clearRect(0, 0, getWidth(), getHeight());

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
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujarPista(g);
    }

}

