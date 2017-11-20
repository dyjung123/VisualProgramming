//자바과제아님

import java.util.Scanner;

public class Soohyun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int F = sc.nextInt();

        int a = Integer.parseInt(N) / 100;
        a *= 100;
        for (int i=0;i<100;i++) {
            a += i;
            if (a%F==0) {
                if (i<10) {
                    System.out.println("0"+i);
                    break;
                } else {
                    System.out.println(i);
                    break;
                }
            }
            a -= i;
        }
        sc.close();
    }
}
