import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Location {
    String city; // 도시이름
    int lon; // 경도
    int lat; // 위도

    public Location(String city, int lon, int lat) {
        this.city = city;
        this.lon = lon;
        this.lat = lat;
    }
}
public class LocationDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Location> hash = new HashMap<String,Location>();  // HashMap 선언
        System.out.println("도시,경도,위도를 입력하세요.");
        for (int i=0; i<4; i++) {
            System.out.print(">> ");
            String[] tmp = sc.nextLine().split(",\\s+"); // 구분자는 ,과 한 개 이상의 공백
            hash.put(tmp[0],new Location(tmp[0],Integer.parseInt(tmp[1]),Integer.parseInt(tmp[2])));
        }

        Iterator it1 = hash.entrySet().iterator();
        System.out.println("------------------");
        while (it1.hasNext()){  // Iterator를 통한 출력
            Map.Entry entry = (Map.Entry)it1.next();
            System.out.print(entry.getKey());
            for (int i=5;i>entry.getKey().toString().length();i--) {  // 글자수에 따라 공백 출력 갯수 조절
                System.out.print(" ");
            }
            System.out.print(hash.get(entry.getKey()).lon);
            String tmp = Integer.toString(hash.get(entry.getKey()).lon);
            for (int j=5;j>tmp.length();j--) {  // 글자수에 따라 공백 출력 갯수 조절
                System.out.print(" ");
            }
            System.out.print(hash.get(entry.getKey()).lat);
            System.out.println("");
        }
        System.out.println("------------------");

        while (true) {
            String keycity = "empty";
            System.out.print("도시 이름 >> ");
            String keyname = sc.next();
            if (keyname.equals("그만")) break;
            it1 = hash.entrySet().iterator();
            while (it1.hasNext()) {
                Map.Entry entry2 = (Map.Entry)it1.next();
                if (entry2.getKey().equals(keyname)) { // keyname과 일치하는 key가 존재하면 추출
                    keycity = keyname;
                    break;
                }
            }
            if (keycity.equals("empty")) {  // 없는 도시 이름을 검색했으면 없습니다 메세지 출력
                System.out.println(keyname + "는 없습니다.");
                continue;
            }
            System.out.println(keyname + " " + hash.get(keyname).lon + " " + hash.get(keyname).lat);
        }
    }
}
