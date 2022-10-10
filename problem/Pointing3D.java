//5과 7번
package problem;

class Point {//예시의 point
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
    public int getZ() {return z;} //z값 반환.
    protected void moveUp() { this.z +=1;}//z 1 상승
    protected void moveDown() {this.z -=1;}//z 1 하락
    protected void move(int x, int y, int z) {move(x,y); this.z=z;}//3차원 좌표 이동- x, y는 이미 있는거. z만 this로
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")의 점";//출력 예시에 맞게 출력.
    }
}

public class Pointing3D{
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3); //x,y,z
        System.out.println(p.toString() + "입니다.");

        p.moveUp(); //z값 상승
        System.out.println(p.toString() + "입니다.");
        p.moveDown(); //z값 하락
        p.move(10, 10); //x,y값 이동
        System.out.println(p.toString() + "입니다.");

        p.move(100, 200, 300);
        System.out.println(p.toString() + "입니다.");
    }
}