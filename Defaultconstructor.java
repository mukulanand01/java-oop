class Car{
    int n;
    String name;
    
    Car(){
        n = 12;
        name = "MukulAnand";     // So here we can make deafult constructor to initialize the value  
    }
     void Disp(){
        System.out.println(n + " " + name);
     }

}
public class Defaultconstructor {
    public static void main(String[] args) {

        Car c = new Car();
        c.Disp();
        
    }
    
}
