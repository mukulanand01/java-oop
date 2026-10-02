/*Java Does't Support Multipleinherantace that why we interface in this */

interface A{
    void show();
}
interface B{
    void display();
}


class C implements A , B {
    public void show(){
        System.out.println("Show Method");
    }
    public void display(){
        System.out.println("Dispaly method");
    }
}
public class Multipleinhertance {
    public static void main(String[] args) {

        C c = new C();
        c.show();
        c.display();
        
    }
}
