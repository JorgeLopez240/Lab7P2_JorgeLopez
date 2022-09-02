
package Package1;

public class Bandera {
   
    private String color;
    private String direccion_imagen;

    public Bandera() {
    }

    public Bandera(String color, String direccion_imagen) {
        this.color = color;
        this.direccion_imagen = direccion_imagen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDireccion_imagen() {
        return direccion_imagen;
    }

    public void setDireccion_imagen(String direccion_imagen) {
        this.direccion_imagen = direccion_imagen;
    }

    @Override
    public String toString() {
        return "Bandera{" + "color=" + color + ", direccion_imagen=" + direccion_imagen + '}';
    }
    
}
