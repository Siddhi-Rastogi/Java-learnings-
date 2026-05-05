public class OrderAgnousticBS {
    public static void main(String... s){
        int[] nums={1,3,5,7,9,11,13,15,17,19,21};
        int target=7;
        System.out.println("Element found at index:  "+ orderAgnousticBS(nums,target));
    }
    static int orderAgnousticBS(int[] nums, int target){
        int s=0;
        int e=nums.length-1;
        boolean isAsc;
        if(nums[s]<nums[e]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }
        if(isAsc){
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[mid]>target){
                    e=mid-1;
                }else if(nums[mid]<target){
                    s=mid+1;
                }
                else if(nums[mid]==target){
                    return mid;
                }else{
                    return -1;
                }
            }
        }
        else{
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[mid]>target){
                    s=mid+1;
                }else if(nums[mid]<target){
                    e=mid-1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
