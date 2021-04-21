/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beldalists;

import java.util.HashSet;

/**
 *
 * @author 2ndyrGroupB
 */
public class exercise6 {
    public static void main(String[] args) {
         System.out.println("           exercise 6");
        System.out.println("");
        HashSet<String> mountainanimal = new HashSet<String>();
        mountainanimal.add("fox");
        mountainanimal.add("wolf");
        mountainanimal.add("cat");
        mountainanimal.add("dogs");
        mountainanimal.add("carabao");
        mountainanimal.add("birds");
        mountainanimal.add("horses");
        mountainanimal.add("cows");
        System.out.println("first set :  " + mountainanimal);
        HashSet<String> petanimal = new HashSet<String>();
        petanimal.add("lion");
        petanimal.add("bear");
        petanimal.add("cat");
        petanimal.add("dogs");
        petanimal.add("dophin");
        petanimal.add("birds");
        System.out.println("second set of animals :  " + petanimal);
        mountainanimal.retainAll(petanimal);
        System.out.println("The unique animals" + mountainanimal);

    }
}
