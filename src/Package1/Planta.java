
package Package1;

public class Planta {
    
    private String nombre;
    private double ataque;
    private double vida;
    private String rango;

    public Planta() {
    }

    public Planta(String nombre, double ataque, double vida, String rango) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
