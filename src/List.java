/**
 * Created by Paolo T. Inocencion on 09/23/17.
 */
public class List {

    public static void printLots(int[] L, int[] P) {
        for (int i = 0; i < P.length; i++) {
            System.out.println(L[P[i]]);
        }
    }

    public static void main(String[] args) {

        int [] L = {212, 351, 437, 587, 654, 710, 811, 912};
        int [] P = {1,3,4,6};

        printLots(L, P);


    }

}
