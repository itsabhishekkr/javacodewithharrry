public class leedcoad {
    public boolean check(int[] nums) {
        int k=0;
        int fin[]=new int[nums.length];
        while(k<=nums.length){
            for(int i=0;i<nums.length;i++){
                fin[i]=nums[(i+k)%nums.length];
            }
            if(checksort(fin)){
                return(true);
            }
            k++;
        }
        return(false);
    }
    public boolean checksort(int[] fin){
        int count=0;
        for(int i=0;i<fin.length-1;i++){
            if(fin[i]<fin[i+1]){
                count+=1;
            }
        }
        if(count==fin.length){
            return(true);
        }else{
            return(false);
        }
    }
    public void main(String args[]){
        int fin[]={3,4,5,1,2};
        System.out.println(check(fin));
    }
}