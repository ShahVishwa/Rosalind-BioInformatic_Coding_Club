/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosalind;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author vshah
 */
public class countingDNANucleotides {
    
    public int[] countDNA(String str){
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        int[] result = new int[4];
        
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        
        int i = 0;
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry<Character, Integer> entry = it.next();
            result[i++] = entry.getValue();
        }
        return result;
    }
    
}
