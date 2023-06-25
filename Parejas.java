import java.util.ArrayList;

public class Parejas {

    private ArrayList<Bailarin> hombres;
    private ArrayList<Bailarin> mujeres;


    public Parejas() {
        this.hombres = hombres;
        this.mujeres = mujeres;
    }

    public synchronized void agregarHombres(String nombre){
     hombres.add(new Bailarin(nombre));


    }
}
