
import java.util.Scanner;

public class SunOfN_Number {
    static  void f(int i,int sum){
        if(i<1)
        {
             System.out.println("sum is : "+sum);
            return   ;
        }
        f(i-1,sum+i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();     
        f(n,0);
        
    }
}
