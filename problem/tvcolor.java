//5�� 1��
package problem;//�������� ������ �־ ����.

class TV {//���� �״�� TV
    private int size;
    public TV(int size) { this.size = size;}
    protected int getSize() { return size; }
}
class ColorTV extends TV {//��ӹ��� ColorTV
    private int Color;//���� ���� Color
    public ColorTV(int size, int Color) {//������
        super(size);
        this.Color = Color;
    }
    public void printProperty() {//��º�. �־��� ����� ������ ���߸� ��.
        System.out.println(super.getSize() + "��ġ " + Color + "�÷�");
    }
}
public class tvcolor {//���� �״�� main
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
}
