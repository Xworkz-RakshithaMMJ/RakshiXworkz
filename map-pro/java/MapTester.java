import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTester {

	public static void main(String[] args) {

		Map<String, Integer> map=new HashMap<String, Integer>();
		
		String name="Suresh Raina";
		int age=36;
		
		map.put(name, age);
		map.put("Geetha",47);//new Entry<String,Integer> 
		map.put("Pradeep",51);
		map.put("Rajee",26);
		map.put("Rakshi",22);
		map.put("Teju",22);
		map.put("Arjun",25);
		map.put(null, null);
		map.put("Roshan", null);
		System.out.println(map.size());
		
		Integer value=map.get("Geetha");
		System.out.println(value);
		
		Set<String> keys=map.keySet();
		
		keys.forEach(anything->{
		Integer v=map.get(anything);
		System.out.println(anything +"age is "+v);
		});
		
		Collection<Integer> values=map.values();
		
		values.forEach(a->System.out.println(a));

		Set<Entry<String,Integer>> entrySet=map.entrySet();
		System.out.println(entrySet.size());
		entrySet.forEach(r->{
			System.out.println(r.getKey());
			System.out.println(r.getValue());
		});
		
	}

}

