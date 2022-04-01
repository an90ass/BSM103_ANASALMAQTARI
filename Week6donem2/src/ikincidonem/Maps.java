package ikincidonem;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class Maps {

	public static void main(String[] args) {
		Map<Integer,String> cities = new TreeMap<Integer,String>();
		//<key, value>
		cities.put(34 ,"Istanbul");
		cities.put(5 ,"Ankara");
		cities.put(2 ,"Izmir");
		cities.put(100 ,"Samsun");
        
		System.out.println(cities);
		System.out.println("Indeksler - keys " +cities.keySet());
		System.out.println(cities.values());
		System.out.println(cities.get(100));
		
		Map <Integer,Set<String>> cities2 =new HashMap<Integer,Set<String>>();
		cities2.put(34, new TreeSet<String>());
		cities2.get(34).add("Istanbul");
		cities2.get(34).add("Besiktas");
		cities2.get(34).add("Eminonu");

		cities2.put(5, new TreeSet<String>());
		cities2.get(5).add("Ankara");
		cities2.get(5).add("Cankaya");
System.out.println(cities2);
  }
}
/*
 output:
Indeksler - keys [2, 5, 34, 100]
[Izmir, Ankara, Istanbul, Samsun]
Samsun
{34=[Besiktas, Eminonu, Istanbul], 5=[Ankara, Cankaya]}
*/
