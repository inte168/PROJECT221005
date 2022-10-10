//5�� 7��
package problem;

class Point {//������ point
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y;}
    public int getX() {return x;}
    public int getY() {return y;}
    protected void move(int x, int y) { this.x= x; this.y = y;}
}

class Point3D extends Point {
    int z;
    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    public int getZ() {return z;} //z�� ��ȯ.
    protected void moveUp() { this.z +=1;}//z 1 ���
    protected void moveDown() {this.z -=1;}//z 1 �϶�
    protected void move(int x, int y, int z) {move(x,y); this.z=z;}//3���� ��ǥ �̵�- x, y�� �̹� �ִ°�. z�� this��
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")�� ��";//��� ���ÿ� �°� ���.
    }
}

public class Pointing3D{
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3); //x,y,z
        System.out.println(p.toString() + "�Դϴ�.");

        p.moveUp(); //z�� ���
        System.out.println(p.toString() + "�Դϴ�.");
        p.moveDown(); //z�� �϶�
        p.move(10, 10); //x,y�� �̵�
        System.out.println(p.toString() + "�Դϴ�.");

        p.move(100, 200, 300);
        System.out.println(p.toString() + "�Դϴ�.");
    }
}