public class ReverseSB{
    public static void main(String... s){
        
        StringBuilder sb=new StringBuilder("Siddhi");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-i-1;
            char frontchr=sb.charAt(front);
            char lastchar=sb.charAt(back);
            sb.setCharAt(front,lastchar);
            sb.setCharAt(back,frontchr);
        // sb.reverse();

    }
    System.out.println(sb);

    }
}