class A{
    int num;
    String name;
    // Parametrised Constructor
     A(int a , String b){
        num = a;
        name = b;
     }
     // Copy Constructor
     A( A ref){
        num = ref.num;
        name = ref.name;
        
     }

     void Disp(){
        System.out.println(num + " " + name);
     }
}
public class Copyconstructor {
    public static void main(String[] args) {
        A a1 = new A(2,"Mukul");
        A a2 = new A(a1);

        a1.Disp();
        a2.Disp();
    }
}
