
package Package1;

public class Pdefensa extends Planta{
    
    private double altura;
    private double dureza;
    private double peso;

    public Pdefensa() {
        super();
    }

    public Pdefensa(double altura, double dureza, double peso, String nombre, double ataque, double vida, String rango) {
        super(nombre, ataque, vida, rango);
        this.altura = altura;
        this.dureza = dureza;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getDureza() {
        return dureza;
    }

    public void setDureza(double dureza) {
        this.dureza = dureza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pdefensa{" + "altura=" + altura + ", dureza=" + dureza + ", peso=" + peso + '}';
    }
    
    
    
}
