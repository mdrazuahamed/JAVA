package com.company;
interface Bicycle_{
    void applyBrake(int dec_speed);
    void speedUp(int inc_speed);
}
interface Car_ {
    void applyBrake_Car();

    void speedUp_Car();
    private void use_In_Default(){
        System.out.println("In private method");
    }
    default void use_Private_Method(){
        use_In_Default();
    }
}
class Inherite {

    public void print_(){
        System.out.println("Inherited with implementation");
    }
}
class Motor_Cycle_ extends Inherite implements Bicycle_,Car_{
    void blowHorn (){
        System.out.println("Peep peep");
    }
    public void applyBrake(int dec_speed){
        System.out.println("Decrement speed");
    }
    public void speedUp(int inc_speed){
        System.out.println("Increment speed");
    }
    public void applyBrake_Car(){
        System.out.println("Car decrease speed");
    }
    public void speedUp_Car(){
        System.out.println("Car increase speed");

    }
}
public class interface_inheritance {


    public static void main(String[] args) {
        Motor_Cycle_ mc = new Motor_Cycle_();
        mc.applyBrake(1);
        mc.speedUp_Car();
        mc.print_();
        mc.use_Private_Method();
    }
}
