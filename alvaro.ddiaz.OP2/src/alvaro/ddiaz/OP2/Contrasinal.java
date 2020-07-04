/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvaro.ddiaz.OP2;

public class Contrasinal {
    protected String contrasinal;
    
    
    public void Contrasinal (String contrasinal){
        this.contrasinal = contrasinal;
    
    }

    public void setContrasinal(String contrasinal) {
        this.contrasinal = contrasinal;
    }

    public String getContrasinal(String contrasinal) {
        return contrasinal;
    }
    
   
    @Override
       public String toString() {
           return contrasinal;
       }
}
