public class l19getset {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("yellow");
        System.out.println(p1.getColor());
       p1.setTip(10);
       System.out.println(p1.getTip()); 
    }
}
class Pen{
    private String color;
    private int tip;
    String getColor(){
        return(this.color);
    }
    int getTip(){
        return(this.tip);
    }
    void setColor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}
