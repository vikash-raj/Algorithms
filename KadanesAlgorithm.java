import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
Simple idea of the Kadane's algorithm is to look for all positive contiguous 
segments of the array (max_ending_here is used for this). And keep track of maximum 
sum contiguous segment among all positive segments (max_so_far is used for this). 
Each time we get a positive sum compare it with max_so_far and update max_so_far if it is
greater than max_so_far
*/
class KadanesAlgorithm {
	static int maxSumSubArray(int[] a,int n){
		int maxSum=a[0];int currentSum=a[0];
		for(int i=1;i<a.length;i++){
			currentSum=Math.max(a[i],a[i]+currentSum);
			if(maxSum<=currentSum)
				maxSum=currentSum;
		}
		return maxSum;
	}
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T-->0){
			int N=in.nextInt();
			int a[]=new int[N];
			for(int i=0;i<N;i++)
				a[i]=in.nextInt();
			System.out.print(""+maxSumSubArray(a,N));
		}
    }
}
