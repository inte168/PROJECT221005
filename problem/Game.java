//5과 openchallenge
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
    protected abstract void move(int inX, int inY);//이동후의 위치로 좌표 변경
    protected abstract char getShape(); //각 객체의 모양을 나타내는 문자
}

class Bear extends GameObject {
    public Bear(int x, int y, int distance) {//생성자. 즉 시작위치이다.
        super(x, y, distance);
    }
    protected void move(int inX, int inY) {//각각 0에서 빠져나가는 경우 제외하고는  이동
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
        if(cy <4){//3번은 가만히 있음(1,2,3인 경우)
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
            if(cy==5){//허공에 3번, 이동 2번 총 5번 이동 완료시
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
            for(int j=0;j<map[i].length;j++) {//반복문으로 -로 표시+ fish,bear는 따로 표시
                map[i][j] = '-';
                if(i==fish.getY() && j == fish.getX()) map[i][j] = fish.getShape();
                if(i==bear.getY() && j == bear.getX()) map[i][j] = bear.getShape();//if else가 되면 안겹쳐짐.(마지막 예시에서 bear가 fish를 먹은 화면)
                System.out.print(map[i][j]);//출력
            }
            System.out.println();//한줄마다 개행
        }
    }
    void control(Bear bear, Fish fish) {
        Scanner scanner = new Scanner(System.in);
        String c;
        do{
            System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
            c = scanner.next();    
        }while(!converting(c));//변환
        
        bear.move(moveX, moveY);
        fish.move(0,0); //fish는 입력이 무의미.
        moveX=0; moveY=0;//리셋. 안하면 값이 남아서 이상하게 이동한다.
    }
    boolean converting(String c) {
        if(c.equals("a")){
            moveX = -1;
            return true;
        }
        else if(c.equals("s")){//하다가 알게된건데 이거 위쪽부터 아래로 커진다.. 
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
            System.out.println("잘못입력하셨습니다.");
            return false;
        }
        
    }
    void run() {
        map = new char[10][20];//참고로 일반적인 x,y와 순서가 반대다.(앞이 y축, 뒤가 x축이 된다.)
        Bear bear = new Bear(0,0,1);
        Fish fish = new Fish(5, 5, 1);

        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");

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
