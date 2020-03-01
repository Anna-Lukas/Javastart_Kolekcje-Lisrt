package Comparator_Zadanie;

import java.util.*;

public class SortingWithComparator {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<> (Arrays.asList (6,2,8,1));

        Comparator<Integer> normalCompare = (x, y) -> {
            if (x > y) {
                return 1;
            } else if (x == y) {
                return 0;
            } else {
                return -1;
            }
        };
        Comparator<Integer> reverseCompare = (x,y)->{
            if(x<y){
                return 1;
            }else if (x==y){
                return 0;
            }else {
                return -1;
            }
        };

        System.out.println ("Przed posortowaniem: " + collection);

        Collections.sort (collection,normalCompare);
        System.out.println ("Po posortuwaniu: "+ collection);
        Collections.sort (collection, reverseCompare);
        System.out.println ("Po posortowaniu: "+ collection);

    }
}