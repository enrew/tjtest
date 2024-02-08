import java.util.Hashtable;
public class Ex15 {
    public static class Main {
        public static void main(String[] args) {
            // 문자열 배열 선언
            String[] words = {"apple", "banana", "apple", "orange", "banana", "banana"};

            // 해시테이블 생성
            Hashtable<String, Integer> wordCount = new Hashtable<String, Integer>();

            // 각 문자열에 대해 카운트
            for(String word : words) {
                Integer count = wordCount.get(word); // 문자열을 받아서 숫자(횟수)로 저장 래퍼 클래스를 사용한 이유
                if(count == null) {
                    wordCount.put(word, 1);
                } else {
                    wordCount.put(word, count + 1);
                }
            }
            System.out.println(wordCount);
        }
    }
}
