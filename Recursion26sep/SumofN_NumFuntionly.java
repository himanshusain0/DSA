import java.util.Scanner;

public class SumofN_NumFuntionly {
    static int f(int n){
        if(n==0){
            return 0;
        }
        return n+f(n-1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();     
        System.out.println("sum of "  + n  + "is :"+ f(n));
        
}
}

