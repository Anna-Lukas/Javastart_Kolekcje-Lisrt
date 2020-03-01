package Comparator_Zadanie;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        int [] array = {2,8,4,1};
        System.out.println ("Tablica przed posortowaniem: "+ Arrays.toString (array));
        Arrays.sort (array);
        System.out.println ("Tablica po posortowaiu: "+ Arrays.toString (array));



        List<Integer> collection = new ArrayList<> (Arrays.asList (6,2,8,1));
        System.out.println ("Kolekcja przed posortowaniem: "+ collection);

        Collections.sort (collection);
        System.out.println ("Kolekcja po posortowaniu"+ collection);

    }
}
