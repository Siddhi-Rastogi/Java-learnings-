public class RBSusingRecursion {
    public static void main(String... s){
        int[] arr={5,6,7,8,9,1,2,3,4};
        int target=5;
       System.out.println( rBS(arr, target, 0, arr.length-1));
    }
    static int rBS(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(arr[start]<=arr[mid]){
        if(target>=arr[start] && target<=arr[mid]){
            // end=mid-1;
            return rBS(arr, target,start,mid-1);
        }
        else{
            // start=mid+1;
           return  rBS(arr, target, mid+1, end);
        }
    }
        if(target>=arr[mid] && target<=arr[end]){
            // start=mid+1;
            return rBS(arr, target, mid+1, end);
        }
            // end=mid-1;
        
           return rBS(arr, target, start, mid-1);
    }
}
