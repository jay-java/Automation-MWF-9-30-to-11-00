package core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class P022_Set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(123);
		set.add("java");
		set.add('h');
		set.add(false);
		set.add(234565467);
		set.add(456.456);
		set.add(123);
		System.out.println(set);
		System.out.println(set.size());
		set.add("data");
		System.out.println(set);
		set.remove(3);
		System.out.println(set);

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
