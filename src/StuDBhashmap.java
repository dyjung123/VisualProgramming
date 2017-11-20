import java.util.*;

class Student {   // 학생 정보를 저장하는 Student 클래스
    String name;
    String department;
    int studentID;
    double grades;
    public Student(String name,String department,int studentID,double grades) { // 필드 초기화
        this.name = name;
        this.department = department;
        this.studentID = studentID;
        this.grades = grades;
    }
}

public class StuDBhashmap {
    public static void main(String[] args) {
        HashMap<String,Student> arr = new HashMap<String,Student>(); // HashMap 선언
        String exit = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
        for (int i=0; i<4; i++) {  // 입력 받은후 HashMap에 삽입
            System.out.print(">> ");
            String[] tmp = sc.nextLine().split(",\\s+");  // 구분자는 ,과 한 개 이상의 공백
            arr.put(tmp[0],new Student(tmp[0],tmp[1],Integer.parseInt(tmp[2]),Double.parseDouble(tmp[3])));
        }
        Iterator it1 = arr.entrySet().iterator();
        System.out.println("------------------");
        while (it1.hasNext()){  // Iterator를 통한 출력
            Map.Entry entry = (Map.Entry)it1.next();
            System.out.print("이름:" + entry.getKey() + "\n학과:" + arr.get(entry.getKey()).department +
                    "\n학번:" + arr.get(entry.getKey()).studentID + "\n학점평균:" + arr.get(entry.getKey()).grades + "\n");
            System.out.println("------------------");
        }

        while (true) {   // 이름을 Key로 학생 정보를 검색
            System.out.print("학생 이름 >> ");
            String keyname = sc.next();
            if (keyname.equals("그만")) break;
            it1 = arr.entrySet().iterator();
            while (it1.hasNext()) {
                Map.Entry entry2 = (Map.Entry)it1.next();
                if (entry2.getKey().equals(keyname)) {
                    System.out.print(keyname + ", " + arr.get(keyname).department +
                            ", " + arr.get(keyname).studentID + ", " + arr.get(keyname).grades + "\n");
                }
            }
        }
        sc.close();
    }
}
