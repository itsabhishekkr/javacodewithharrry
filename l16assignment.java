import java.util.*;
public class l16assignment{
    ////Q1)
    // public static void Q1noof7(int matrix[][],int key){
    //     int count=0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==key){
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println(count);
    // }

    // public static void main(String args[]){
    //     int matrix[][]={{4,7,8},{8,8,7}};
    //     int key=7;
    //     Q1noof7(matrix,key);
    // }
    ////Q2)
    // public static void Q2(int matrix[][]){
    //     int sum=0;
    //     int i=1;
    //     for(int j=0;j<matrix[0].length;j++){
    //         sum+=matrix[i][j];
    //     }
    //     System.out.println(sum);
    // }
    // public static void main(String args[]){
    //     int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
    //     Q2(matrix);
    // }
    ////Q3)
    public static void Q3(int matrix[][]){
        int transpose[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("orignal matrix");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("transpose");

        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6}};
        Q3(matrix);
    
     }
    
 }
