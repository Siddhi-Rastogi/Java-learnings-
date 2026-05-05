import java.util.Scanner;
public class LinearSearch{
    static int linearSearch(int [] arr, int n, int key){
        if(arr ==null){
            System.out.println("Array is empty");
            return -1;
        }
        for(int i=0;i<n;i++){
            
                if(arr[i]==key){
                    return i;
                }
        }
        return -1;
    }
    public static void main(String... s){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key;
        key=sc.nextInt();
        int result=linearSearch( arr, n, key);
        System.out.println("Element found at index: " + result);
        sc.close();
        // return;
    }
    
}