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
public class Herbivore extends Animal{
    
    
     public Herbivore(){
        super();
    }
    public Herbivore(int n,String c, float p){
        super(n,c,p);
    }
    
    public String jeMange(){
        return "je mange herbe";
    }
}
