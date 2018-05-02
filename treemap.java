//http://www.dzone.com/links/r/java_collections_framework_part_5.html

import java.util.TreeMap;
public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Integer, String> tree = new TreeMap <Integer, String> ();
                //Java 7, diamond-operator:  TreeMap <Integer, String> tree = new TreeMap <> ();
		tree.put(3, "three");
		tree.put(1, "one");
		tree.put(4, "four");
		tree.put(5, "five");
		tree.put(2, "two");
		System.out.println("keys: " + tree.keySet());//Prints the example in ascending order
		System.out.println("Ceiling: " + tree.ceilingKey(3));
		System.out.println("Higher: " + tree.higherKey(3));
		System.out.println("Floor: " + tree.floorKey(3));
		System.out.println("Lower: " + tree.lowerKey(3));
		System.out.println("Descending keys: " + tree.descendingKeySet());//Prints the example in descending order
		System.out.println("Head map: " + tree.headMap(3));//Backed up map
		System.out.println("Tail map: " + tree.headMap(3));//Backed up map
		System.out.println("Poll first: " + tree.pollFirstEntry());//Gets an remove the first entry
		System.out.println("Poll last: " + tree.pollLastEntry());//Gets an remove the last entry
		System.out.println("keys: " + tree.keySet());
	}

}
