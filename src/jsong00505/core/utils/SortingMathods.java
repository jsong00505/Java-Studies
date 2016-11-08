package jsong00505.core.utils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by jsong on 11/4/16.
 *
 * reference: http://www.programcreek.com/2013/03/java-sort-map-by-value/
 */
public class SortingMathods {
    public static TreeMap<String, Integer> sortedMapByValue(HashMap<String, Integer> map){
        Comparator<String> comparator = new ValueComparator(map);
        //TreeMap is a map sorted by its keys.
        //The comparator is used to sort the TreeMap by keys.
        TreeMap<String, Integer> result = new TreeMap<>(comparator);
        result.putAll(map);
        return result;
    }

}

// a comparator that compares Strings
class ValueComparator implements Comparator<String> {

    private HashMap<String, Integer> map = new HashMap<>();

    ValueComparator(HashMap<String, Integer> map){
        this.map.putAll(map);
    }

    @Override
    public int compare(String s1, String s2) {
        if(map.get(s1) >= map.get(s2)){
            return -1;
        }else{
            return 1;
        }
    }
}