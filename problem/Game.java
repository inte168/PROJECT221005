//5�� openchallenge
package problem;

import java.util.Random;
import java.util.Scanner;


abstract class GameObject {
    protected int distance;
    protected int x, y;

    public GameObject(int startX, int startY, int distance) {
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }
    public int getX() {return x;}
    public int getY() {return y;}
    public void setX(int x) {this.x=x;}
    public void setY(int y) {this.y=y;}
    public boolean collide(GameObject p) {
        if(this.x == p.getX() && this.y == p.getY())
            return true;
        else
            return false;
    }
    protected abstract void move(int inX, int inY);//�̵����� ��ġ�� ��ǥ ����
    protected abstract char getShape(); //�� ��ü�� ����� ��Ÿ���� ����
}

class Bear extends GameObject {
    public Bear(int x, int y, int distance) {//������. �� ������ġ�̴�.
        super(x, y, distance);
    }
    protected void move(int inX, int inY) {//���� 0���� ���������� ��� �����ϰ��  �̵�
        if(!(getX()==0 && inX == -1)) this.x += inX;
        if(!(getY()==0 && inY == -1)) this.y += inY;
    }
    protected char getShape() {return 'B';}
}
class Fish extends GameObject {
    Random rand = new Random();
    int cy=1;
    int randMov;
    public Fish(int x, int y, int distance){
        super(x, y, distance);
    }
    protected void move(int x, int y) {
        if(cy <4){//3���� ������ ����(1,2,3�� ���)
            cy++;
            return;
        }
        else{
            randMov = rand.nextInt(4);
            switch(randMov) {
                case 0:
                    setX(getX() + 1);
                    break;
                case 1:
                    setY(getY() + 1);
                    break;
                case 2:
                    setX(getX() - 1);
                    break;
                case 3:
                    setY(getY() - 1);
                    break;
            }
            if(cy==5){//����� 3��, �̵� 2�� �� 5�� �̵� �Ϸ��
                cy =1;
                return;
            }
            cy++;
        }
    }

    protected char getShape() {return '@';}
}

public class Game {
    int moveX; int moveY;
    //Bear bear;
    //Fish fish;
    char[][] map;
    Game() {run();}

    void showMap(Bear bear, Fish fish) {
        for(int i=0;i<map.length; i++){
            for(int j=0;j<map[i].length;j++) {//�ݺ������� -�� ǥ��+ fish,bear�� ���� ǥ��
                map[i][j] = '-';
                if(i==fish.getY() && j == fish.getX()) map[i][j] = fish.getShape();
                if(i==bear.getY() && j == bear.getX()) map[i][j] = bear.getShape();//if else�� �Ǹ� �Ȱ�����.(������ ���ÿ��� bear�� fish�� ���� ȭ��)
                System.out.print(map[i][j]);//���
            }
            System.out.println();//���ٸ��� ����
        }
    }
    void control(Bear bear, Fish fish) {
        Scanner scanner = new Scanner(System.in);
        String c;
        do{
            System.out.print("����(a), �Ʒ�(s), ��(w), ������(d) >> ");
            c = scanner.next();    
        }while(!converting(c));//��ȯ
        
        bear.move(moveX, moveY);
        fish.move(0,0); //fish�� �Է��� ���ǹ�.
        moveX=0; moveY=0;//����. ���ϸ� ���� ���Ƽ� �̻��ϰ� �̵��Ѵ�.
    }
    boolean converting(String c) {
        if(c.equals("a")){
            moveX = -1;
            return true;
        }
        else if(c.equals("s")){//�ϴٰ� �˰ԵȰǵ� �̰� ���ʺ��� �Ʒ��� Ŀ����.. 
            moveY = 1;
            return true;
        }
        else if(c.equals("w")){
            moveY = -1;
            return true;
        }
        else if(c.equals("d")){
            moveX = 1;
            return true;
        }
        else{
            System.out.println("�߸��Է��ϼ̽��ϴ�.");
            return false;
        }
        
    }
    void run() {
        map = new char[10][20];//����� �Ϲ����� x,y�� ������ �ݴ��.(���� y��, �ڰ� x���� �ȴ�.)
        Bear bear = new Bear(0,0,1);
        Fish fish = new Fish(5, 5, 1);

        System.out.println("** Bear�� Fish �Ա� ������ �����մϴ�.**");

        while(true) {
            showMap(bear, fish);
            if(bear.collide(fish)) {
                System.out.println("Bear Wins");
                break;
            }
            control(bear, fish);
        }
    }
    public static void main(String[] args){
        new Game();
    }
}
