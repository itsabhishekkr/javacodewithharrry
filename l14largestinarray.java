import java.util.*;
public class l14largestinarray {
    public static void largest(int marks[]){
        int larg=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<marks.length;i++){
            if(marks[i]>larg){
                larg=marks[i];
            }
            if(marks[i]<small){
                small=marks[i];
            }
        }
        System.out.println("lagest number=" +larg);
        System.out.println("smallest number"+small);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number where you enter");
        int num=sc.nextInt();
        int marks[]=new int[num];
        for(int i=0;i<num;i++){
            marks[i]=sc.nextInt();
        }
        largest(marks);
    }
}
