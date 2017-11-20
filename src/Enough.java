import java.util.HashMap;
import java.util.Scanner;

public class Enough {
    public static void main(String[] args) {
        HashMap<String,Integer> nations = new HashMap<String,Integer>(); // String형의 Key,Integer형의 value
        Scanner sc = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            String key = sc.next();
            if(key.equals("그만")) break;        // "그만"을 입력하면 반복종료
            Integer val = sc.nextInt();
            nations.put(key, val);                // nations에 key와 value를 넣어줌
        }

        while (true) {
            System.out.print("인구 검색 >> ");
            String name = sc.next();
            if(name.equals("그만")) break;
            if (nations.containsKey(name)) {     // Key중에 나라이름이 존재하는지 판별
                System.out.println(name + "의 인구는 " + nations.get(name).toString());
            } else {
                System.out.println(name + " 나라는 없습니다.");
            }
        }
    }
}