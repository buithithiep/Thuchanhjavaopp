import java.util.HashSet;
import java.util.Scanner;
public class App54 {
    public static void main(String[] args ) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        System.out.println("Các phần tử trong hashSetString: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhập phân tử cần xóa: ");
        number = scanner.nextInt();
        if (hashSetInteger.contains(number)) {
            hashSetInteger.remove(number);
            System.out.println("Xóa thành công: ");
            System.out.println("Các phần tử còn lại trong hashSetString: ");
            System.out.println(hashSetInteger);
        } else{
            System.out.println("Xóa không thành công: ");      
       }
      }
    }