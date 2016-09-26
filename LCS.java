import java.io.*;
import java.util.*;
class LCS{
	static int lcs(char X[],char Y[],int m,int n){
         int L[][]=new int[m+1][n+1];
         for(int i=0;i<=m;i++){
             for(int j=0;j<=n;j++){
                 if(i==0||j==0)
                     L[i][j]=0;
                 else if(X[i-1]==Y[j-1]||(char)((int)X[i-1]-32)==Y[j-1])
					 L[i][j]=L[i-1][j-1]+1;
				 else
					 L[i][j]=Math.max(L[i-1][j],L[i][j-1]);
             }
         }
		 return L[m][n];
    }
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter S1: ");
		String s1=in.next();
		System.out.println();
		System.out.print("Enter S2: ");
		String s2=in.next();
		
		char[] aa=new char[s1.length()];
        char[] bb=new char[s2.length()];
     
        for(int i=0;i<s1.length();i++)
            aa[i]=s1.charAt(i);
        for(int i=0;i<s2.length();i++)
            bb[i]=s2.charAt(i);
		System.out.println("LCS of '"+s1+"' and '"+s2 +"'is: "+lcs(aa,bb,aa.length,bb.length));
	}
}