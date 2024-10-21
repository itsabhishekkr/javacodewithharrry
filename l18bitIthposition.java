public class l18bitIthposition {
    public static void bitIthpos(int num,int position){
        if(((num)&(1<<position))!=0){
            System.out.println("1");

        }else{
            System.out.println("0");
        }
    }
    public static void main(String args[]){
        int num=20;
        int position=2;
        bitIthpos(num,position);
        
    }
    
}
