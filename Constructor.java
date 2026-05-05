 class Mains {
    int marks=setmarks();

    int setmarks(){
        System.out.println("Setmarks() method  called");
        System.out.println(marks);

        return 90;
    }

    Mains(){
        System.out.println("Constructor is called");
    }

}
public class Constructor{
    public static void main(String[] args)
    {
        Mains obj = new Mains();
        System.out.println("Marks="+obj.marks);
    }
//    return 0;
}
