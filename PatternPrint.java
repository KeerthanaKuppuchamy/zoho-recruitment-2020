import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.next();
		int middle = (str.length()/2);
		char[] charStr = str.toCharArray();
		int ref = middle;
		for(int i = 0;i<str.length();i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print(charStr[ref]);
				ref++;
				if(ref==str.length()) {
					ref = 0;
				}
			}
			ref = middle;
			System.out.println();
		}	
	}
}
