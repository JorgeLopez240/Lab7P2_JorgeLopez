
package Package1;

public class Pexplosiva extends Planta{
    
    private double magnitud;

    public Pexplosiva() {
        super();
    }

    public Pexplosiva(double magnitud, String nombre, double ataque, double vida, String rango) {
        super(nombre, ataque, vida, rango);
        this.magnitud = magnitud;
    }

    public double getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(double magnitud) {
        this.magnitud = magnitud;
    }

    @Override
    public String toString() {
        return "Pexplosiva{" + "magnitud=" + magnitud + '}';
    }
    
    
    
}
