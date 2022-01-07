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
        System.out.println("testing bubble sort:\n");

        ArrayList bubbleman = new ArrayList<Integer>();
        bubbleman.add(7);
        bubbleman.add(1);
        bubbleman.add(5);
        bubbleman.add(12);
        bubbleman.add(3);
        System.out.println("Bubble before: " + bubbleman);
        Sorts.bubble(bubbleman);
        System.out.println("Bubble after: " + bubbleman + "\n");

        ArrayList ascending = new ArrayList<Integer>();
        ascending.add(1);
        ascending.add(2);
        ascending.add(3);
        ascending.add(4);
        ascending.add(5);
        System.out.println("Bubble before: " + ascending);
        Sorts.bubble(ascending);
        System.out.println("Bubble after: " + ascending + "\n");

        ArrayList descending = new ArrayList<Integer>();
        descending.add(5);
        descending.add(4);
        descending.add(3);
        descending.add(2);
        descending.add(1);
        System.out.println("Bubble before: " + descending);
        Sorts.bubble(descending);
        System.out.println("Bubble after: " + descending + "\n");

        System.out.println("testing insertion sort:");
        ArrayList insertionman = new ArrayList<Integer>();
        insertionman.add(7);
        insertionman.add(1);
        insertionman.add(5);
        insertionman.add(12);
        insertionman.add(3);
        System.out.println("\nInsertion before: " + insertionman);
        Sorts.insertion(insertionman);
        System.out.println("Insertion after: " + insertionman + "\n");

        System.out.println("testing selection sort:");
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
