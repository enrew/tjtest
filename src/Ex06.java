import java.io.File;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        File file = new File("examole01.txt");
        try {
            boolean success = file.createNewFile();
            if(success){
                System.out.println("success");
            }else {
                throw new IOException("fail");
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
