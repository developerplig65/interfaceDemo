interface vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class bicycle implements vehicle{
    int speed, gear;
    @Override
    public void changeGear(int newGear){
        gear = newGear;
        
    }
    @Override
    public void speedUp(int increment){
        speed = speed+increment;
    }
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    
    public void printStates(){
        System.out.println("Speed: " + speed + " gear: " + gear);
    }
}

class car implements vehicle{
    int speed, gear;
    @Override
    public void changeGear(int newGear){
        gear = newGear;
        
    }
    @Override
    public void speedUp(int increment){
        speed = speed+increment;
    }
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    
    public void printStates(){
        System.out.println("Speed: " + speed + " gear: " + gear);
    }
}

public class interfaceDemo{
    public static void main(String[]args){
        bicycle b= new bicycle();
        b.changeGear(6);
        b.speedUp(80);
        b.applyBrakes(10);
        b.printStates();
        
        car c= new car();
        c.changeGear(6);
        c.speedUp(80);
        c.applyBrakes(10);
        c.printStates();
       
    }
}
