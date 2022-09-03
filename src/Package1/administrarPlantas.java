
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
            bw.write("/");
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
                    String nombre="",rango="";
                    double ataque=0,vida=0;
                    Planta planta=new Planta();
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
                            p = acortador(s, 6, s.length()-1);
                            vida = Double.parseDouble(p);
                        } else if(f=='R'){
                            p=acortador(s, 7, 10);
                            rango=p;
                        } else if(f=='N'){
                            p=acortador(s, 8, s.length()-1);
                            nombre =p;
                        } else if(f=='A'){
                            p=acortador(s, 9, s.length()-1);
                            ataque = Double.parseDouble(p);
                        }
                    }
                    char f2=corto.charAt(0);
                    char f3=corto.charAt(1);
                    String p2;
                    if(f2=='E'){
                        p2=acortador(corto, 21, corto.length()-2);
                        double magnitud= Double.parseDouble(p2);
                        planta = new Pexplosiva(magnitud, nombre, ataque, vida, rango);
                    } else if(f3=='i'){
                        String arr4[]=corto.split(":");
                        String cad4=arr4[1];
                        String [] arr5=cad4.split(";");
                        String n=arr5[0];
                        String c=arr5[1];
                        String nombreProyectil=acortador(n, 12, n.length()-1);
                        String color=acortador(c, 7, c.length()-1);
                        planta = new Pdisparo(nombreProyectil, color, nombre, ataque, vida, rango);
                    } else if(f3=='e'){
                        String []arr4=corto.split(":");
                        String cad4=arr4[1];
                        String []arr5=cad4.split(";");
                        String pe=arr5[0];
                        String a=arr5[1];
                        String d=arr5[2];
                        double peso=Double.parseDouble(acortador(pe, 6, pe.length()-1));
                        double altura = Double.parseDouble(acortador(a, 7, a.length()-1));
                        double dureza = Double.parseDouble(acortador(d, 7, d.length()));
                        planta = new Pdefensa(altura, dureza, peso, nombre, ataque, vida, rango);
                    }
                    listaPlantas.add(planta);
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
