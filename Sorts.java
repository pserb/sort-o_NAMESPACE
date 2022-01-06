public class Sorts {
  public static void bubble( ArrayList<Comparable> data )
  {
    //tracks start index of "confirmed" set (aka # of passes)
    for(int x = 0; x < data.size()-1; x ++) {
      //variable that declares ArrayList length
      int y = data.size();
      //iterates through the array until it reaches the "confirmed" numbers
      while (y > (x+1)) {
        //if value at index is less than value at index directly before
        if (data.get(y-1).compareTo(data.get(y-2)) < 0) {
          //swap values using a temporary variable to ensure that we don't set both indices are not set to the same value
          Comparable dummy = data.get(y-1);
          data.set(y-1, data.get(y-2));
          data.set(y-2, dummy);
        }
        //decrement bubble by an index
        y--;
      }
    }
  }

  public static void selection( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    // start at the rightmost end
    for(int pass = data.size()-1; pass > 0; pass--) {
      Comparable hi = data.get(0);
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag

      // search for biggest number to the right of index pass
      for(maxPos = pass; maxPos > 0; maxPos--) {
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
        if (data.get(maxPos).compareTo(hi) > 0) {
          hi = data.get(maxPos);
        }
      }

      Comparable p1 = data.get(pass);
      data.set(pass, hi);
      data.set(data.indexOf(hi), p1);

      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort

  public static void insertion( ArrayList<Comparable> data )
  {
    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for(int i = partition; i > 0; i--) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo(data.get(i-1)) < 0) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          Comparable dummy = data.get(i);
          data.set(i,data.get(i-1));
          data.set(i-1,dummy);
        }
        else
          break;
      }
    }
  }//end insertionSortV

}
