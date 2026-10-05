import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Map_s {
    public static void main(String[] args) {
        Map<String, Integer> item = new Hashtable<>();

        item.put("Tushar",1 );
        item.put("Akib", 2);
        item.put("Ritesh",3);

        System.out.println("Key set ==");
        System.out.println(item.keySet());

        System.out.println("key - values ==");
        for( String key : item.keySet()){
            System.out.println(key + " - " + item.get(key));
        }
    }
}
