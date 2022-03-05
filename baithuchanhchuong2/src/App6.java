import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        int number, temp = 1;
        long giaiThua = 1;
         
        Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.println("Nhap vao 1 so bat ky: ");
            number = scanner.nextInt();
        } while ((number <= 0) || (number > 10));
         
        /*
         * Neu gia tri bien temp con nho hon hoac bang number
         * thi con thuc hien doan lenh ben trong while
         */
        while (temp <= number) {
            giaiThua *= temp;
            temp++;
        }
         
        System.out.println(number + "! = " + giaiThua);
    }
}