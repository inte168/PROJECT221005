//6-10
public class MathEx {
    public static void main(String[] args) {
        System.out.println(Math.PI);//������
        System.out.println(Math.ceil(Math.PI));// 5,6�� ���� a�� �Ǿ��ִµ�, 
        System.out.println(Math.floor(Math.PI)); //a�� ���� �ȵǾ��ִ�. ���� ����� ���� �Ƹ� ���� Math.PI ������.(��ư �ø�/����)
        System.out.println(Math.sqrt(9));//������
        System.out.println(Math.exp(2));//e�� ��
        System.out.println(Math.round(3.14));//�ݿø�.

        System.out.print("�̹��� ����� ��ȣ�� ");
        for(int i =0; i<5; i++)
            System.out.print((int)(Math.random()*45+1) + " ");//1~45�� ���� �߻�.
    }
}
