class Invocation {
    static void staticMethod(){
        System.out.println("From base static class method..");
    }
    void instanceM(){
        System.out.println("From base instance class method..");

    }
}
class Bee extends Invocation{
    static void staticMethod(){
        System.out.println("From child static class method..");    //ye hide hogya qki static method ovverride nhi hote hide hote h
    }
    @Override
    void instanceM(){                                               
        System.out.println("From child instance class method..");  //ye ovverride ho rha h 

    }

}
public class Main{
    public static void main(String... s) { 
        Invocation obj = new Bee();
        obj.instanceM();
        Invocation.staticMethod();
        Bee.staticMethod();
        // Invocation.instanceM();

        Invocation obj2= new Invocation();
        obj2.instanceM();
    }
}