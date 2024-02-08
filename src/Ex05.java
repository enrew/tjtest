public class Ex05 {
    void check(int weight) throws Ex02 {
        if ( weight < 100) {
            throw new Ex02("123");
        }
    }

    public static void main(String[] args) {
        Ex05 obj = new Ex05();
        try {
            obj.check(60);
        }
        catch (Ex02 ex){
            System.out.println("에외 처리입니다");
            System.out.println(ex.getMessage());
        }
    }
}
