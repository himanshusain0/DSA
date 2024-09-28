public class RevArrOptimal {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n = 5;
        reverseArray(arr, n);
    }
    static void  reverseArray(int arr[],int n ){
        int p1=0,p2=n-1;
        while (p1<p2) {
            int temp =  arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;     
        }
        printArray(arr,n);
    }
    static void printArray(int arr[],int n) {
        System.out.println("reverse the array ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
