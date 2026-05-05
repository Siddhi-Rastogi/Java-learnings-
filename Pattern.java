public class Pattern{
    public static void main(String... s){
        pattern(4);

    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int col=1;col<=n-i+1;col++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}