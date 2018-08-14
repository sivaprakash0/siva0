package set4;

import java.util.Scanner;

public class strsubrp {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next();
	int p=in.nextInt();
	for(int i=0;i<=s.length()-p;i++){
		System.out.print(s.substring(i,i+p)+" ");
	}
}
}
