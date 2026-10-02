class A{
   static  int a;

   static {
     System.out.println("Static Blocked is exectuted");
   }

    {
        // Instance Bloack
        a=10;
        System.out.println("Instance block is excuated");
    }

    void Disp (){
        System.out.println("Hello World");
    }
}
public class Instanceblock {
    public static void main(String[] args) {

        A a1 = new A();
        a1.Disp();
        

        A a2 = new A();
        a2.Disp();
    }
}
