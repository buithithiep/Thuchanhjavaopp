import java.util.Scanner;
public class App90 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner sc = new Scanner(System.in);
             
        System.out.println("Nhap vao chuoi bat ky: ");
        chuoi = sc.nextLine();
             
        System.out.println("Cac ky tu co trong chuoi la: ");
        for (int i = 0; i < chuoi.length(); i++) {
            // tra ve ky tu tai vi tri thu i trong chuoi
            // va gan vao cho bien kyTu
            // i chay tu 0 den vi tri do dai cua chuoi - 1
            kyTu = chuoi.charAt(i);
                 
            System.out.println(kyTu);
        }
    }
}
