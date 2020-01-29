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
public class Consommable extends Object{
    protected int soin;
    
    public Consommable(){
    super();
    this.soin=5;
    
    }
     public Consommable(String n, int id,int s){
    super(n, id);
    this.soin=s;
    
    }

    public int getSoin() {
        return soin;
    }

    public void setSoin(int soin) {
        this.soin = soin;
    }
     
     
    
    
    
}
