
import java.util.ArrayList;
import java.util.Comparator;

public class Ex13 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 10; i >= 1; i--)
            num.add(i);

        System.out.println(num);

        System.out.println("정렬 전 :");
        for (int i = 0; i < num.size(); i++)
            System.out.println(num.get(i) + " ");

        num.sort(Comparator.reverseOrder());

        System.out.println();
        System.out.println("정렬 후 : ");
        for (int i = 0; i < num.size(); i++)
            System.out.println(num.get(i) + " ");
    }
}
