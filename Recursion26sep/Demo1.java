package Recursion26sep;

import java.util.Scanner;

public class Demo1 {
     static void  f(int i , int n){
        if(i>n){
            return ;
        }
        System.out.println(i+0);
        f(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(1,n);
    }
}
