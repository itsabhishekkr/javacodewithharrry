public class l19inheritance {
    public static void main(String args[]){
        Fish sark=new Fish();
        sark.eat();
        Animal an=new Animal();
        an.color="red";
        System.out.println(an.color);
        Wheel w=new Wheel();
        w.eat();
        w.big=50;
        System.out.println(w.big);

    }
    
}
class Animal{
    String color;

    void eat(){
        System.out.println("it eats");
    }
    void breaths(){
        System.out.println("it braeths");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim in water");
    }

}
class Wheel extends Fish{
    int big;
}
