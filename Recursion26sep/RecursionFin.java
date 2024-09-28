
import java.util.Scanner;
public class RecursionFin {
    static int f(int n){
        if(n<=1){
            return n;
        }
       
        return f(n-1)+f(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.print(f(i)+" ");
        }
    }
}
