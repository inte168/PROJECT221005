package problem;

import java.util.Scanner;

public class Hist {
    static int alpha[] = new int[26];
    static String readString(){
        StringBuffer buffer = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String str = scanner.nextLine();//줄 단위로 읽음
            if(str.equals(";")) break;
            buffer.append(str); //buffer에 str을 누적
        }
        scanner.close();
        return buffer.toString();
    }
    static void Alphacount(){
        
        String read = readString();
        for(int i =0;i<read.length();i++){
            if(read.charAt(i)>='a' && read.charAt(i)<='z') alpha[(int)(read.charAt(i)-'a')]++;
            else if(read.charAt(i)>='A' && read.charAt(i)<='Z') alpha[(int)(read.charAt(i)-'A')]++;
        }
    }
    public static void main(String[] args) {
        Alphacount();
        //출력부
        for(int i='A'; i<='Z'; i++){
            System.out.print((char)(i));
            for(int j=0;j<alpha[i-65];j++) System.out.print("-");
            System.out.println();
        }
    }
}
