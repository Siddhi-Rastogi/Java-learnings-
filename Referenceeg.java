public class Referenceeg {
    int value;


    public static void main(String... s){

        Referenceeg obj = new Referenceeg();
        obj.value= 10;

        Referenceeg obj2 = obj;

        System.out.println("value of the  refrence variable holding obj is:" + obj.value);
        System.out.println("value of the  refrerence variable obj2 is:" + obj2.value);


        obj2.value=50;
        

        System.out.println("\nAfter changing the value of only a single object not both\n");

        System.out.println("value of the  refrence variable holding obj is:" + obj.value);
        System.out.println("value of the  refrence variable holding obj2 is:" + obj.value);
        

    }

}
