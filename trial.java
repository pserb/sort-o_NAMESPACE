import java.util.ArrayList;
public class trial {
  public static void toString(ArrayList[][] input) {
    System.out.println("{");
    for (ArrayList[] a: input) {
      System.out.println("[");
      for(ArrayList b: a) {
        System.out.print(b + ", ");
      }
      System.out.print("]");
    }
    System.out.println("}");
  }

  public static ArrayList createRando (ArrayList a) {
    int top = a.size();
    ArrayList result;
    result = new ArrayList(5);
    ArrayList dummy = a;
    for(int x = 0; x < top; x++) {
      int chooser = (int)(Math.random() * dummy.size());
      result.add(dummy.get(chooser));
      dummy.remove(chooser);
    }
    return result;
  }

  public static void main(String[] args) {
    int sizer = 10;
    ArrayList[] tester = new ArrayList[sizer];

    for(int x = 0; x < sizer; x+=1) {
      ArrayList adder = new ArrayList(5);
      adder.add(1);
      adder.add(2);
      adder.add(3);
      adder.add(4);
      adder.add(5);
      tester[x]=(createRando(adder));
    }
    ArrayList[][] supertester = new ArrayList[3][sizer];
    supertester[0]=tester;
    supertester[1]=tester;
    supertester[2]=tester;
    toString(supertester);
    int counter = 0;
    for(int x = 0; x < 3; x ++) {
      for(int upper = 0; upper<sizer; upper++) {
        ArrayList a = supertester[x][upper];
        counter++;
        System.out.println("Data number: " + counter);
        System.out.println(SortsAlt.bubble(a,x));

        System.out.println("\n" + SortsAlt.selection(a,x));

        System.out.println("\n" + SortsAlt.insertion(a,x));

      }
    }
  }

}
