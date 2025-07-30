package java_assignment;

import java.util.HashMap;

public class Question15 {

	public static void main(String[] args) {

		int a[] = {10, 20, 30, 40, 10, 20, 30, 10, 20, 10};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(!map.containsKey(a[i]))
				map.put(a[i], 1);
			else
				map.replace(a[i], map.get(a[i]) + 1);
		}
		System.out.println(map);
	}
}