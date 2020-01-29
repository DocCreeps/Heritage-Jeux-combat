/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import java.util.ArrayList;

/**
 *
 * @author csnd2320
 */
public class Personnage {
    private String nom;
    protected int pointDeVie;
    protected int forcefrappe;
    protected ArrayList<Object> sac;
    protected ArrayList<Equipement> armure;

    public ArrayList<Equipement> getArmure() {
        return armure;
    }

    public void setArmure(ArrayList<Equipement> armure) {
        this.armure = armure;
    }
    
    
    
    public ArrayList<Object> getSac() {
        return sac;
    }

    public void setSac(ArrayList sac) {
        this.sac = sac;
    }
    
    public int getPointDeVie()
    {
        return this.pointDeVie;
    }

    public String getNom() {
        return nom;
    }

    public int getForcefrappe() {
        return forcefrappe;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public void setPointDeVie(int pdv) {
        this.pointDeVie = pdv;
    }

    public void setForcefrappe(int ff) {
        this.forcefrappe = ff;
    }
    
   
    
    public Personnage()
    // constructeur par defaut
    {
        this.nom="Pierre";
        this.pointDeVie=100;
        this.forcefrappe=5;
        this.sac= new ArrayList<>();
    }    
    
    
    public Personnage(String n,int pdv,int ff)
    {
      this.nom=n;
      this.pointDeVie=pdv;
      this.forcefrappe=ff;
      this.sac= new ArrayList<>();
    }    
    
    public void boirePotion()
    {
       for(Object b : this.sac )
       {
           if(b instanceof Potion)
           {
               int so= ((Potion)b).getSoin();
               int vieRestante = so +getPointDeVie();
               setPointDeVie(vieRestante);
           }
       }
    }
    public void addObject(Potion po){
    this.sac.add(po);
    }
    
    public void attaquer(Personnage p2)
    {
        int forcemonperso = this.forcefrappe;
        int pdvp2 = p2.getPointDeVie();// on utilise get car dans la class personnage les attributs sont privés
        int vieRestante = pdvp2 - forcemonperso;
        p2.setPointDeVie(vieRestante);
    }
    public void equiper(Equipement equi){
    this.armure.add(equi);
    
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", pointDeVie=" + pointDeVie + ", forcefrappe=" + forcefrappe + '}';
    }
    
    
    
    
}
