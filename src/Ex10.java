import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        File file = new File("member.txt");

        try {
            if (!file.exists())
                file.createNewFile();


            FileWriter fw = new FileWriter(file);
            Scanner input = new Scanner(System.in);

            boolean quit = false;
            while (!quit) {
                System.out.print("ID : ");
                String userID = input.next();
                fw.write("ID :" + userID + " ");

                System.out.print("Name : ");
                String userName = input.next();
                fw.write("Name : " + userName + "\n");

                System.out.println("진행? Y:N");
                input = new Scanner(System.in);
                String str = input.nextLine();

                if (str.equalsIgnoreCase("N")) quit = true;
                fw.close();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
//다시 해보기