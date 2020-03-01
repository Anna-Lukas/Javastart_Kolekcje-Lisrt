import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> list = List.of (5,10,15);
        System.out.println (list);



    }
    public static void printList(List<Double> list){
        for (Double element:list){
            System.out.println (element);
        }

    }
}
