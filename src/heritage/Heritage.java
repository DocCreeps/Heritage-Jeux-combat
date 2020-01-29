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
public class Heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mage m= new Mage("Deboar",75,10,40);
        Prêtre p = new Prêtre("Jean",120,5,50);
        Guerrier g= new Guerrier("Rambo",200,15,false);
           System.out.println(g);
        System.out.println(m);
        System.out.println(p);
        System.out.println(g +"est enragée");
        g.enrager();
         System.out.println(g);
        g.attaquer(m);
        Potion po= new Potion(50);
         p.addObject(po);
        p.boirePotion();
        System.out.println(m);
        System.out.println(p);
        g.attaquer(p);
        m.attaquer(p);
        p.Soigner(p);
        System.out.println(g);
        System.out.println(m);
        System.out.println(p);
        
               
                
               
               
              
    }
    
    
}
