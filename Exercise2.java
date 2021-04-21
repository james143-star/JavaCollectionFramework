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
public class Exercise2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("james");
        names.add("romeo");
        names.add("justine");
        names.add("miguel");
        names.add("eleazar");
        System.out.println(names);
        Collections.shuffle(names);
        System.out.println("Random names: "+names);
    }
}
