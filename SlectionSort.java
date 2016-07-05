class SelectionSort{
  static void swap(int[] arr,int i,int j){
	  int temp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
  }
  static void sort(int arr[],int n){
	  for(int i=0;i<n-1;i++){
		  int min_i=i;
		  for(int j=i+1;j<n;j++){
			  if(arr[min_i]>arr[j])
				  min_i=j;
		  }
		  swap(arr,i,min_i);
	  }
  }
  public static void main(String arg[]){
	  int arr[]={2,4,3,5,6,7,9,2,3,4};
	  System.out.print("Before sorting: ");
	  for(int k:arr)
		  System.out.print(k+" ");
	  sort(arr,arr.length);
	  System.out.println();
	  System.out.print("After sorting: ");
	  for(int k:arr)
		  System.out.print(k+" ");
  }	
}