package com.company;

interface Bicycle{
    int r = 20;
    void applyBrake(int dec_speed);
    void speedUp(int inc_speed);
}
interface Car{
    void applyBrake_Car();
    void speedUp_Car();
}
class Motor_Cycle implements Bicycle,Car{
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
public class Interface_exmple {
    public static void main(String[] args) {
        Motor_Cycle mc = new Motor_Cycle();
        mc.applyBrake(1);
        mc.speedUp_Car();
    }
}
