import java.util.*;
public class l17assignment {
    //Q1)
    // public static void clowercase(String str){
    //     char vol[]={'a','e','i','o','u'};
    //     int count=0;
    //     for(int i=0;i<str.length();i++){
    //         for(int j=0;j<vol.length;j++){
    //             if(str.charAt(i)==vol[j]){
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println(count);
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     String str=sc.next();
    //     clowercase(str);

    // } 
    //Q4)
    public static void anagrams(String str1,String str2){
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    
                }
            }
        }
        System.out.println("anagram");

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        anagrams(str1,str2);
    }
}
