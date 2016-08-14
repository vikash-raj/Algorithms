import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class MaxHeap{
	static void swap(int array[],int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	static void maxHeapify(int array[],int i,int n){
		int l=2*i;
		l=l-1;
		int r=(2*i)+1;
		r=r-1;
		int largest=i-1;
		if(l<n&&(array[l]>array[largest]))
			largest=l;
		if(r<n&&(array[r]>array[largest]))
			largest=r;
		if(largest!=i-1){
			swap(array,i-1,largest);
			maxHeapify(array,largest+1,n);
		}	
	}
	public static void main(String arg[])throws Exception{                        
		Scanner in=new Scanner(new File("input.txt"));	
		int n=in.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=in.nextInt();
		System.out.println("Before Max-Heapify:");
		for(int i:array)
			System.out.printf(i+" ");
		
		System.out.println("\nAfter Max-Heapify:");
		//maxHeapify(array,2,n);
		for(int i=0;i<n;i++){
			maxHeapify(array,i+1,n);
		}
		for(int i:array)
			System.out.printf(i+" ");
		
	}
}