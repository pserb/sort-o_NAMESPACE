// Team NAMESPACE: Max Schneider, Paul Serbanescu, Orion Roven
// APCS pd7
// lab
// 2022-01-06
// time spent:  hrs

/*********************
== Class Driver ==
* code to illustrate:
* best & worst case for - bubble, insertion, selection sort
* keep track of: passes, comparisons, swaps
*********************/

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList bubbleman = new ArrayList<Integer>();
        bubbleman.add(7);
        bubbleman.add(1);
        bubbleman.add(5);
        bubbleman.add(12);
        bubbleman.add(3);
        System.out.println("Bubble before: " + bubbleman);
        Sorts.bubble(bubbleman);
        System.out.println("Bubble after: " + bubbleman);

        ArrayList insertionman = new ArrayList<Integer>();
        insertionman.add(7);
        insertionman.add(1);
        insertionman.add(5);
        insertionman.add(12);
        insertionman.add(3);
        System.out.println("\nInsertion before: " + insertionman);
        Sorts.insertion(insertionman);
        System.out.println("Insertion after: " + insertionman);

        ArrayList selectionman = new ArrayList<Integer>();
        selectionman.add(7);
        selectionman.add(1);
        selectionman.add(5);
        selectionman.add(12);
        selectionman.add(3);
        System.out.println("\nSelection before: " + selectionman);
        Sorts.selection(selectionman);
        System.out.println("Selection after: " + selectionman);
    }
}