/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvaro.ddiaz.OP2;

import java.util.List;

        
public class Codificar implements Eleccion {
    
@Override
   

    public String proceso(Contrasinal contraseña, List < String > operations ) {
    String pass = contraseña.toString();
        for (int i=0; i<operations.size();i++){
    String aux = operations.get(i);
        switch (aux.substring(0,3)) {
            case "SWP":
                int p = Integer.parseInt(aux.substring (4,5));
                int s = Integer.parseInt(aux.substring (6));
                pass=SWP(pass, p, s);
                break;
            case "SWL":
                char x =(aux.charAt(4));
                char y =(aux.charAt (6));
                pass=SWL(pass, x, y);
                break;
            case "ROR":
               int pp = Integer.parseInt(aux.substring (4,5)); 
               pass=ROR(pass, pp);
               break; 
            case "ROL":
               int ppp = Integer.parseInt(aux.substring (4,5)); 
               pass=ROL(pass, ppp);
               break; 
            case "REP":
                int xx = Integer.parseInt(aux.substring (4,5));
                int yy = Integer.parseInt(aux.substring (6));
                pass=REP(pass, xx, yy);
                break;
            case "MOP":
                int pppp = Integer.parseInt(aux.substring (4,5));
                int ssss = Integer.parseInt(aux.substring (6));
                pass=MOP(pass, pppp, ssss);
               break;  
        } 
    }  
    return pass;  
}
      
           
    public String SWP(String contrasinal, int p, int s) {
        StringBuilder sb = new StringBuilder ();
           sb.append(contrasinal);
           char temp = sb.charAt(p);
        
           sb.insert(p, sb.charAt(s)); 
           sb.insert(s, temp); 
           sb.deleteCharAt(s+1);
           sb.deleteCharAt(p+1);
           String nuevo = sb.toString();
           return nuevo;
       }
   
    public String SWL (String contrasinal, char p, char s) {
            StringBuilder sb = new StringBuilder ();
            sb.append(contrasinal);
            int i = 0;
                while (i<sb.length()){            
                    if (sb.charAt (i) == p){
                    sb.setCharAt(i,s);
                    } else{ 
                    if (sb.charAt (i) == s){
                        sb.setCharAt(i,p);
                    }
                    }i++;
            }
            String nuevo = sb.toString();
           return nuevo;
        }

   
    public String ROR(String contrasinal,int p) {
        StringBuilder sb = new StringBuilder ();
        sb.append(contrasinal);
        StringBuilder sb2 = new StringBuilder ();
        int aux=sb.length()-p;
        String aux2 = sb.substring(aux);
        sb2.append(aux2);
        sb2.append(contrasinal.substring(0,aux)); 
        
        String nuevo = sb2.toString();
        return nuevo;
         }   
    
    
    public String ROL(String contrasinal, int p) {
        StringBuilder sb = new StringBuilder ();
        sb.append(contrasinal);
        StringBuilder sb2 = new StringBuilder ();
        String aux = sb.substring(0,p);
        sb2.append(sb.substring(p)); 
        sb2.append(aux);
        
        String nuevo = sb2.toString();
        return nuevo;
        }  


    public String REP(String contrasinal,int p, int s) {
        StringBuilder sb = new StringBuilder ();
        sb.append(contrasinal);
        StringBuilder sb2 = new StringBuilder ();
        String aux = sb.substring(p,s);
        sb2= sb.reverse();
        String nuevo = sb2.toString();
        return nuevo;
   } 
       
    
    public String MOP(String contrasinal, int p, int s) {
    StringBuilder sb = new StringBuilder ();
    sb.append(contrasinal);
    char aux= sb.charAt(p);
        sb.deleteCharAt(p);
        sb.insert(s, aux);
        String nuevo = sb.toString();
            return nuevo;
    }

    
}
    
   

        
        
   