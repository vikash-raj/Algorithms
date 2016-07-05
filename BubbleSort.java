class BubbleSort{
  static void swap(int[] arr,int i,int j){
	  int temp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
  }
  static void sort(int arr[],int n){
	  for(int j=0;j<n;j++){
		  for(int i=0;i<n-1;i++){
			  if(arr[i]>arr[i+1])
				  swap(arr,i,i+1);
		  }
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