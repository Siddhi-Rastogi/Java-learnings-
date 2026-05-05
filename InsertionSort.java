import java.util.*;
public class InsertionSort{
    public static void printArr(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String... s) {
        int nums[] = {5, 1, 4, 2, 8};
        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j] <nums[j-1]){
                    int temp= nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]= temp;
                }
                else{
                    break;
                }
            }
        }
        printArr(nums);
}
}