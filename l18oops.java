public class l18oops {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColour("yellow");
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.colour="green";
        System.out.println(p1.colour);
        BankAccount Ba=new BankAccount();
        Ba.username="abhishek12";
        System.out.println(Ba.username);
        // Ba.password="sajflk"; because password is access by only BankAccount due to private
        Ba.setPassord("abhishek12");//change by this one
    } 
}
class Pen{
    String colour;
    int tip;
    void setColour(String newcolour){
        colour=newcolour;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassord(String pwd){
        password=pwd;
    }
}
