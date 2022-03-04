package point;

class Point {

   private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void swap(){
        int tmp = x;
        x=y;
        y=tmp;
    }
}

public class Point2 {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(2);
        p.setY(3);

        p.swap();
        System.out.println("X : " + p.getX() + " Y : " + p.getY());

    }
}
// DTO : - 데이터 타입이 정형화 된 것 유연하지가 않음
//       - 안전한 코딩이 가능함
// Hash map : - 변화가 잘 되고 유연함
//            - 컴파일때는 문제 없지만 실행에서 문제가 생김