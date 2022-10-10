//5과 11번
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
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char op = scanner.next().charAt(0);//그냥 scanner.next()는 문자열이라 문자로 바꿔줌.

        switch(op) {
            //받아오고, 값 입력, 계산결과 출력
            case '+'://더하기 연산
                Add cala = new Add();
                cala.setValue(a, b);
                System.out.println(cala.calculate());
                break;
            case '-'://빼기 연산
                Sub cals = new Sub();
                cals.setValue(a, b);
                System.out.println(cals.calculate());
                break;
            case '*'://곱하기 연산
                Mul calm = new Mul();
                calm.setValue(a, b);
                System.out.println(calm.calculate());
                break;
            case '/'://나누기 연산
                Div cald = new Div();
                cald.setValue(a, b);
                System.out.println(cald.calculate());
                break;
        }
        scanner.close();
    }
}
