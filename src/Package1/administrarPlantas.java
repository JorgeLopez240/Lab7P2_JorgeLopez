
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
 
    public ArrayList random(){
        ArrayList<Integer> ret = new ArrayList();
        while(ret.size()<5){
            int ran = r.nextInt(4);
            if(!(ret.contains(ran))){
                ret.add(ran);
            }
        }
        return ret;
    }
    
}
