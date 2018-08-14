package set4;

import java.util.Scanner;

public class arrsum {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int ar[]=new int[sz];
	int ar1[]=new int[sz];
	for(int i=0;i<sz;i++){
		ar[i]=in.nextInt();
	}
	for(int i=0;i<sz;i++){
		ar1[i]=in.nextInt();
	}
	int ar2[]=new int[sz];
	for(int i=0;i<sz;i++){
		ar2[i]=ar[i]+ar1[i];
	}
	for(int i=0;i<sz;i++){
	   System.out.print(ar2[i]+" ");
	}
}
}
