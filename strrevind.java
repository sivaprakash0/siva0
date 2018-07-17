package player;

import java.util.Scanner;

public class strrevind {
public static void main(String[] args) {
	Scanner rd=new Scanner(System.in);
	String sen=rd.nextLine();
	String spl[]=sen.split(" ");
	for(String rev:spl){
		System.out.println(new StringBuffer(rev).reverse().toString());
	}
}
}
