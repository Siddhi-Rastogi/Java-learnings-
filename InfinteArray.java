public class InfinteArray {
    public static void main(String... s){
        int[] arr={1,2,3,5,6,7,10,14,15,18,20,29,30,31,35,38,71,75,76,76,769,5158};
        int target=15;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            //size of chunks yani kitne elements move krna hai
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return(binarysearch(arr,target,start,end));
    }
    static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end - start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
