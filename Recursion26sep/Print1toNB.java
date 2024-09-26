import java.util.Scanner;

public class Print1toNB {
    static  void f(int i , int n ){
        if(i<1){
            return;
        }
        f(i-1,n);
        System.out.print(i+" ");
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        f(n,n);
    }
}
