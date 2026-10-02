/*Super Keywoard */
// Varaible and dispaly

class A{ // Super Class
    int a = 100;
    void disp(){
        System.out.println("Hello World");
     
        System.out.println(a);
    }
}

class B extends A{
   int a = 200;
    void disp(){
        super.disp();
          System.out.println(" Hello Anand");
        System.out.println(a);
          System.out.println(super.a);

    }

}
public class Superkeyboard {
    public static void main(String[] args) {

        B b = new B();
        b.disp();
        
    }
}


/*Through constructor */
// class A {

//     A() {
//         System.out.println("Parent constructor");
//     }
// }

// class B extends A {

//     B() {
//         super();
//         System.out.println("Child constructor");
//     }
// }

// public class Superkeyboard {
//     public static void main(String[] args) {

//         B b = new B();
      
        
//     }
// }



