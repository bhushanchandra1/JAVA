package oops;

class animal{
    public void bark(){
        System.out.println("Bow Bow");
    }
}
class dog extends animal{
    public void bread(){
        System.out.println("Dobarmen");
    }
}

class cat extends dog{
    public void name(){
        System.out.println("pussy");
    }
}

public class inheritance{
    public static void main(String[] args) {
        animal a1 = new animal();
        a1.bark();
        
        dog d1 = new dog();
        d1.bread();
        d1.bark();

        cat c1 = new cat();
        c1.bread();
        c1.name();
    }
}