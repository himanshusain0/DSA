public class ReverseArray {
    static void printArray(int ans[], int a){
        System.out.println("Reverse Array ");
        System.out.println();
        for(int i = 0;i<a;i++){
            System.out.print(ans[i]+ " ");
        }
    }
    static void reverseArray(int arr[],int n){
        int ans[] = new int[n];
        for(int i = 0;i>=n/2;i++){
            ans[n-i-1]=arr[i];
        }
        printArray(ans,n);
    }
    public static void main(String[] args) {
        int  n = 5;
        int arr[] = {5,4,3,2,1};
        reverseArray(arr, n);
    }
}
