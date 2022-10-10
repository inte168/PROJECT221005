//6-5
public class WrapperEx {
    public static void main(String[] args) {
        System.out.println(Character.toLowerCase('A')); //'A'�� �ҹ��ڷ� ��ȯ.(���߿� ���翡�� ����.)
        char c1='4', c2='F';
        if(Character.isDigit(c1))
            System.out.println(c1 + "�� ����");
        if(Character.isAlphabetic(c2))
            System.out.println(c2 + "�� ������");
        
        System.out.println(Integer.parseInt("-123"));//10���� ��ȯ
        System.out.println(Integer.toHexString(28));//16���� ���ڿ��� ��ȯ
        System.out.println(Integer.toBinaryString(28));//2���� ���ڿ��� ��ȯ
        System.out.println(Integer.bitCount(28));//2�������� 1�� ����

        Double d = Double.valueOf(3.14);
        System.out.println(d.toString());//���ڿ��� ��ȯ
        System.out.println(Double.parseDouble("3.14"));//���ڿ��� �Ǽ��� ��ȯ.

        boolean b = (4>3);
        System.out.println(Boolean.toString(b));//���ڿ� "true"�� ��ȯ
        System.out.println(Boolean.parseBoolean("false"));//���ڿ��� false�� ��ȯ.
    }
}