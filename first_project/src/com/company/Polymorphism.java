package com.company;
interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void recordFourKVideo(){
        System.out.println("Recording 4k Video");
    }
}
interface MyWifi{
    public String [] getNetwork();
    public void connectToNetwork(String network);
}
class MyCellPhone{
    public void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    public void pickCall(){
        System.out.println("Connecting....mcp");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
    public void iAmMySmartPhoneMethod(){
        System.out.println("I Am My SmartPhone's Method");
    }
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    @Override
    public String [] getNetwork(){
        System.out.println("Getting list of network");
        String [] networklist = {"Harry","Prashanth","Anjali5G"};
        return networklist;

    }
    public void connectToNetwork(String network){
        System.out.println("Connecting :"+network);
    }
    public void pickCall(){
        System.out.println("Connecting....");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MyCamera cam1 = new MySmartPhone();
        cam1.takeSnap();
        MySmartPhone msp = new MySmartPhone();
        msp.callNumber(01762700100);
        msp.recordVideo();
        msp.recordFourKVideo();

    }
}

