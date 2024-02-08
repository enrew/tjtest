import java.util.HashSet;

public class Ex14 {
    public static void main(String[] args) {
        HashSet<String> str =new HashSet<String>();

        str.add("A");
        str.add("B");
        str.add("C");

        System.out.println(str);

        System.out.println("요소");
        for (String elements : str)
            System.out.println(elements + " ");

    }
}
