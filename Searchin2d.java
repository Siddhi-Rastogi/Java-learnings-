import java.util.Arrays;

public class Searchin2d {
    public static void main(String... s){
        int[][] arr={{1,2,3},{1,2,18,19},{3,5,6,89}};
        int key=2;
        System.out.println(Arrays.toString(search(arr,key)));
    }
    static int[] search(int[][] arr, int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==key){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
