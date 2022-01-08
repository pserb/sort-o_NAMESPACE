import java.util.ArrayList;

public class SortsAlt {
  public static int bubble( ArrayList<Comparable> data , int searcher)
  {
    int swapCtr = 0;
    int passCtr = 0;
    int compareCtr = 0;
    //tracks start index of "confirmed" set (aka # of passes)
    for(int x = 0; x < data.size()-1; x ++) {
      passCtr++;
      //variable that declares ArrayList length
      int y = data.size();
      //iterates through the array until it reaches the "confirmed" numbers
      while (y > (x+1)) {
        compareCtr++;
        //if value at index is less than value at index directly before
        if (data.get(y-1).compareTo(data.get(y-2)) < 0) {
          //swap values
          Comparable dummy = data.get(y-1);
          data.set(y-1, data.get(y-2));
          data.set(y-2, dummy);
          swapCtr++;
        }
        //decrement bubble by an index
        y--;

      }
    }
    if(searcher == 0) {
      return swapCtr;
    }else if (searcher == 1) {
      return passCtr;
    }else {
      return compareCtr;
    }
  }

  public static int selection( ArrayList<Comparable> data , int searcher)
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    int swapCtr = 0;
    int passCtr = 0;
    int compareCtr = 0;
    // start at the rightmost end
    for(int pass = data.size()-1; pass > 0; pass--) {
      passCtr++;
      Comparable hi = data.get(0);
    //   System.out.println( "\nbegin pass " + (data.size()-pass) );//diag

      // search for biggest number to the right of index pass
      for(maxPos = pass; maxPos > 0; maxPos--) {
        // System.out.println( "maxPos: " + maxPos );//diag
        // System.out.println( data );//diag
        compareCtr++;
        if (data.get(maxPos).compareTo(hi) > 0) {
          hi = data.get(maxPos);
        }
      }

      Comparable p1 = data.get(pass);
      data.set(pass, hi);
      data.set(data.indexOf(hi), p1);
      swapCtr++;

    //   System.out.println( "after swap: " +  data );//diag
    }
    if(searcher == 0) {
      return swapCtr;
    }else if (searcher == 1) {
      return passCtr;
    }else {
      return compareCtr;
    }
  }//end selectionSort

  public static int insertion( ArrayList<Comparable> data , int searcher)
  {
    int swapCtr = 0;
    int passCtr = 0;
    int compareCtr = 0;
    for(int partition = 1; partition < data.size(); partition++) {
      passCtr++;
      //partition marks first item in unsorted region

    //   System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
    //   System.out.println( data );

      //traverse sorted region from right to left
      for(int i = partition; i > 0; i--) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        compareCtr++;
        if ( data.get(i).compareTo(data.get(i-1)) < 0) {

        //   System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          Comparable dummy = data.get(i);
          data.set(i,data.get(i-1));
          data.set(i-1,dummy);
          swapCtr++;
        }
        else
          break;
      }
    }
    if(searcher == 0) {
      return swapCtr;
    }else if (searcher == 1) {
      return passCtr;
    }else {
      return compareCtr;
    }
  }//end insertionSortV

}
