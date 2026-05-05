//write a Java program with a class Employee that has:

// a parameterized constructor to initialize empId, name, and salary,

// and a method display() to show the data.
// Create 2 employee objects and display their details.

class Employee{
    int empId;
    String name;
    int salary;
    Employee(int e , String n, int sa ){
        empId= e;
        name=n;
        salary= sa;
    }
    void Display(){
        System.out.println("employee Id , name and salary of emplyees  are:"+ empId + " " + name + "  "+ salary );
    }

}
public class Parameterized{
    public static void main(String... s){
        Employee obj1= new Employee(01, "Siddhi", 125000);
        obj1.Display();
        Employee obj2= new Employee(02, "Sambhav", 250000);
        obj2.Display();

    }
}