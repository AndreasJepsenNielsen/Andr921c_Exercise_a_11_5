import java.util.*;
import java.util.List;
//opgave 5

public class Opgave5 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(7);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(6);
        list.add(3);

        removeDuplicates(list);

    }

    public static void removeDuplicates(List<Integer> list1){
        int length = list1.size();

        Set<Integer> set = new TreeSet<>(); // Treeset sorterer i en naturlig ordre og kan ikke indeholde duplicates

        for (int i = 0; i < length; i++) // eller brug set.addAll(list1) valgte dog at lave et loop i stedet :) selvom set.addAll er hurtigere og mindre kodning
        {
            set.add(list1.get(i));
        }

        System.out.println(set);
    }
}
