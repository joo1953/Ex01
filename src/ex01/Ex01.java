package ex01;
class Tri{
    double a;
    double b;
    double c;

    public Tri(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getB(){
        return b;
    }
    public double getA(){
        return a;
    }
    public double getC(){
        return a*b*0.5;
    }
}
public class Ex01 {
    public static void main(String[] args) {

    Tri t = new Tri(3, 5);
        System.out.println("삼각형의 넓이 : "+t.getC());
    }
}
// OO can do OO = 구현 -------닫힌 삼각형
// OO is a OO = 상속
// OO has a OO = 연관
// 의존은 연관보다 약하다.