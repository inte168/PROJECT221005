//5�� 9��
package problem;

import java.util.Scanner;

interface Stack {
    int length();//���ÿ� ����� ���� ����
    int capacity();//������ ��ü ���尡���� ���� ����
    String pop(); //����� �Ǽ� ����(�ּ��� �ݴ�� �ȵ�. String�� �����ϴ� ������ ����)
    boolean push (String val); //�Ǽ� ����.(�ּ��� �ݴ�� �ȵ�. ���ڿ��� �Է¹ް� ����/���� �������� ����)
}

class StringStack implements Stack {
    private int size;
    private int top;
    private String [] StackArray;
    public StringStack(int size) {//������
        this.size = size;
        StackArray = new String [size];
        this.top = -1; //���⼭�� top�� �����ϴ� ������ �ε��� ��ȣ�� �Ѵ�.
    }
    public int length() {
        return top+1;//������ �������ε��� ��ȣ+1
    }
    public int capacity() {
        return StackArray.length;
    }
    public String pop() {
        String popStr; //pop�� ������ �迭
        if(top == -1) return null; //stack�� �� ��� null ����

        popStr = StackArray[top--];//top�� ���� �������� top ����
        return popStr;
    }
    public boolean push(String val) {
        if(top+1 <size) {//top�� �������� size���� ���� ���(�� ���� ĭ�� ������)
            StackArray[++top] = val;//top�� �ø��� �� ĭ�� val�� ����ִ´�.
            return true;//�������� ����
        }
        else return false;
    }
}

public class StackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�� ���� ������� ũ�� >>");
        int size = scanner.nextInt();
        StringStack Stack = new StringStack(size);

        while(true) {//size�� �����ϳ� �׸����� �ߴ��� ����+�� ���� �ߴ�X �̹Ƿ� while��.
            System.out.print("���ڿ� �Է�>> ");
            String val = scanner.next();
            if(val.equals("�׸�")) break; //�ߴ�����
            if(!Stack.push(val)) System.out.println("������ �� ���� Ǫ�� �Ұ�!");
        }

        System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
        for(int i =0; i<Stack.capacity(); i++) { //������ ���� �� �����Ƿ� for�� ����� ��
            System.out.print(Stack.pop() + " ");
        scanner.close();
        }
    }
}
