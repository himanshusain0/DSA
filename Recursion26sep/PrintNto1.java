import java.util.Scanner;

public class PrintNto1 {
    static void f(int i , int n){
        if(i<1){
            return;
        }
        System.out.print(i+" ");

        f(i-1,n);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        f(n,n);
    }
}
