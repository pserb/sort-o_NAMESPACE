import java.util.ArrayList;

/** Class CaseTester
 * Figure out the best and worst case for
 * bubble, selection, insertion
 */

public class CaseTester {
    public static void main(String[] args) {
        /*
        1,2,3
        1,3,2
        2,1,3
        2,3,1
        3,1,2
        3,2,1
        */
        // contains all arraylist permutations of 1,2,3
        ArrayList<ArrayList<Comparable>> arr = new ArrayList<>();

        // create ArrayLists of the 6 permutations of 1,2,3
        ArrayList<Comparable> p1 = new ArrayList<>();
        p1.add(1);
        p1.add(2);
        p1.add(3);
        //
        ArrayList<Comparable> p2 = new ArrayList<>();
        p2.add(1);
        p2.add(3);
        p2.add(2);
        //
        ArrayList<Comparable> p3 = new ArrayList<>();
        p3.add(2);
        p3.add(1);
        p3.add(3);
        //
        ArrayList<Comparable> p4 = new ArrayList<>();
        p4.add(2);
        p4.add(3);
        p4.add(1);
        //
        ArrayList<Comparable> p5 = new ArrayList<>();
        p5.add(3);
        p5.add(1);
        p5.add(2);
        //
        ArrayList<Comparable> p6 = new ArrayList<>();
        p6.add(3);
        p6.add(2);
        p6.add(1);

        // add arrays to arr container
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);
        arr.add(p6);

        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {

            System.out.println("\nTesting array " + arr.get(i));
            // uncomment which sorting algo you want to test
            // Sorts.bubble(arr.get(i));
            Sorts.selection(arr.get(i));
            // Sorts.insertion(arr.get(i));
        }
        System.out.println(arr);
    }
}
