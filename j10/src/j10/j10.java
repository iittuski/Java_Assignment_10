package j10;

import java.util.Scanner;

public class j10 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int yournumber = s.nextInt();
		for (int i = 1; i < yournumber; i++) {
			int k=0;
			if (yournumber % i == 0) {
             k=1;
             break;
			}
			else {
				System.out.println(yournumber + "is a PrimeNumber");
			}
		}
	}
}
