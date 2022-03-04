package ex01;

class Triangle{
    private int w; // 밑변
    private int h; // 높이
    private double a; // 면적

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void computerea() {
        a = w * h *0.5;
    }
}

public class UseTriangle {

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setW(3);
        t.setH(5);
        t.computerea();
        System.out.println("밑변 : "+ t.getW());
        System.out.println("높이 : "+ t.getH());
        System.out.println("삼걱형 넓이 : "+t.getA());
    }
}
