package ex03;
// Scanner, Hash map 이용하여 코드, 성명, 국어, 영어, 수학을 2건의 데이터를 입력받아
// 화면 출력: 3개의 메소드(메인, 입력, 출력)로 구현하기 Hash Map + ArrayList

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        ArrayList<HashMap<String, Object>> al = null;

        al = input();
        output(al);

    }

    static ArrayList<HashMap<String, Object>> input() {

        ArrayList<HashMap<String, Object>> al = new ArrayList<HashMap<String, Object>>();

        Scanner in = new Scanner(System.in);

        int code;
        String name;
        int kor, eng, math;

        for (int i = 0; i < 2; i++) {

            HashMap<String, Object> map = new HashMap<String, Object>();

            System.out.println("학번 : ");
            code = in.nextInt();
            map.put("학번", code);

            System.out.println("이름 : ");
            name = in.next();
            map.put("이름", name);

            System.out.println("국어 : ");
            kor = in.nextInt();
            map.put("국어", kor);

            System.out.println("영어 : ");
            eng = in.nextInt();
            map.put("영어", eng);

            System.out.println("수학 : ");
            math = in.nextInt();
            map.put("수학", math);

            al.add(map);

        }

        in.close();

        return al;

    }

    public static void output(ArrayList<HashMap<String, Object>> al) {
        int code;
        String name;
        int kor, eng, math = 0;

        for (int i = 0; i < al.size(); i++) {

            HashMap<String, Object> takeMap = al.get(i);

            code = (int) takeMap.get("학번");// code가 int라 다운캐스팅
            name = (String) takeMap.get("이름");
            kor = (int) takeMap.get("국어");
            eng = (int) takeMap.get("영어");
            math = (int) takeMap.get("수학");

            System.out.println("학번 " + code);
            System.out.println("이름 " + name);
            System.out.println("국어 " + kor);
            System.out.println("영어 " + eng);
            System.out.println("수학 " + math);
            System.out.println();

        }

    }
}

