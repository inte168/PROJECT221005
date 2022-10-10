//5�� 5��
package problem;

class Point {//������ point
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y;}
    public int getX() {return x;}
    public int getY() {return y;}
    protected void move(int x, int y) { this.x= x; this.y = y;}
}

class ColorPoint extends Point {
    private String color;
    public ColorPoint(int x, int y, String color){//x,y�� ��ӵ� Ŭ�������� ó��, color�� ���⼭ this �̿�.
        super(x, y);
        this.color=color;
    }
    public void setXY(int x, int y) {//x, y�� �̵�.(��ӵ� Ŭ�������� ó��)
        move(x, y);
    }
    public void setColor(String color){//�� ����
        this.color = color;
    }
    public String toString() {//��µ� ��Ŀ� �°� ���.
        return color + "���� (" + getX() + ", " + getY() + ")�� ��";
    }
}

public class colorPointing {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5,5,"YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "�Դϴ�.");
    }
}
