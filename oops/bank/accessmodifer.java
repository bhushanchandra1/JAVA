package oops.bank;

class Bank{
    public String name;
    private String password;
    public String getpassword(){
        return this.password;
    }
    public void setpassword(String pass){
        this.password = pass;
    }
}
public class accessmodifer{
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setpassword("abcd");
        System.out.println(b1.getpassword());
        
    }
}