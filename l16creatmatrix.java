import java.util.*;
public class l16creatmatrix {
    public static boolean search(int matrix[][],int key){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("("+i+ ","+j+")");
                    return(true);
                }
            }
        }
        System.out.println("index not found");
        return(false);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //for print
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(search(matrix,5))  ;
    }
    
}