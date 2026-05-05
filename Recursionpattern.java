import java.util.*;
public class Recursionpattern{

// ****
// ***
// **
// *
    public static void main(String[] args) {
        int[] arr={2,5,6,3,4};
        // triangle(4, 0);
        // triangle2(4, 0);
        //  bubblesort(arr, arr.length-1, 0); 
         selectionsort(arr, arr.length-1, 0, 0);
         System.out.println(Arrays.toString(arr));

    }
    static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r, c+1);
        }else{
            System.out.println();
            triangle(r-1, 0);
        }
    }
// *
// **
// ***
// ****
    static void triangle2(int r, int c){
         if(r==0){
            return;
        }
        if(c<r){
            triangle2(r, c+1);
            System.out.print("*");
        }else{
            triangle2(r-1, 0);
            System.out.println();
        }
    }
    static void bubblesort(int[] arr, int row, int col){
        if(row==0){
            return;
        }
        if(row>col){
        if(arr[col]>arr[col+1]){
            //swap
            int temp=arr[col];
            arr[col]=arr[col+1];
            arr[col+1]=temp;
        }
        bubblesort(arr,row,col+1);
     } else{
            bubblesort(arr,row-1,0);
        }
    }
    static void selectionsort(int[] arr, int row, int col, int max){
        if(row==0){
            return; 
        }
        
        
        if(col<row){
           if(arr[col]>arr[max]){
            selectionsort(arr, row, col+1, col);

        }else{
            selectionsort(arr, row, col+1, max);
        }
        }
        else{ 
            int temp=arr[max];
           arr[max]= arr[row-1];
            arr[row-1]=temp;
            selectionsort(arr, row-1, 0, 0);
                                             
        }
    }
}


