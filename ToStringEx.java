//6-2
class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {//문자열 반환이라 return이 문자열
        return "Point(" + x + "," + y + ")";
    }
}

public class ToStringEx {
    public static void main(String [] args) {
        Point p = new Point(2,3);
        System.out.println(p.toString());
        System.out.println(p); //p.toString으로 자동 변환
        System.out.println(p + "입니다."); //p.toString 입니다.
    }
}
