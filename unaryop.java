public class unaryop {
    public static void main(String args[]){
        int a=8;
        int b=++a;
        System.out.println(a);//output=9
        System.out.println(b);//output=9
        int c=10;
        int d=c++;//first use then d value is 10
        System.out.println(c);//output=11
        System.out.println(d);//outpout=10
        int e=8;
        int f=--e;
        System.out.println(e);//output=7
        System.out.println(f);//output=7
         int g=8;
        int h=g--;
        System.out.println(g);//output=7
        System.out.println(h);//output=8

    }
}
