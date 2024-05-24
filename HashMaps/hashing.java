import java.util.HashSet;
import java.util.Iterator;

public class hashing {
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(5);
        set.add(10);
        set.add(7);
        set.add(1);

        // System.out.println("size of set is " + set.size());

        // //print all elements
        // for (int x : set) {
        //     System.out.print(x);
        // }

        // System.out.println(set);

        // // search

        // if (set.contains(1)) {
        //     System.out.println("Found");
        // }

        // if (!set.contains(10)) {
        //     System.out.println("Not Found");}
        // // } else {
        // //     System.out.println("Found");
        // // }

        // // delete

        // set.remove(1);
        // if (!set.contains(1)) {
        //     System.out.println("we deleted one");
        // } else {
        //     System.out.println("Found");
        // }

        Iterator it = set.iterator();  //iterator is an interface
        //hasNext() returns true if there is a next element
        //next() returns the next element
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
