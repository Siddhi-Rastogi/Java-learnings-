public class FirstandLast {
    public static void main(String... s){
        int[] nums={1,2,2,3,3,3,4,4,5};
        int target=3;
        int[] result=searchinrange(nums, target);
        System.out.println(Arrays.toString(result));
    //    System.out.println(firstoccurence(nums, target));
    //    System.out.println(lastoccurence(nums, target));
       
      

}
static int[] searchinrange(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = firstoccurence(nums, target);
        ans[1] = lastoccurence(nums, target);
        return ans;
}

static int firstoccurence(int[] nums, int target){
    int start=0;
    int end=nums.length-1;
    int first=-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]<target){
            start=mid+1;
        }else if(nums[mid]==target){
            first=mid;
            end=mid-1;
        }
        else{
            end=mid-1;
        }

    }
    return first ;
}
static int lastoccurence(int[]nums, int target){
    int start=0;
    int end=nums.length-1;
    int last = -1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]<target){
            start=mid+1;
        }else if(nums[mid]==target){
            last=mid;
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        
    }
    return last;
    }
}

