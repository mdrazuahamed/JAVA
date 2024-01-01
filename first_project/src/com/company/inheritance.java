package com.company;
    class Base{
        Base(){
            System.out.println("I am base class constructor");
        }
        public Base(int x, int y){
            System.out.println("Value of x = "+x);

        }
        public int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }
    class Drived extends Base{
        int a;
        int b;
        Drived(){
            super(0,0);
            System.out.println("I am drived class constructor");
        }

    }
public class inheritance {
    public static void main(String[] args) {
        Drived d_handle = new Drived();
        Base b_handle   =new Base(2,3);

    }
}
