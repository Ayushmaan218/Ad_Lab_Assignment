package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		if (set.contains(1)) {
			System.out.println("Set Contains 1");
		}
		if (!set.contains(6)) {
			System.out.println("Set does not not Contains 6");
		}
		set.remove(1);
		if (!set.contains(1)) {
			System.out.println("Set does not not Contains 1");
		}
		System.out.println("Size of set:" + set.size());
		System.out.println(set);

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
