import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {
    public static void main(String[] args) {
        try {
            File file = new File("example02.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(file);

            for (int i = 2; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    String str = i + " x " + j + " = " + (i * j) + "\n";
                    byte[] b =str.getBytes();
                    fos.write(b);
                }
            }
            fos.close();
            System.out.println("파일이 성공적으로 생성되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}