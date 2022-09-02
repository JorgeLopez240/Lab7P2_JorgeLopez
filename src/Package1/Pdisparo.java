
package Package1;

public class Pdisparo extends Planta{
    
    private String nom_proyectil;
    private String color;

    public Pdisparo() {
        super();
    }

    public Pdisparo(String nom_proyectil, String color, String nombre, double ataque, double vida, String rango) {
        super(nombre, ataque, vida, rango);
        this.nom_proyectil = nom_proyectil;
        this.color = color;
    }

    public String getNom_proyectil() {
        return nom_proyectil;
    }

    public void setNom_proyectil(String nom_proyectil) {
        this.nom_proyectil = nom_proyectil;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pdisparo{" + "nom_proyectil=" + nom_proyectil + ", color=" + color + '}';
    }
    
    
    
}
