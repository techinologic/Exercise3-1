import java.util.ArrayList;
import java.util.List;

/**
 * COSC302-Assign03 - Exercise3-1
 * Created by Paolo T. Inocencion on 09/23/17.
 */
public class ListDemo {

    // method that will fill arraylist L with 2^i
    private static void fillArrayList(List<Integer> listToFill, int listSize) {

        for (int i = 0; i < listSize; i++) {
            listToFill.add((int) (Math.pow(2, i)));
        }
    }

    // method that will print the elements in L
    // that are in positions specified by List P.
    private static void printLots(List<Integer> L, List<Integer> P) {
        for (Integer eP : P) {
            System.out.println(L.get(eP));
        }
    }

    public static void main(String[] args) {

        List<Integer> L = new ArrayList<>();// A list that contains a^i
        List<Integer> P = new ArrayList<>(); // A list that contains the indexes

        //add the indexes to list P.
        P.add(1);
        P.add(3);
        P.add(4);
        P.add(6);

        fillArrayList(L, 16);
        printLots(L, P);
    }

}
