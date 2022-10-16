package hashing;

import java.util.HashMap;
import java.util.Set;

public class HashOperation {

	public static void main(String[] args) {
	HashMap<String , Integer> map = new HashMap<>();
	map.put("divya" , 1);
	map.put("gaurav", 2);
	map.put("pooja", 3);
	
	if(map.containsKey("pooja")){
		System.out.println("pooja exist in DG");	
	}
	
//	if(map.containsKey("abc")) {
//		System.out.println("HashMap ds contains abc");
//	}
	
//	int v = map.get("gaura");
//	System.out.println(v);
	
//	int v1 = 0;
//	if(map.containsKey("pooja")) {
//		v1 = map.get("pooja");
//	}
//	System.out.println(v1);
	
//	map.remove("pooja");
//	if(map.containsKey("pooja")) {
//		System.out.println("map has pooja");
//	}
	
//	System.out.println(map.size());
//	map.put("gk", 4);
//	System.out.println(map.size());
	
	for(Integer s : map.values()) {
		System.out.println(s);
	}
	
	for(String i : map.keySet()) {
		System.out.println(i);
	}
	
	}
}
