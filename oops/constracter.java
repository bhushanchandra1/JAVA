package oops;

class student{
    String name ;
    int age;

    //non - perimetrise constracter caling --
    /*
    
    student(){
        System.out.println("Constrocter called");
    }
    
    */

    //Perimatrise constructer calling -->

    // student(String name , int age){
    //     this.name = name;
    //     this.age = age;
    // }

    //Copy construcer calling -->

    student(student s1){
        this.name = s1.name;
        this.age = s1.age;
    }

    student(){

    }

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class constracter{
    public static void main(String[] args) {
        // "perimetrisee constructer " student s1 = new student("Chandra" , 23);
        student s1 = new student();
        s1.age = 24;
        s1.name = "Chandra";
        student s2 = new student(s1);

        s2.info();

    }
}