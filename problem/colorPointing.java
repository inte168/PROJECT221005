//5과 5번
package problem;

class Point {//예시의 point
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y;}
    public int getX() {return x;}
    public int getY() {return y;}
    protected void move(int x, int y) { this.x= x; this.y = y;}
}

class ColorPoint extends Point {
    private String color;
    public ColorPoint(int x, int y, String color){//x,y는 상속된 클래스에서 처리, color만 여기서 this 이용.
        super(x, y);
        this.color=color;
    }
    public void setXY(int x, int y) {//x, y를 이동.(상속된 클래스에서 처리)
        move(x, y);
    }
    public void setColor(String color){//색 설정
        this.color = color;
    }
    public String toString() {//출력된 양식에 맞게 출력.
        return color + "색의 (" + getX() + ", " + getY() + ")의 점";
    }
}

public class colorPointing {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5,5,"YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}
