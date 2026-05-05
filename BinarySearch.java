public class BinarySearch {
    public static void main(String... s){
        int[] nums={-1,0,2,5,8,89,95,585,763};
        int target=89;
        System.out.println("Element found at index:  "+ binarysearch(nums,target));
    }
    static int binarysearch(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
