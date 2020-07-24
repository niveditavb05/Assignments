import java.util.HashMap;
import java.util.*;

public class map18_allmethods
{
public static void main(String[] args)
 {
Map<String, String> newHashMap = new HashMap<>();
newHashMap.put("Key1", "Java");
newHashMap.put("Key2", "C++");
newHashMap.put("Key3", "Python");
newHashMap.putIfAbsent("Key4", "gayii");
System.out.println(newHashMap);
HashMap<String, Integer> ms = new HashMap<String, Integer>();
ms.put("S", 35);
ms.put("M", 38);
ms.put("L", 40);
ms.put("XL", 42);
for (String key : ms.keySet()) {
System.out.println("measurement of " + key + " in inch is: " + ms.get(key));
}
 System.out.println("Size of map is: "
                           + ms.size()); 
						    Integer a = ms.get("S"); 
            System.out.println("value for key" + " \"S\" is:  " + a); 
			for (Map.Entry<String, Integer> e : ms.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue()); 
			 System.out.println("The cloned map look like this: " + ms.clone()); 
 System.out.println("Is the map empty? " + ms.isEmpty());
 
    System.out.println("New map is: "+ ms); 
			 ms.clear(); 
        System.out.println("Finally the maps look like this: " + ms); 
		 System.out.println("Is the map empty? " + ms.isEmpty()); 
}
}