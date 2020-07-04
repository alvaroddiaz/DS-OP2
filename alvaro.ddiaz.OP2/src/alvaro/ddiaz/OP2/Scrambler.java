/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvaro.ddiaz.OP2;

import java.util.List;


public class Scrambler {
    
    public String encodePassword (String contraseña,List < String > operations){
    Codificar cd = new Codificar();
    Contrasinal contra = new Contrasinal ();
    String temp;
    contra.Contrasinal(contraseña);
    temp=cd.proceso(contra, operations);
    
    return temp;
    }
           
   
    public String decodePassword(String contraseña,List < String > operations) {
    Descodificar dc = new Descodificar();
    Contrasinal contra = new Contrasinal ();
    String temp;
     
    contra.Contrasinal(contraseña);
    temp=dc.proceso(contra, operations);
    
    return temp;
    }
} 