public class strsubrp {
public static void main(String[] args) {
	for(int i=0;i<=args[0].length()-Integer.parseInt(args[1]);i++){
	    System.out.print(args[0].substring(i,i+Integer.parseInt(args[1]))+" ");
	}
}
}
