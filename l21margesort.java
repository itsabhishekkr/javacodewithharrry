public class l21margesort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void  mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;//(si+ei/2)
        mergeSort(arr,si,mid);//left part
        mergeSort(arr,mid+1,arr.length-1);//right part
        merge(arr,si,mid,ei);//merge left and right part
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//left part initialize
        int j=mid+1;//right part initalise
        int k=0;//initalise temp array
        while(i<=mid && j<=ei ){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part left then
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part left (remanning )
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int arr[]={5,6,2,8,1,0,4};
        mergeSort(arr, 0,arr.length-1);
        printArr(arr);
    }
}
