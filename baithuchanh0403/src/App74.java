import java.util.Scanner;

public class App74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Nhap vao do dai cua mang:");
        n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu a[" + i + "]:");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                sum += a[i];
        }
        System.out.print("tong cac so chan trong mang la:" + sum);
    }
}
