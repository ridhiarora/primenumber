package while_loop;
import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=2,r;
		
		while(i<n) {
			if(n%i==0) {
				System.out.println("Not prime");
				return;
			}i= i+1;
			
		}
		System.out.println("prime");
	}

}
