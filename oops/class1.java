package oops;
class pen{
    String colour;
    String type;
    public void print(){
        System.out.println(this.colour);
    }
}
public class class1{
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.colour = "Black";
        p1.print();
    }

}