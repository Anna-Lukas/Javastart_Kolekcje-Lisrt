package Comparator_Zadanie;

import java.util.Arrays;

public class SortingWithCOmpareToString {
    public static void main(String[] args) {
        String [] array = {"Asia", "Katarzyna", "Maria"};
        System.out.println ("Przed posortowaniem: " + Arrays.toString (array));
        Arrays.sort (array, (x,y)->y.compareTo (x));
        System.out.println ("Po posortowaniu: "+ Arrays.toString (array));

        Arrays.sort (array, (x,y)->x.compareTo (y));
        System.out.println ("Po posortowaniu: "+ Arrays.toString (array));

        Arrays.sort (array, (x,y)->Integer.compare (x.length (),y.length ()));
        System.out.println ("Po posortowaniu względem długości"+ Arrays.toString (array));
    }
}

