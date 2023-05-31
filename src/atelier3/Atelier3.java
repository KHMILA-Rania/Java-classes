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
public class Atelier3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chat minou=new Chat(4,"noir",30);
        System.out.println(minou.toString());
         System.out.println(minou.jeMange());
         minou.boire();
        
    }
    
}
