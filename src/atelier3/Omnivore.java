/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelier3;

/**
 *
 * @author rania
 */
public class Omnivore extends Animal{
   
    public Omnivore(){
        super();
    }
    public Omnivore(int nb,String c, float p){
        super(nb,c,p);
    }
    
    public String jeMange(){
        return "je mange viande et poisson";
    }
}
