//6-10
public class MathEx {
    public static void main(String[] args) {
        System.out.println(Math.PI);//원주율
        System.out.println(Math.ceil(Math.PI));// 5,6번 줄이 a로 되어있는데, 
        System.out.println(Math.floor(Math.PI)); //a는 선언도 안되어있다. 예제 결과를 보면 아마 위의 Math.PI 였을듯.(여튼 올림/내림)
        System.out.println(Math.sqrt(9));//제곱근
        System.out.println(Math.exp(2));//e의 승
        System.out.println(Math.round(3.14));//반올림.

        System.out.print("이번주 행운의 번호는 ");
        for(int i =0; i<5; i++)
            System.out.print((int)(Math.random()*45+1) + " ");//1~45의 난수 발생.
    }
}
