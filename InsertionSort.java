class InsertionSort{
	static void swap(int[] arr,int i,int j){
	  //System.out.println("i="+i+" j="+j);
	  int temp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
     }
	static void sort(int[] arr,int n){
		for(int i=1;i<n;i++){
			int j=i;
			int key=arr[j];
			while(j>0&&key<arr[j-1]){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=key;
		}
	}
	public static void main(String arg[]){
		int arr[]={2,5,4,3,6,7,4,1,1,0,0};
		 System.out.println("Before Sorting:");
		 for(int i:arr)
			 System.out.print(i+" ");
		 InsertionSort.sort(arr,arr.length);
		 System.out.println("\nAfter Sorting:");
		 for(int i:arr)
			 System.out.print(i+" ");
		 
	}
}