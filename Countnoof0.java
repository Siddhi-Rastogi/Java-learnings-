public class Countnoof0{
    public static void main(String[] args) {
        // int ans=count(30000);
        // System.out.println(ans);
        System.out.println(recursion(30000));
    }
    static int count(int n){
        int count=0;
        while(n>0){
           int rem = n%10;
        
           if(rem==0){
            count++;
           }
           n=n/10;
        }
        return count;
    }
    static int recursion(int n){
        return helper(n,0);
    }
    static int helper(int n,int  counts){
        if(n==0){
            return counts;
        }
        int rem= n%10;
        if(rem==0){
            return helper(n/10,++counts);
        }
        return helper(n/10,counts);
    }

}