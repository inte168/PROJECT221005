//6과 11번
package problem;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); //라인 단위 입력
        StringBuffer buffer = new StringBuffer(str);

        while(true) {
            System.out.print("명령: ");
            String inp = scanner.nextLine(); //한 라인을 문자열로 읽는다.
            if(inp.equals("그만")) {//그만이 입력되면 종료
                System.out.print("종료합니다.");
                break;
            }
            String [] tokens = inp.split("!");//!를 기준으로 분리해서
            if(tokens.length !=2) System.out.println("잘못된 명령입니다!");//앞 뒤로 총 2개가 아니면 잘못된 명령
            else {
                if(tokens[0].length() == 0 || tokens[1].length()==0) {//앞 뒤 명령 중 하나가 없어도 잘못된 명령
                    System.out.println("잘못된 명령입니다.");
                    continue;
                }

                int index = buffer.indexOf(tokens[0]);//buffer에서 token[0]를 탐색
                if(index == -1){//찾지 못한 경우
                    System.out.println("찾을 수 없습니다!");
                    continue;
                }
                buffer.replace(index, index+tokens[0].length(), tokens[1]);//index에서 token[0]의 길이만큼에 값들을 tokens[1]로 교체.
                System.out.println(buffer.toString());
            }
        }
        scanner.close();
    }
}
