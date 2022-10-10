//6과 1번
package problem;

public class MyPoint {
    int x; int y;
    public MyPoint(int x, int y) {//생성자
        this.x=x; this.y=y;
    }

    public String toString() {//출력
        return "Point(" + x + ", " + y + ")";
    }

    public boolean equals(Object obj) {//equals 정의
        MyPoint p = (MyPoint)obj;
        if(x == p.x && y == p.y) return true;
        else return false;
    }

    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);
        System.out.println(p);
        if(p.equals(q))
            System.out.println("같은 점");
        else
            System.out.println("다른 점");
    }
}
