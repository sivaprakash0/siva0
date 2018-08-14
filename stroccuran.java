import java.util.Scanner;
public class stroccuran {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next();
	String s1=in.next();
	int l=s1.length();
	int c=0,cnt=0;
	for(int i=0;i<s.length()-2;i++){
		String a=s.substring(i,i+l);
		if(a.equals(s1)){
			c=i;
			cnt++;
			break;
		}
	}
	if(cnt==0){
		System.out.println("-1");
	}
	else{
		System.out.println(c);
	}
}
}
