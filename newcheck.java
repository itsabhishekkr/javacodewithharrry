public class newcheck{
	public static int[] arrenge_inFixedPattern(int arr[]) {
		int marks[]=new int[arr.length];
		int j=0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				marks[i-j]=arr[i];
				k++;
			}else {
				marks[arr.length-k]=arr[i];
				j++; 
			}
		}
		return(marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println(arrenge_inFixedPattern(arr));

	}

}