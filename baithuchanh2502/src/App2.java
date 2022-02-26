import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
		double a = 13.201, b = 16.124, c = 15.151;

		if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("Day la tam giac !");
		}
		if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Day la tam giac can !");
		} else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("Day la tam giac deu !");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("Day la tam giac vuong !");
		} else {
			System.out.println("Day khong phai tam giac");
		}
	}
}