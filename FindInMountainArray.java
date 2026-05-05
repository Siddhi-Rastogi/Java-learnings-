public class FindInMountainArray {
    public static void main(String... s){
        int[] arr={0,1,2,4,2,1};
        int target=3;
        System.out.println(findInMountainArray(arr,target));

    }
    static int findInMountainArray(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int min=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target==arr[mid]){
                min=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return min;
    }
}
