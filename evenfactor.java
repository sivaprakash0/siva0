package player;

public class evenfactor {
public static void main(String[] args) {
	int no=Integer.parseInt(args[0]);
	for(int i=2;i<=no;i+=2){
		if(no%i==0){
			System.out.println(i);
		}
	}
}
}
