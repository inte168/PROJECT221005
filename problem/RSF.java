//6과 9번
package problem;

import java.util.Scanner;

class Player {
    private String name;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name) {this.name = name;}
    public String getName() {return name;}
    public int turn() {
        System.out.print(name + "[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
        return scanner.nextInt();
    }
}
class Computer extends Player {
    public Computer(String name) {super(name);}
    public int turn() {
        return (int)(Math.random() *3 +1); //1~3
    }

}

public class RSF {
    private final String s[] = {"가위", "바위", "보"};
    private Player [] player = new Player[2];

    public RSF() {
        player[0] = new Player("철수");
        player[1] = new Computer("컴퓨터");
    }

    public void run() {
        int userS, comS;
        while(true) {
            userS = player[0].turn();
            if(userS == 4) break;//4번은 끝내기.
            else if(!(userS>=1 && userS <=3))
                System.out.println("잘못 입력하셨습니다.");
            else{
                comS = player[1].turn();
                //각각의 선택 출력.
                System.out.print(player[0].getName() + "(" + s[userS-1] + ")" + ":");
                System.out.print(player[1].getName() + "(" + s[comS-1] + ")" + ":");
                System.out.print("\n");
                int cases = comS-userS;

                switch(cases) {
                    case 0: //같은 경우
                        System.out.println("비겼습니다.");
                        break;
                    case 1://가위-주먹, 주먹-보
                    case -2://보-가위
                        System.out.println(player[1].getName()+"가 이겼습니다.");
                        break;
                    case -1://주먹-가위, 보-주목
                    case 2://가위-보
                        System.out.println(player[0].getName()+"가 이겼습니다.");
                        break;
                }

            }
            
        }
    }
    public static void main(String[] args) {
        RSF game = new RSF();
        game.run();
    }

}
