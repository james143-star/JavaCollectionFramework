/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beldalists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise7 {
    public static void main(String[] args) {
         List<String> array1 = Arrays.asList("ilong","mata","baba","dunggan");
        List<String> array2 = Arrays.asList("ilong","suwang","liog","dunggan");
        
        Set<String> same = new HashSet<String>(array1);
        same.addAll(array2);
        
        Set<String> intersection = new HashSet<String>(array1);
        intersection.retainAll(array2);
        same.removeAll(intersection);
        System.out.println("");
        System.out.println("           Exercise 7");
        System.out.println("");
        System.out.println("First set are:  "+array1);
        System.out.println("second set are: "+array2);
        for(String different : same){
            System.out.println("Th unique values are:  "+ different);
        }
    }
}
