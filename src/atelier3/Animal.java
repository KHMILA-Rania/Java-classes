/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelier3;
import java.util.*;

/**
 *
 * @author rania
 */
public abstract class Animal {
    int nb_pattes;
    String couleur;
    float poids;
    
    public Animal(){
        
    };
    public Animal(int n,String cs, float ps){
        this.nb_pattes=n;
        this.couleur=cs;
        this.poids=ps;
        
    }
    public int getNbPattes(){
        return this.nb_pattes;
    }
    public String getCouleur(){
        return this.couleur;
    }
    public float getPoids(){
        return this.poids;
    }
    
    public void setNbrpat(int a) {this.nb_pattes=a;}
    public void setPoids(float b) {this.poids=b;}
    public void setColeur(String c) {this.couleur=c;}


    public  void boire(){
        System.out.println("je bois de l'eau");
    };
       
    
    public  String toString(){
        return("je suis un animal nombre patt est "+nb_pattes+ " de coleur est "+couleur 
			+ "et de poids "+poids);

    };
}
