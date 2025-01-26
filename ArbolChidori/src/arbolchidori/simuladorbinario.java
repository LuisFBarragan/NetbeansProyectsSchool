/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolchidori;

import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class simuladorbinario {
  Arbol objJp=new Arbol();  
  public simuladorbinario(){
  }
  
  public boolean insertarD(Integer dato){
      return(objJp.agregar(dato));
  }
  
  
    
     //public JPanel getDibujo() {
       // return this.objJp
    //}
}
