/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beldalists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author 2ndyrGroupB
 */
public class exercise8 {
    public static void main(String[] args) {
       System.out.println("Exercise8");
       Map<String, String> mapList = new HashMap<>();
       mapList.put("concordia", "barcelona");
       mapList.put("concordia1222", "philippines");
       mapList.put("acconcordia", "england”");
       mapList.put("condensada", "cream");
       

       int count = 0;

       Iterator word = mapList.entrySet().iterator();
       while (word.hasNext()) {
           Map.Entry<String, String> pairs = (Map.Entry) word.next();
           if (pairs.getKey().substring(0, 9).contains("concordia")) {
             //  System.out.println(pairs.getKey());

               count++;

           }

       }
        System.out.println("These are the lists:");
       System.out.println(mapList);
        System.out.println("");
       System.out.println("There are " + count + " keys with the value of concordia");
    }
}
