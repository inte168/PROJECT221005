//6�� 11��
package problem;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); //���� ���� �Է�
        StringBuffer buffer = new StringBuffer(str);

        while(true) {
            System.out.print("���: ");
            String inp = scanner.nextLine(); //�� ������ ���ڿ��� �д´�.
            if(inp.equals("�׸�")) {//�׸��� �ԷµǸ� ����
                System.out.print("�����մϴ�.");
                break;
            }
            String [] tokens = inp.split("!");//!�� �������� �и��ؼ�
            if(tokens.length !=2) System.out.println("�߸��� ����Դϴ�!");//�� �ڷ� �� 2���� �ƴϸ� �߸��� ���
            else {
                if(tokens[0].length() == 0 || tokens[1].length()==0) {//�� �� ��� �� �ϳ��� ��� �߸��� ���
                    System.out.println("�߸��� ����Դϴ�.");
                    continue;
                }

                int index = buffer.indexOf(tokens[0]);//buffer���� token[0]�� Ž��
                if(index == -1){//ã�� ���� ���
                    System.out.println("ã�� �� �����ϴ�!");
                    continue;
                }
                buffer.replace(index, index+tokens[0].length(), tokens[1]);//index���� token[0]�� ���̸�ŭ�� ������ tokens[1]�� ��ü.
                System.out.println(buffer.toString());
            }
        }
        scanner.close();
    }
}
