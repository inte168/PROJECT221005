//5과 1번
package problem;//정리땜시 폴더에 넣어서 들어간다.

class TV {//예시 그대로 TV
    private int size;
    public TV(int size) { this.size = size;}
    protected int getSize() { return size; }
}
class ColorTV extends TV {//상속받은 ColorTV
    private int Color;//위엔 없는 Color
    public ColorTV(int size, int Color) {//생성자
        super(size);
        this.Color = Color;
    }
    public void printProperty() {//출력부. 주어진 양식이 있으니 맞추면 됨.
        System.out.println(super.getSize() + "인치 " + Color + "컬러");
    }
}
public class tvcolor {//예시 그대로 main
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
}
