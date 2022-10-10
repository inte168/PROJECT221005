//6과 7번
package problem;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String str = scanner.nextLine();
            if(str.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            //이 부분은 1) StringTokenizer 클래스 이용
            StringTokenizer tok = new StringTokenizer(str, " ");
            int num = tok.countTokens();
            /*
            //이 부분은 2) String 클래스의 split() 메소드 이용
            String [] word = str.split(" ");
            int num = word.length;
             */
            System.out.println("어절 개수는 " + num);
        }
        scanner.close();
    }
}
