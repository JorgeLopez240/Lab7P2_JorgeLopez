
package Package1;

public class Zclasico extends Zombie{
    
    private int experiencia;
    private Bandera bandera;

    public Zclasico() {
        super();
    }

    public Zclasico(int experiencia, Bandera bandera, String nombre, double ataque, double vida) {
        super(nombre, ataque, vida);
        this.experiencia = experiencia;
        this.bandera = bandera;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Bandera getBandera() {
        return bandera;
    }

    public void setBandera(Bandera bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return "Zclasico{" + "experiencia=" + experiencia + ", bandera=" + bandera + '}';
    }
    
    
    
}
