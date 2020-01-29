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
public class Protecteur extends Guerrier{
    private int Leverbouclier;
   
    public Protecteur()
            {
                super();
                this.Leverbouclier=30;
                this.pointDeVie=170;
            }
    
    public Protecteur(int Lb)   
    {
       
        this.Leverbouclier=Lb;
    }
   

    public int getLeverbouclier() {
        return Leverbouclier;
    }

    public void setLeverbouclier(int Leverbouclier) {
        this.Leverbouclier = Leverbouclier;
    }
    
   
public void Bouclier()
{
     setPointDeVie(getPointDeVie()- (getForcefrappe()-this.Leverbouclier));
}
}
    
    
    
    

