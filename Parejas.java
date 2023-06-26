import java.util.ArrayList;

public class Parejas {

    private ArrayList<Bailarin> hombres;
    private ArrayList<Bailarin> mujeres;


    public Parejas() {
        this.hombres = new ArrayList<>();
        this.mujeres = new ArrayList<>();
    }

    public synchronized void agregarHombres(String nombre){
     hombres.add(new Bailarin(nombre));
        System.out.println(hombres);

    }

    public synchronized void agregarMujeres(String nombre){
        mujeres.add(new Bailarin(nombre));
        System.out.println(mujeres);


    }
}
