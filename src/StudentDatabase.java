import java.util.ArrayList;
import java.util.Scanner;

//class Student {    // 학생 정보를 저장하는 Student 클래스
//    String name;
//    String department;
//    int studentID;
//    double grades;
//    public Student(String name,String department,int studentID,double grades) { // 필드 초기화
//        this.name = name;
//        this.department = department;
//        this.studentID = studentID;
//        this.grades = grades;
//    }
//}

public class StudentDatabase {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        String exit = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
        for (int i=0; i<4; i++) {  // 입력 받은후 ArrayList에 삽입
            System.out.print(">> ");
            String[] tmp = sc.nextLine().split(",\\s+");  // 구분자는 ,과 한 개 이상의 공백
            arr.add(new Student(tmp[0],tmp[1],Integer.parseInt(tmp[2]),Double.parseDouble(tmp[3])));
        }
        System.out.println("------------------");
        for (int i=0; i<4; i++) {  // 출력
            System.out.print("이름:" + arr.get(i).name + "\n학과:" + arr.get(i).department +
                    "\n학번:" + arr.get(i).studentID + "\n학점평균:" + arr.get(i).grades + "\n");
            System.out.println("------------------");
        }

        while (true) {  // 이름으로 학생 정보를 검색
            System.out.print("학생 이름 >> ");
            String keyname = sc.next();
            if (keyname.equals("그만")) break;
            for (int i=0; i<4; i++) {
                if (arr.get(i).name.equals(keyname)) {
                    System.out.print(arr.get(i).name + ", " + arr.get(i).department +
                            ", " + arr.get(i).studentID + ", " + arr.get(i).grades + "\n");
                }
            }
        }
        sc.close();
    }
}
