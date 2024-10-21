public class l19polymorphismoverriding {
    public static void main(String args[]){
        Deer d=new Deer();
        d.eat();
        Animal a=new Animal();
        a.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eat anythings");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}