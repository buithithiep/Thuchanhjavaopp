package Shapes;
import java.util.Scanner;
public class HinhTron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;
    public void nhapbankinh() {
        System.out.print("Nhap ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
    public void tinhchuvi() {
        cv = 2 * PI * r;
    }
    public void tinhdientich() {
        dt = PI * r * r;
    }
    public void inchuvi() {
        System.out.println("Chu vi hinh tron = " + cv);
    }
    public void indientich() {
        System.out.println("Dien tich hinh tron = " + dt);
    }
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
    }
}
