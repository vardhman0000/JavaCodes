package Hash_Maps;

import java.util.*;

public class Usage {
    public static void main(String[] args) {

        Map<String, String> h = new HashMap<>();

        h.put("Girdhar", "Gopal");
        h.put("Code", "Quotient");
        h.put("Hello", "Hi");
        h.put("Mere", "Gopal");

        System.out.println(h);
        String name = h.get("Girdhar");
        System.out.println(name);

        Collection<String> values = h.values();
        System.out.println(values);

        System.out.println(values.size());

//        int count = 0;
//        int s = values[0];
//        for(String value : values){
//
//        }
    }
}
