package oops;

abstract class animal{
    abstract void walk();
    public void run(){
        System.out.println("then can run as well");
    }
}

class cow extends animal {
     public void walk(){
        System.out.println("it have 4 legs");
    }
}

public class abstration{
    public static void main(String[] args) {
        cow d1 = new cow();
        d1.walk();
        d1.run();
    }
}