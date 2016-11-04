package jsong00505.study.leetcode.no1;

import com.sun.tools.javac.util.StringUtils;
import jsong00505.core.utils.SortingMathods;

import java.util.*;

/**
 * Created by jsong on 11/4/16.
 *
 * reference: http://www.programcreek.com/2013/03/java-sort-map-by-value/
 *
 * Runtime: 87 ms
 */
public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        HashMap<String, Integer> gatherMap = new HashMap<>();

        for(char c: s.toCharArray()) {
            gatherMap.put(c+"", gatherMap.getOrDefault(c+"", 0) + 1);
        }

        TreeMap<String, Integer> resultMap = SortingMathods.sortedMapByValue(gatherMap);
        StringBuilder resultStr = new StringBuilder();
        System.out.println(resultMap);


        for (Map.Entry<String,Integer> entry : resultMap.entrySet()) {
            Integer value = entry.getValue();
            String key = entry.getKey();

            for(int i=0;i<value;i++) {
                resultStr.append(key);
            }
        }
        System.out.println(resultStr.toString());
        return resultStr.toString();
    }
}
