public class l20arraysortedornot {
    public static boolean sorted(int arr[],int i){
        if(arr.length-1==i){
            return(true);
        }
        if(arr[i]>arr[i+1]){
            return(false);
        }
        return sorted(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,0,5,6,8};
        System.out.print(sorted(arr,0));
    }
    
}
