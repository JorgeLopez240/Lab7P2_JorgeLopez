
package Package1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class administrarPlantas {
    
    Random r = new Random();
    
    private ArrayList<Planta> listaPlantas = new ArrayList();
    private File archivo = null;

    public administrarPlantas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Planta> getListaPlantas() {
        return listaPlantas;
    }

    public void setListaPlantas(ArrayList<Planta> listaPlantas) {
        this.listaPlantas = listaPlantas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista Plantas="+listaPlantas;
    }
    
    
    //Metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Planta p: listaPlantas) {
               ArrayList<Integer> lista = random();
               int cont =0;
               while(cont<lista.size()){
                   int num=lista.get(cont);
                   if(num==0){
                       bw.write("Nombre="+p.getNombre()+",");
                   } else if(num==1){
                       bw.write("Ataque="+p.getAtaque()+",");
                   } else if(num==2){
                       bw.write("Rango="+p.getRango()+",");
                   } else if(num==3){
                       bw.write("Vida="+p.getVida()+",");
                   } else {
                       if(cont==lista.size()-1){
                           if(p instanceof Pexplosiva){
                               bw.write("_Explosiva:(Magnitud="+((Pexplosiva)p).getMagnitud()+")");
                           }
                           else if(p instanceof Pdefensa){
                               bw.write("_Defensa:(Peso="+((Pdefensa) p).getPeso()+";Altura="+((Pdefensa) p).getAltura()+";Dureza="+((Pdefensa) p).getDureza()+")");
                           } else if(p instanceof Pdisparo){
                               bw.write("_Disparo:(Color="+((Pdisparo) p).getColor()+";Proyectil="+((Pdisparo) p).getNom_proyectil()+")");
                           }
                       } else if(cont==0){
                           if(p instanceof Pexplosiva){
                               bw.write("Explosiva:(Magnitud="+((Pexplosiva)p).getMagnitud()+")_");
                           }
                           else if(p instanceof Pdefensa){
                               bw.write("Defensa:(Peso="+((Pdefensa) p).getPeso()+";Altura="+((Pdefensa) p).getAltura()+";Dureza="+((Pdefensa) p).getDureza()+")_");
                           } else if(p instanceof Pdisparo){
                               bw.write("Disparo:(Color="+((Pdisparo) p).getColor()+";Proyectil="+((Pdisparo) p).getNom_proyectil()+")_");
                           }
                       } else{
                           if(p instanceof Pexplosiva){
                               bw.write("_Explosiva:(Magnitud="+((Pexplosiva)p).getMagnitud()+")_");
                           }
                           else if(p instanceof Pdefensa){
                               bw.write("_Defensa:(Peso="+((Pdefensa) p).getPeso()+";Altura="+((Pdefensa) p).getAltura()+";Dureza="+((Pdefensa) p).getDureza()+")_");
                           } else if(p instanceof Pdisparo){
                               bw.write("_Disparo:(Color="+((Pdisparo) p).getColor()+";Proyectil="+((Pdisparo) p).getNom_proyectil()+")_");
                           }
                       }
                   }
                   if(cont==lista.size()-1){
                       bw.write("|");
                   }
                   cont++;
               }
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        listaPlantas = new ArrayList();
        if (archivo.exists()) {
            try {
                
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
 
    public ArrayList<Integer> random(){
        ArrayList<Integer> ret = new ArrayList();
        while(ret.size()<5){
            int ran = r.nextInt(5);
            if(!(ret.contains(ran))){
                ret.add(ran);
            }
        }
        return ret;
    }
    
}
