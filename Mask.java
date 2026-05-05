public class Mask {
    public static void main(String[] args) {
        int num=0b11001001;
        int i=3;
        System.out.println(findithno(num, i));
    }
    static int findithno(int num, int i){
        // return (num & (1<<i));
        return (1<<i)&num;
     
    }
}
