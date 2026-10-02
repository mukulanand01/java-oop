class A{
    int a;
    String b;

    A(int a, String b){
        this.a =a;
        this.b = b;

    }

    void disp(){
        System.out.println(a+" "+b);
    }
}
public class Thiskeyboard {
    public static void main(String[] args) {
        A a = new A(23, "Anand");

        a.disp();
    }
}
