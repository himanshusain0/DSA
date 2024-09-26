import java.util.Scanner;

public class Factorial {
    static int f(int n){
        if(n<=1){
            return n;
        }
        return n*f(n-1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();     
        System.out.println(" factorial is :"+ f(n));
        
}
}
