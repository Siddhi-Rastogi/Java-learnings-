public class RotatedBS2D {
    public static void main(String[] args) {
        
    }
    static int[] binarysearch(int[][] matrix, int row, int cstart, int cend, int target){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cstart=mid+1;
            }
            else{
                cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int row=matrix.length;
        int col=matrix[0].length;  //be cautious over here matrix could be empty
        if(row==1){
            return binarysearch(matrix, 0, 0, col-1, target);
        }
        //run the loop till the 2 rows are remianing
         
    }
}
