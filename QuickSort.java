class QuickSort{

  static void swap(int[] arr,int i,int j){
	  int temp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
  }
  static int partition(int[] arr,int start,int end){
	  int pivot=arr[end];
	  int pIndex=start;
	  for(int i=start;i<end;i++){
		  if(arr[i]<=pivot){
			 swap(arr,i,pIndex);
             pIndex++;			 
		  }
			  
	  }
	  swap(arr,pIndex,end);
	  return pIndex;
  }
  static void quicksort(int arr[],int start,int end){
	  if(start<end){
		 int pIndex=partition(arr,start,end);
		  quicksort(arr,start,pIndex-1);
		  quicksort(arr,pIndex+1,end); 
	  }	  
  }
  
  public static void main(String arg[]){
	  int arr[]={2,4,3,5,6,7,9,2,3,4};
	  System.out.print("Before sorting: ");
	  for(int k:arr)
		  System.out.print(k+" ");
	  quicksort(arr,0,arr.length-1);
	  System.out.println();
	  System.out.print("After sorting: ");
	  for(int k:arr)
		  System.out.print(k+" ");
  }	
}