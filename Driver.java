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

        ArrayList smaller = new ArrayList<Integer>();
        smaller.add(1);
        System.out.println("Bubble before: " + smaller);
        Sorts.bubble(smaller);
        System.out.println("Bubble after: " + smaller + "\n");

        ArrayList small = new ArrayList<Integer>();
        small.add(1);
        small.add(2);
        System.out.println("Bubble before: " + small);
        Sorts.bubble(small);
        System.out.println("Bubble after: " + small + "\n");

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

        ArrayList littler = new ArrayList<Integer>();
        littler.add(1);
        System.out.println("\nInsertion before: " + littler);
        Sorts.insertion(littler);
        System.out.println("Insertion after: " + littler + "\n");

        ArrayList little = new ArrayList<Integer>();
        little.add(1);
        little.add(2);
        System.out.println("\nInsertion before: " + little);
        Sorts.insertion(little);
        System.out.println("Insertion after: " + little + "\n");

        ArrayList insertionman = new ArrayList<Integer>();
        insertionman.add(7);
        insertionman.add(1);
        insertionman.add(5);
        insertionman.add(12);
        insertionman.add(3);
        System.out.println("\nInsertion before: " + insertionman);
        Sorts.insertion(insertionman);
        System.out.println("Insertion after: " + insertionman + "\n");

        ArrayList up = new ArrayList<Integer>();
        up.add(1);
        up.add(3);
        up.add(5);
        up.add(7);
        up.add(12);
        System.out.println("\nInsertion before: " + up);
        Sorts.insertion(up);
        System.out.println("Insertion after: " + up + "\n");

        ArrayList down = new ArrayList<Integer>();
        down.add(12);
        down.add(7);
        down.add(5);
        down.add(3);
        down.add(1);
        System.out.println("\nInsertion before: " + down);
        Sorts.insertion(down);
        System.out.println("Insertion after: " + down + "\n");

        System.out.println("testing selection sort:");

        ArrayList bob = new ArrayList<Integer>();
        bob.add(1);
        System.out.println("\nSelection before: " + bob);
        Sorts.selection(bob);
        System.out.println("Selection after: " + bob);

        ArrayList goingup = new ArrayList<Integer>();
        goingup.add(1);
        goingup.add(3);
        goingup.add(4);
        goingup.add(7);
        goingup.add(13);
        System.out.println("\nSelection before: " + goingup);
        Sorts.selection(goingup);
        System.out.println("Selection after: " + goingup);

        ArrayList goingdown = new ArrayList<Integer>();
        goingdown.add(13);
        goingdown.add(7);
        goingdown.add(4);
        goingdown.add(3);
        goingdown.add(1);
        System.out.println("\nSelection before: " + goingdown);
        Sorts.selection(goingdown);
        System.out.println("Selection after: " + goingdown);

        ArrayList selectionman = new ArrayList<Integer>();
        selectionman.add(5);
        selectionman.add(4);
        selectionman.add(1);
        selectionman.add(3);
        selectionman.add(2);
        System.out.println("\nSelection before: " + selectionman);
        Sorts.selection(selectionman);
        System.out.println("Selection after: " + selectionman);
    }
}
