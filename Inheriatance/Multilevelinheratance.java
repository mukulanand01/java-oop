/*    MultiLevel Inheritance     */
class Super{     // Super Class or Grandparent class
    int a;
    int b;

    void add (){
        a=100;
        b=10;
        System.out.println("Addition of both Number is" + " " + (a+b));
    }

}

class Sub1 extends Super{ // Sub Class or Parent class
        void sub (){
            a=200;
            b=20;
            System.out.println("Subtraction of both Number is " + " " + (a-b));
        }

}

class Sub2 extends Sub1{  // Sub2 claass or child class
    void multiplu(){
        a=10;
        b=5;
        System.out.println("Multipication of two number is " + (a*b));
    }

}
public class Multilevelinheratance {
    public static void main(String[] args) {
        Sub2  s = new Sub2();
        s.add();
        s.sub();
        s.multiplu();

        
    }
}
