
class Super{
    int rollno ;
    String name;            // Super class * Parent class
    double marks;

    void Disp (){
        System.out.println("Printing Supar Class");
    }

}
class Sub extends Super {   // Sub Class  * child class
    
    void input(){
    rollno = 2330155;
    name = "MukulAnand";
    marks = 8.2;
    System.out.println(rollno + " " + name + " " + marks);
}
}
public class Simpleinhertance {
    public static void main(String[] args) {

        Sub s = new Sub();
        s.Disp();
        s.input();
       
    }
    
}

