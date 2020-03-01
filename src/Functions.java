import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {
     public static void main(String[] args) {
         //interfejs typu Function - przekształca jeden obiekt w drugi
         //kożystamy z metody apply
         String original = "   WIELKI NAPIS   ";
         Function<String, String> func = (s) -> s.toLowerCase ().trim ();
         String change = func.apply (original);

         //interfejs typu Consumer - nic nie zwraca tylko wyświetla podany obiekt
         //Korzystamy z metodu applay
         Consumer<String> print3Times = (String s) -> {
             System.out.println (change);
             System.out.println (change);
             System.out.println (change);
             System.out.println (change);
         };
         print3Times.accept (change);

         int personAge = 19;
         Predicate<Integer> checkIfAdult = age -> age >= 18;
         boolean check1 = checkIfAdult.test (personAge);

         String[] firstNames = {"Jan", "Magdalena", "Piotr"};
         String[] lastNames = {"Morn", "Malina", "Pietraszewski"};
         int[] ages = {22, 33, 44};
         Random random = new Random ();
         Supplier<Person> radnomPersonGenerator = () -> {
             String firstName = firstNames[random.nextInt (firstNames.length)];
             String lastName = lastNames[random.nextInt (lastNames.length)];
             int age = ages[random.nextInt (ages.length)];

             return new Person (firstName, lastName, age);
         };
         System.out.println (radnomPersonGenerator.get ());
         System.out.println (radnomPersonGenerator.get ());
         System.out.println (radnomPersonGenerator.get ());
         System.out.println (radnomPersonGenerator.get ());
         System.out.println (radnomPersonGenerator.get ());
         System.out.println (radnomPersonGenerator.get ());

     }


     }



