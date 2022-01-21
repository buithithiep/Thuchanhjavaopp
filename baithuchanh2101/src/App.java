import java.util.Scanner;
public class App {
public static double nhap () {
double n=0;
Scanner sc= new Scanner(System.in);
n=sc.nextDouble();
return n;
}

public static double bac1 (double a, double b) {
double da=(-b)/a;
return da;
}
public static void bac2 (double a, double b, double c) {
double delta;
delta=Math.pow(b, 2)-(4*a*c);
//double kq=(-c)/b;
if (a==0) {
if (b==0) {
if (c==0)
System.out.println("Phuong trinh co vo so nghiem!");
else
System.out.println("Phuong trinh vo nghiem!");
}
else
System.out.println("Phuong trinh co 1 nghiem la : x = "+ -c/b);
}
else {
if (delta<0)
System.out.println("Phuong trinh vo nghiem");
else if (delta==0)
System.out.println("Phuong trinh co nghiem kep: x = "+(-b)/(2*a));
else if (delta>0)
System.out.println("Phuong trinh co nghiem la:\nx1= "+(-b+Math.sqrt(delta)/(2*a))+"\nx2 = "+(-b-Math.sqrt(delta)/(2*a)));
}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
double a, b, c;
System.out.println("Nhap he so a: ");
a= nhap ();
System.out.println("Nhap he so b: ");
b= nhap ();
System.out.println("Nhap he so c: ");
c= nhap ();
System.out.println("Giai phuong trinh bac 1:"+bac1(a,b));
System.out.println("Giai phuong trinh bac 2: ");
bac2(a,b,c);

}

}