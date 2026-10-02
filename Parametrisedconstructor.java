// parametrsied constructor


class Car{
    int num;
    String name;

    Car(int a, String b){

        this.num= a;
        this.name = b;
        
    }

    void Disp(){
        System.out.println(num+ " " + name);
    }
}
public class Parametrisedconstructor {
    public static void main(String[] args) {

        Car c = new Car(7 , "Anand");
        c.Disp();
        
    }
}
