import java.util.*;
public class l16shortestdisplacement{                     //INPUT=NSEW
    public static void displacement(String str){           //OUTPUT=0.0
        int x=0,y=0;                                       //input=WNEENESENNN
        float sortdis;                                      //OUTPUT=5.0
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else{
                y--;
            }
        }
        int dis=(x*x+y*y);
        sortdis=(float)Math.sqrt(dis);
        System.out.println(sortdis);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        displacement(str);
    }
}
