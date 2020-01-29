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
public class Object {
    protected int ID;
    protected String nom;

    
    
     public Object()
    // constructeur par defaut
    {
        this.ID=1;
        this.nom="Object";
        
      
    }    
        
    public Object(String n,int id)
    {
      this.nom=n;
      this.ID=id;
     
    }
    public int getID() {
        return ID;
    }

    public String getNom() {
        return nom;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
   
    @Override
    public String toString() {
        return "Object{" + "nom=" + nom + ", ID=" + ID ;
    }
}
