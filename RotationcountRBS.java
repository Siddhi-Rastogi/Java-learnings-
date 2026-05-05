public class RotationcountRBS {
    public static void main(String... s){
        int[] arr={3,4,5,6,7,8,1,2};
        System.out.println(countRotation(arr));

    }
    static int countRotation(int[] arr){
        int pivot=findpivot(arr);
        int result= pivot+1;
       return result;

    }
     
    static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
             if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end=mid-1;
            }
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }

}
