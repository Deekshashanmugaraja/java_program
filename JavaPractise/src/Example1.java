import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		System.out.println("enter the number ");
		
		int n = e.nextInt();
		int count = 0;
		for(int i=2;i<=n/2;i++) {
			if(n % i==0) {
				count = 1;
			}
		}
		if(count == 0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
	