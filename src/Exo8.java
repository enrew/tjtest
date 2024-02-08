import java.io.File;
import java.io.FileOutputStream;

public class Exo8 {
    public static void main(String[] args) {
        String  str = "hello";
        try{
            File file =new File("examole02.txt");
            if(!file.exists())
                file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);

            byte[] b =str.getBytes();

            fos.write(b);
            fos.close();
            System.out.println("Y");
        }catch (Exception e){
            e.getMessage();
        }
    }
}
