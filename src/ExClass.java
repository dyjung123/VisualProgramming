import java.util.ArrayList;
import java.util.Scanner;

public class ExClass {
    static double num = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();    // String형만을 요소로 하는 ArrayList 선언.
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(int i=0; i<6; i++) {
            arr.add(sc.next());
            switch(arr.get(i)) {
                case "A":
                    num += 4.0;   //총점에 누적.
                    break;
                case "B":
                    num += 3.0;   //총점에 누적.
                    break;
                case "C":
                    num += 2.0;   //총점에 누적.
                    break;
                case "D":
                    num += 1.0;   //총점에 누적.
                    break;
                case "F":
                    break;
                default:
                    break;
            }
        }
        System.out.println(num/6);      //평점 구하기.
        sc.close();                     //Scanner 사용 종료
    }
}
