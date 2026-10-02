class A{
    int a;
    double b;
    String c;

    A(){
        a = 10; b = 45.6; c = "Capgemini";
    }

    A(int n , String t){
        a=n;
        c=t;

    }

    A(double d){
        b=d;

    }

    void Disp(){
        System.out.println(a + " " + b + c);
    }
}
public class Constroctoroveloading {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A(5, "RajAnand");
        A a3 = new A(34.5);

        a1.Disp();
        a2.Disp();
        a3.Disp();
        
    }    
}
