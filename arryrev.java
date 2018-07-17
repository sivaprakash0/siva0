package player;

import java.util.Scanner;

public class arryrev {
public static void main(String[] args) {
	Scanner rd=new Scanner(System.in);
	int sz=rd.nextInt();
	int arr[]=new int[sz];
	for(int i=0;i<sz;i++){
		arr[i]=rd.nextInt();
	}
	int fr=arr[0];
	String a="",s;
	for(int j=sz-1;j>0;j--){
		s=Integer.toString(arr[j]);
		a=a+s+"->";
	}System.out.println(a+""+fr);
}
}
