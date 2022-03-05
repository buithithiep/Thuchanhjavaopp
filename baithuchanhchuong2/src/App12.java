import java.util.Scanner;
public class App12 {
    public static void main(String[] args) {
        // khai bao so dong va so cot cua ma tran
        int m, n;
             
        Scanner sc = new Scanner(System.in);
             
        System.out.println("Nhap vao so dong cua ma tran: ");
        m = sc.nextInt();
        System.out.println("Nhap vao so cot cua ma tran: ");
        n = sc.nextInt();
             
        // khai bao ma tran A có m dong, n cot
        int A[][] = new int[m][n];
             
        System.out.println("Nhap ca phan tu cho ma tran: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
             
        // tim ohan tu co gia tri lon nhat trong ma tran
        // gia su phan tu tai vi tri (0,0) la phan tu lon nhat
        int max = A[0][0];
             
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
             
        System.out.println("Phan tu lon nhat tronh ma tran = " + max);
    }
}
