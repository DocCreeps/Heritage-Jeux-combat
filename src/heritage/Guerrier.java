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
public class Guerrier extends Personnage {
    
    protected boolean enrager;
   
    
    public Guerrier()
            {
                super();
                this.enrager=false;
                this.pointDeVie=150;
            }
    
    public Guerrier(String n, int pdv, int ff, boolean e)   
    {
        super(n, pdv, ff);
        this.enrager=e;
    }
       public void enrager()
    {
        this.enrager=true;
    }
       
     public void setEnrager(boolean enrager) {
        this.enrager = enrager;
    }

    public boolean isEnrager() {
        return enrager;
    }
       
    @Override
    public void attaquer(Personnage p2)
    {
        if(this.enrager)
        {
        p2.setPointDeVie(p2.getPointDeVie()-(2*this.getForcefrappe()));
        }
        else
        {
            super.attaquer(p2);
        }
    }

   
        
 
}
