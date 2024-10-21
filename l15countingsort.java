import java.util.*;//error
public class l15countingsort {
    public static void main(String args[]){
        int a[]={1,4,1,3,2,4,3,7};
        feq(a);
    }
    public static void feq(int a[]){
        int larg=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            larg=Math.max(larg,a[i]);
        }
        int b[]=new int[larg+1];
        int count=0;
        for(int i=0;i<larg+1;i++){
            for(int j=0;j<a.length;i++){
                if(i==a[i]){
                    count++;
                }
            }
            b[i]=count;
        }
        int sor[]=new int[a.length];
        for(int i=0;i<larg+1;i++){
            if(b[i]>0){
                for(int j=0;j<b[i];j++){
                    sor[j]=i;
                }
            }
        }
        for(int i=0;i<sor.length;i++){
            System.out.print(sor[i]);
        }
    }
    
}
