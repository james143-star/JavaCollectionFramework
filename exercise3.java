/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beldalists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 2ndyrGroupB
 */
public class exercise3 {
    public static void main(String[] args) {
        List<String> number = new ArrayList<String>();
        number.add("3");
        number.add("8");
        number.add("23");
        number.add("91");
        number.add("6");
        number.add("1");
        System.out.println("           Exercise 3");
        System.out.println(number);
        String min = Collections.min(number);
        number.add(0,min);
        number.set(6,"");
        System.out.println(number);
       
    }
}
