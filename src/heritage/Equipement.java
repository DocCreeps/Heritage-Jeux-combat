/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

/**
 *
 * @author csnd2320
 */
public class Equipement extends Object{
    private String emplacement;

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getEmplacement() {
        return emplacement;
    }

   public Equipement(){
    super();
    this.emplacement="1";
}
   public Equipement(String n, int id, String em){
   super(n, id);
   this.emplacement=em;
   
   
   
   
   
   }
    
    
    
}
