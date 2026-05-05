public class FindUnique{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,1,2,3,4,5};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){ 
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique = unique^arr[i];
        }
        return unique;
    }
}