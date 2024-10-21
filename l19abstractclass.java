public class l19abstractclass {
    public static void main(String args[]){
        Mustang m=new Mustang();
    } 
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse called");
    }
    void changeColor(){
        System.out.println("black");
    }
    void walk(){
        System.out.println("4 legs");
    }
}
class chickan extends Animal{
    String color;
    void walk(){
        System.out.println("chicken have 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustange called");

    }
}

