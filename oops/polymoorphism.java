package oops;

class student1{
    String name ;
    int age;

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(int age , String name){
        System.out.println(name + " its age is " + age);
    }
}

public class polymoorphism{
    public static void main(String[] args) {
        student1 s1 = new student1();
        s1.age = 23;
        s1.name = "Chandra";
        s1.printinfo(s1.age , s1.name);

    }
}