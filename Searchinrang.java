public class Searchinrang {
    public static void main(String... s){
        int[] arr={18,12,-7,3,14,28};
        int key=-7;
        int start=1;
        int end=4;
        System.out.println(search(arr,key,start,end));
    }
    // static boolean search(int[] arr, int key, int start,int end){
    //     for(int i=start;i<=end;i++){
    //         if(arr[i]==key){
    //             return true;                      //using boolean
    //         }
    //     }
    //     return false;
    // }
    static int search(int[] arr, int key, int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]==key){                                          //using int
                return i;
            }
        }
        return -1;
    }
}
