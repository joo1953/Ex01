package ex02;
// Scanner, Hash map 이용하여 코드, 성명, 국어, 영어, 수학을 입력받아
// 화면 출력: 3개의 메소드(메인, 입력, 출력)로 구현하기

import java.util.HashMap;
import java.util.Scanner;

class Student{
    private int code, kor, eng, mat;
    private String name;

    public Student(String name, int code ,int kor, int eng, int mat){
        this.name = name;
        this.code = code;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public Student() {

    }

    public  static HashMap<String, Object> input(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        Scanner in = new Scanner(System.in);
        int code, kor, eng, mat;
        String name;

        System.out.println("코드 : ");
        code = in.nextInt();
        System.out.println("이름 : ");
        name = in.next();
        System.out.println("국어 : ");
        kor = in.nextInt();
        System.out.println("영어 : ");
        eng = in.nextInt();
        System.out.println("수학 : ");
        mat = in.nextInt();

        map.put("코드", code);
        map.put("이름", name);
        map.put("국어", kor);
        map.put("영어", eng);
        map.put("수학", mat);

        in.close();
        return map;
    }

    public void output(HashMap<String, Object> map){
        int code, kor, eng, mat;
        String name;

        code = (int) map.get("코드");
        name = (String) map.get("이름");
        kor = (int) map.get("국어");
        eng = (int) map.get("영어");
        mat = (int) map.get("수학");

        System.out.println("코드 : "+code);
        System.out.println("이름 : "+name);
        System.out.println("국어 : "+kor);
        System.out.println("영어 : "+eng);
        System.out.println("수학 : "+mat);
    }

}

public class Ex02 {

    public static void main(String[] args) {
        HashMap<String, Object> map = null;
        Student s = new Student();

        map = s.input();
        s.output(map);

    }

}
