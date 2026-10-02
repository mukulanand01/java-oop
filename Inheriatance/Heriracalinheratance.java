/*Herarichal Inheratance */
class A{
    void disp(){
        System.out.println("waht is your name");
    }
}
class B extends A{
    void name(){
        System.out.println("My name is Mukul Anand");
    }
}
class C extends A {
    void name(){
        System.out.println("Hello My name is Raj Anand");
    }
}
public class Heriracalinheratance {
    public static void main(String[] args){
        B b = new B();
        b.disp();
        b.name();
        C c = new C();
        c.disp();
        c.name();

    }
}
