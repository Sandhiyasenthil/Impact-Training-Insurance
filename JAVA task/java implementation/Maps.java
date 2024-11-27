import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        HashMap <String,String> h=new HashMap<>();
        h.put("name","sandhiya");
        h.put("area","kovai");
        
        System.out.println(h.get("name"));
        System.out.println(h);

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Alice", 30);
        map.put("Charlie", 35);
        map.put("Bob", 25);
        System.out.println(map);

        LinkedHashMap<String, Integer> map1= new LinkedHashMap<>();
        map1.put("Charlie", 30);
        map1.put("Alice", 25);
        map1.put("Bob", 35);

        System.out.println(map1);

    
}
}
