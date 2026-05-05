public class Demo{
    int instanceDM= 10;

    static int Sdm= 20;


    void InstanceMF(){
        System.out.println("Inside Instance Member function to print instance data member " + instanceDM);

    }
    static void StaticMF(){
        System.out.println("Inside the static meember function directly accessing static data member:" + Sdm);

        // we have to create an object in static member function in order to access instance data member inside 
        // the  Static member function of the same class

        Demo obj = new Demo();
        System.out.println("Accessing instance Data member inside Static member function using obj:" + obj.instanceDM);
        obj.InstanceMF();   //Accessing instance  member function inside Static member function using obj:
    }
    public static void main(String... s) 
    {
        StaticMF();

        // Qki humara main() bhi static hai toh directly isme bhi hum kissi bhi instance vale ko use nhi kr skte, toh isme bhi hume oobject he banana pdega 

        Demo obj2 = new Demo();
        obj2.instanceDM= 01;
        System.out.println(obj2.instanceDM);

        // obj2.InstanceMF();
        
    }
}