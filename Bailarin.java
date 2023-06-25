import java.util.Random;

public class Bailarin {
    private String nombre;
    private int tiempo;

    public Bailarin(String nombre){
        this.nombre = nombre;
        this. tiempo = generarTiempo();
    }
    public String getNombre() {
        return nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    private int generarTiempo() {
        Random random = new Random();
        return random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10
    }
}
