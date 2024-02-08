import java.io.File;

public class Ex07 {
    public static void main(String[] args) {
        File finfo = new File("example01.txt");
        if (finfo.exists()) {
            System.out.println("File Name: " + finfo.getName());
            System.out.println("Absolute Path: " + finfo.getAbsolutePath());
            System.out.println("Can Write: " + finfo.canWrite());
            System.out.println("Can Read: " + finfo.canRead());
            System.out.println("File Length: " + finfo.length());
        } else {
            System.out.println("존재하는 파일이 아닙니다");
        }
    }
}
