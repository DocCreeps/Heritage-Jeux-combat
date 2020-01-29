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
public class Mage extends Personnage {

    protected int degatSort;

      public Mage() {
        super();
        this.degatSort = 60;

    }

  
    public Mage(String n, int pdv, int ff, int ds) {
        super(n, pdv, ff);
        this.degatSort = ds;

    }

    public int getDegatSort() {
        return degatSort;
    }

    public void setDegatSort(int degatSort) {
        this.degatSort = degatSort;
    }

  

    public void lancerSort(Personnage p2) {
        p2.setPointDeVie(p2.getPointDeVie() - this.degatSort);
    }

}
