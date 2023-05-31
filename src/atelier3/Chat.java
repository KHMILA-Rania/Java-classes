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
public class Chat extends Animal{
    public Chat(){
        
    }
    public Chat(int nb,String couleur,float p){
        super(nb,couleur,p);
        
    }
    public String jeMange(){
        return "je mange jbfnfjbld";
    }
    public void boire(){
        System.out.println("je bois de l'eau");
    }
}
