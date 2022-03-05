import java.text.DecimalFormat;
import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner sc = new Scanner(System.in);
         
        // lam tron den 2 chu so thap phan
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
         
        System.out.println("Nhap vao so cac so nguyen co trong day: ");
        n = sc.nextInt();
         
        /*
         * bat dau duyet tu bien dem count = 1 
         * nếu count con <= n thi nhap vao so number thu count
         * sau do cong gia tri cua bien number vao bien sum
         * vong lap dung khi bien dem count > n.
         */
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhap so thu " + count + ": ");
            number = sc.nextInt();
            sum += number;
        }
         
        avgNumber = (float) sum / n;
        System.out.println("Trung binh cong = " + decimalFormat.format(avgNumber));
    }
}