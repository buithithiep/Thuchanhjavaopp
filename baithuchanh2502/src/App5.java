import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, a;
        System.out.println("\n\nNhap vao so can kiem  tra: ");
        a = sc.nextInt();
        for(int i=1;i<=a/2;i++){
            if(a%i==0) 
              //tổng các ước số của a
              sum+=i;
        }
        if(sum==a){
            System.out.println(a + " la so hoan thien");
        }
        else {
            System.out.println(a + " khong phai la so hoan thien");
        }
    }
}
