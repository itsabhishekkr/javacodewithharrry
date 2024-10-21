public class l19interfacemultiinheritance {
    public static void main(String args[]){
        Bear b=new Bear();
        b.meet();
        b.grass();
        
    }
}
interface carnivore{
    void meet();
}
interface harbivore{
    void grass();
}
class Bear implements carnivore,harbivore{
    public void meet(){
        System.out.println("its eats meet");
    }
    public void grass(){
        System.out.println("its eats grass");
    }
}
