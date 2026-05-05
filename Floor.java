public class Floor{
    public static void main(String... s){
        int []  nums={1,2,4,6,8,10,12,14,16,18,20};
        int target=0;
        System.out.println("Floor element index is:  "+ floor(nums,target));
    }
    static int floor(int [] nums, int target){
        int start=0;
        int end=nums.length-1;
        if(target<nums[0]){
            return -1;
        }
        while(start<=end){
            int  mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
}