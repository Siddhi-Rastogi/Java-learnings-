public class Maxin2d {
  
    public static void main(String... s){
        int[][] arr={{1,2,3},{1,2,18,19},{3,5,6,89}};
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }
    static int max(int[][] arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;

    }
}
