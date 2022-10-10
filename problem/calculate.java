//5�� 11��
package problem;

import java.util.Scanner;

abstract class Calc {
    protected int a;
    protected int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract int calculate();
}

class Add extends Calc{
    public int calculate() {
        return a+b;
    }
}
class Sub extends Calc{
    public int calculate() {
        return a-b;
    }
}
class Mul extends Calc{
    public int calculate() {
        return a*b;
    }
}
class Div extends Calc{
    public int calculate() {
        return a/b;
    }
}

public class calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char op = scanner.next().charAt(0);//�׳� scanner.next()�� ���ڿ��̶� ���ڷ� �ٲ���.

        switch(op) {
            //�޾ƿ���, �� �Է�, ����� ���
            case '+'://���ϱ� ����
                Add cala = new Add();
                cala.setValue(a, b);
                System.out.println(cala.calculate());
                break;
            case '-'://���� ����
                Sub cals = new Sub();
                cals.setValue(a, b);
                System.out.println(cals.calculate());
                break;
            case '*'://���ϱ� ����
                Mul calm = new Mul();
                calm.setValue(a, b);
                System.out.println(calm.calculate());
                break;
            case '/'://������ ����
                Div cald = new Div();
                cald.setValue(a, b);
                System.out.println(cald.calculate());
                break;
        }
        scanner.close();
    }
}
