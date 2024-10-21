public class l19polymorphismoverloading {
       //methord overloading
    public static void main(String args[]){
        Calcutor c=new Calcutor();
        System.out.println(c.sum(5,10));
        System.out.println(c.sum(2.5f,3.5f ));
        System.out.println(c.sum(2,5,16));

    }   
}
class Calcutor{
    int sum(int a,int b){
        return(a+b);
    }
    float sum(float a,float b){
        return(a+b);
    }
    int sum(int a,int b,int c){
        return(a+b+c);
    }
}
