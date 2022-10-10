//5과 9번
package problem;

import java.util.Scanner;

interface Stack {
    int length();//스택에 저장된 갯수 리턴
    int capacity();//스택의 전체 저장가능한 갯수 리턴
    String pop(); //저장된 실수 리턴(주석이 반대로 된듯. String을 리턴하는 것으로 보임)
    boolean push (String val); //실수 저장.(주석이 반대로 된듯. 문자열을 입력받고 성공/실패 리턴으로 보임)
}

class StringStack implements Stack {
    private int size;
    private int top;
    private String [] StackArray;
    public StringStack(int size) {//생성자
        this.size = size;
        StackArray = new String [size];
        this.top = -1; //여기서는 top이 존재하는 마지막 인덱스 번호로 한다.
    }
    public int length() {
        return top+1;//갯수는 마지막인덱스 번호+1
    }
    public int capacity() {
        return StackArray.length;
    }
    public String pop() {
        String popStr; //pop후 리턴할 배열
        if(top == -1) return null; //stack이 빈 경우 null 리턴

        popStr = StackArray[top--];//top의 값을 가져오고 top 감소
        return popStr;
    }
    public boolean push(String val) {
        if(top+1 <size) {//top의 다음값이 size보다 작은 경우(즉 여분 칸이 있으면)
            StackArray[++top] = val;//top을 늘리고 그 칸에 val을 집어넣는다.
            return true;//성공함을 리턴
        }
        else return false;
    }
}

public class StackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장공간 크기 >>");
        int size = scanner.nextInt();
        StringStack Stack = new StringStack(size);

        while(true) {//size가 유한하나 그만으로 중단이 가능+꽉 차도 중단X 이므로 while문.
            System.out.print("문자열 입력>> ");
            String val = scanner.next();
            if(val.equals("그만")) break; //중단조건
            if(!Stack.push(val)) System.out.println("스택이 꽉 차서 푸시 불가!");
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        for(int i =0; i<Stack.capacity(); i++) { //갯수를 구할 수 있으므로 for문 사용이 편리
            System.out.print(Stack.pop() + " ");
        scanner.close();
        }
    }
}
