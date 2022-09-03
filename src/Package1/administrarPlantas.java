
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
                       bw.write("Nombre="+p.getNombre());
                       int num2=lista.indexOf(num);
                       if(cont<lista.size()-1 && lista.get(num2+1) !=4 ){
                           bw.write(",");
                       }
                   } else if(num==1){
                       bw.write("Ataque="+p.getAtaque());
                       int num2=lista.indexOf(num);
                       if(cont<lista.size()-1 && lista.get(num2+1) !=4){
                           bw.write(",");
                       }
                   } else if(num==2){
                       bw.write("Rango="+p.getRango());
                       int num2=lista.indexOf(num);
                       if(cont<lista.size()-1 && lista.get(num2+1) !=4){
                           bw.write(",");
                       }
                   } else if(num==3){
                       bw.write("Vida="+p.getVida());
                       int num2=lista.indexOf(num);
                       if(cont<lista.size()-1 && lista.get(num2+1) !=4){
                           bw.write(",");
                       }
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
                       bw.write("/");
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
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    String cad = sc.next();
                    String [] arr = cad.split("_");
                    String largo;
                    String corto;
                    if(arr[0].length()<arr[1].length()){
                        largo=arr[1];
                        corto=arr[0];
                    } else{
                        largo=arr[0];
                        corto=arr[1];
                    }
                    String [] arr2=largo.split(",");
                    String p;
                    for (String s : arr2) {
                        char f = s.charAt(0);
                        if(f=='V'){
                            p = acortador(s, 5, s.length()-1);
                            double vida = Double.parseDouble(p);
                        } else if(f=='R'){
                            p=acortador(s, 6, 10);
                            String rango=p;
                        } else if(f=='N'){
                            p=acortador(s, 7, s.length()-1);
                            String nombre =p;
                        } else if(f=='A'){
                            p=acortador(s, 7, s.length()-1);
                            double ataque = Double.parseDouble(p);
                        }
                    }
                    char f2=corto.charAt(0);
                    char f3=corto.charAt(1);
                    String p2;
                    if(f2=='E'){
                        p2=acortador(corto, 20, corto.length()-2);
                    } else if(f3=='i'){
                        String arr4[]=corto.split(":");
                        String cad4=arr4[1];
                        String [] arr5=cad4.split(";");
                        String n=arr5[0];
                        String c=arr5[1];
                        String nombreProyectil=acortador(n, 11, n.length()-1);
                        String color=acortador(c, 6, c.length()-1);
                    } else if(f3=='e'){
                        
                    }
                }
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
    
    public static String acortador(String phrase, int in, int fn){
     String cad = phrase.substring(in,fn);
     return cad;
     }
    
}
