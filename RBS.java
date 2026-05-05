public class RBS{
    public static void main(String... s) {
        int[] arr={3,4,5,6,7,0,1,2};
        int target=6;
        
        System.out.println(search(arr, target));

    }
    static int search(int[] arr, int target){
        int pivot=findpivot(arr);
        //agar humara pivot milta he nhi hai that means ki humari arry sorted hai rotated nhi th hum BS  chla denge

        if(pivot==-1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
       if(arr[pivot]==target){
        return pivot;
       }else if(target>arr[0]){
          return  binarySearch(arr, target, 0, pivot-1);
       }
        return binarySearch(arr, target, pivot+1, arr.length-1);

    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid= start+(end -start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;

    }
    static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        // int pivot=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<= arr[start]){
                end=mid-1;
            }
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            return -1;
        // System.out.println(mid);

        }
        
        return 0;
    }
    
}