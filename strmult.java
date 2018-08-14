package set4;

import java.math.BigInteger;
import java.util.Scanner;

public class strmult {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String z=in.next();
	String x=in.next();
	BigInteger a=new BigInteger(z);
	BigInteger b=new BigInteger(x);
	BigInteger c=a.multiply(b);
	System.out.println(c);
}
}
