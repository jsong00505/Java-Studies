package jsong00505.study.hack30days;

import java.util.HashMap;
import java.util.Scanner;

public class Day8DictionariesAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, String> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, Integer.toString(phone));
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s)) {
            	System.out.println(s + "=" + phoneBook.get(s));
            } else {
            	System.out.println("Not found");
            }
            // Write code here
        }
        in.close();
    }
}
