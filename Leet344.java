import java.lang.*;
import java.io.*;
public class Leet344 {
    public static void main(String... s){
        char[] arr= {'h','e','l','l','o'};
       reverse(arr,0,arr.length-1);
        System.out.println(arr);
    }
    static  void reverse(char[] arr, int i, int j){
        if(i>=j){
            return ;
        }
        
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        
        reverse(arr,i+1,j-1);
    }
}
