// /*It is also used when we want to call the default constructor of its own class */ 

// class A{
//     A(){
//         System.out.println("Hello Anand");
//     }
//     A(int a)
//     {
//         System.out.println(a);
//         this();

//     }
// }
// public class Thisdefualtconstructor {
//     public static void main(String[] args) {
//         A a = new A(10);

        
//     }
// }



/*This is aslo called as parametrised construtor of its own class */ 

class A{
    A(){
        this(10);
    }
    A(int a)
    {
        System.out.println(a);

    }
}
public class Thisdefualtconstructor {
    public static void main(String[] args) {
        A a = new A();

        
    }
}

