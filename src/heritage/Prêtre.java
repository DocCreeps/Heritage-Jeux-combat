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
public class Prêtre extends Personnage {
  
    private int puissancesoin;
    
    public Prêtre()
            {
                super();
                this.puissancesoin=30;
                
            }
    
    public Prêtre(String n, int pdv, int ff, int ps){
        super(n, pdv, ff);
        this.puissancesoin=ps;
    }

    public void setPuissancesoin(int puissancesoin) {
        this.puissancesoin = puissancesoin;
    }

    public int getPuissancesoin() {
        return puissancesoin;
    }
    
public void Soigner(Personnage p2)
{
     p2.setPointDeVie(p2.getPointDeVie()+puissancesoin);
}
}
        
    

