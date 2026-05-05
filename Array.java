import java.util.*;
public class Array {
   public static void main(String... s){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int N= sc.nextInt();
    int arr[] = new int[N];
    for(int i=0; i<N ;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element to be searched");
    int x= sc.nextInt();
    for(int i=0; i<arr.length;i++){
        if(arr[i]== x){
            System.out.println("Element found at index: "+ i);
            break;
        }
        }
    }

   }
