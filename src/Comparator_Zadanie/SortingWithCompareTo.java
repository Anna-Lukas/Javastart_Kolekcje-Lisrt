package Comparator_Zadanie;

import java.util.Arrays;

public class SortingWithCompareTo {
    public static void main(String[] args) {
        Integer [] array = {6,2,8,12};
        System.out.println ("Przed posortowaniem: " + Arrays.toString (array));
        Arrays.sort (array, (x,y)->y.compareTo (x));
        System.out.println ("Po posortowaniu: "+ Arrays.toString (array));

        Arrays.sort (array, (x,y)->x.compareTo (y));
        System.out.println ("Po posortowaniu: "+ Arrays.toString (array));
    }
}
