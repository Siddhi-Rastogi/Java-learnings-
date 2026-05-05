//class level pe function call ka ek or prg after that Constructor.java
class Tempo{
    int x=getx();
    int getx(){
        System.out.println(x);
        return 10;
    }
   Tempo(){
    x=0;
    x=getx();
    System.out.println(x);
   } 
}

public class Classlevel {
    public static void main(String... s){
    Tempo obj= new Tempo();
    }
}
