package datastructure;

import java.util.HashMap;
import java.util.Iterator;

public class UseMap {

	public static void main(String[] args) throws Exception {

		HashMap<Object, Object> map = new HashMap<>();
		map.put(1234, "tom");
		map.put(4321, "jerry");
		map.put(4124, "holland");

		Iterator<Object> mapIter = map.keySet().iterator();
		Object key = null;
		while (mapIter.hasNext());
		System.out.println("Key: " + key);
		System.out.println("Value: " + map.get(key));


	}
	String tableName = "test_hash_map";


}
