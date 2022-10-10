//6�� 9��
package problem;

import java.util.Scanner;

class Player {
    private String name;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name) {this.name = name;}
    public String getName() {return name;}
    public int turn() {
        System.out.print(name + "[����(1), ����(2), ��(3), ������(4)]>>");
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
    private final String s[] = {"����", "����", "��"};
    private Player [] player = new Player[2];

    public RSF() {
        player[0] = new Player("ö��");
        player[1] = new Computer("��ǻ��");
    }

    public void run() {
        int userS, comS;
        while(true) {
            userS = player[0].turn();
            if(userS == 4) break;//4���� ������.
            else if(!(userS>=1 && userS <=3))
                System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            else{
                comS = player[1].turn();
                //������ ���� ���.
                System.out.print(player[0].getName() + "(" + s[userS-1] + ")" + ":");
                System.out.print(player[1].getName() + "(" + s[comS-1] + ")" + ":");
                System.out.print("\n");
                int cases = comS-userS;

                switch(cases) {
                    case 0: //���� ���
                        System.out.println("�����ϴ�.");
                        break;
                    case 1://����-�ָ�, �ָ�-��
                    case -2://��-����
                        System.out.println(player[1].getName()+"�� �̰���ϴ�.");
                        break;
                    case -1://�ָ�-����, ��-�ָ�
                    case 2://����-��
                        System.out.println(player[0].getName()+"�� �̰���ϴ�.");
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
