
package Package1;

import java.util.ArrayList;

public class Zcargado extends Zombie{
    
    private double tamano;
    private double edad;
    private int enojo;
    ArrayList<String> pComidas= new ArrayList();

    public Zcargado() {
        super();
    }

    public Zcargado(double tamano, double edad, int enojo, String nombre, double ataque, double vida) {
        super(nombre, ataque, vida);
        this.tamano = tamano;
        this.edad = edad;
        this.enojo = enojo;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public int getEnojo() {
        return enojo;
    }

    public void setEnojo(int enojo) {
        this.enojo = enojo;
    }

    public ArrayList<String> getpComidas() {
        return pComidas;
    }

    public void setpComidas(ArrayList<String> pComidas) {
        this.pComidas = pComidas;
    }

    @Override
    public String toString() {
        return "Zcargado{" + "enojo=" + enojo + '}';
    }
    
    
    
}
