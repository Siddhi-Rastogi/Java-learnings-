public class Countevendigits {
    public static void main(String... s) {
        int[] nums={12,345,2,6,7896,64545,586,65,85,9654,745632};
        System.out.println(findNumbers(nums));        
    }
    static   int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numsofdigit= counteven(num);
        if(numsofdigit %2==0){
            return true;
        }
        return false;
    }
    static int counteven(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
