//6�� 7��
package problem;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String str = scanner.nextLine();
            if(str.equals("�׸�")) {
                System.out.println("�����մϴ�...");
                break;
            }
            //�� �κ��� 1) StringTokenizer Ŭ���� �̿�
            StringTokenizer tok = new StringTokenizer(str, " ");
            int num = tok.countTokens();
            /*
            //�� �κ��� 2) String Ŭ������ split() �޼ҵ� �̿�
            String [] word = str.split(" ");
            int num = word.length;
             */
            System.out.println("���� ������ " + num);
        }
        scanner.close();
    }
}
