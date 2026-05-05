public class Secondmax {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,4,6,8,9};
       int res= second(nums);
        System.out.println(res);
    }
    static int second(int[] nums){
    int max= Integer.MIN_VALUE;
    int secondmax= Integer.MIN_VALUE;
    // int max= Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            secondmax=max;
            max=nums[i];
        }
        else if(nums[i]>secondmax && nums[i]!=max){
             secondmax=nums[i];
        }
       
        
        
    }
    return secondmax;
    
}
    
}
