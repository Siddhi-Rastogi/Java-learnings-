// class InnerAnonymous {
//     void show(){
//         System.out.println("called using anonymous obj");
//     }
    
// }
// public class Anonymous {
//     public static void main(String... s){
//         new InnerAnonymous().show();
//         new InnerAnonymous().show();

//     }
// }



// ...................2nd....................

// class Display {
//     Display() {
//         System.out.println("Constructor called");
//     }
//     void message() {
//         System.out.println("Message displayed");
//     }
// }

// public class Anonymous {
//     public static void main(String[] args) {
//         new Display().message();
//     }
// }

// ...................3rd....................

// class Example {
//     void print(String msg) {
//         System.out.println(msg);
//     }
// }

// public class Anonymous {
//     public static void main(String[] args) {
//         new Example().print("Hello");
//         Example e = new Example();
//         e.print("World");
//     }
// }


// ...................4th....................Call a method that prints your name and age using two anonymous objs
// class Name {
//     void printN(String name){
//         System.out.println(name);
//     }
//     void printA(int age){
//         System.out.println(age);
//     }
    
// }
// public class Anonymous{
//     public static void main(String... s) {
//         new Name().printN("Siddhi");

//         new Name().printA(21);
//         System.out.println(new Name());
//     }
// }

public class Anonymous{
    Anonymous(){
        System.out.println("default");
    }
    void Anonymous(){
        System.out.println("Hello");
    }
    public static void main(String... s){
        new Anonymous().Anonymous();
    }
}
