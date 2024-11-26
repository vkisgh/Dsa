package number;
import java.util.*;
public class reversenum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number!");
		int num = sc.nextInt();
		int reverse=0;
		while(num!=0) {
			int digit =num%10;//get last digit;
			reverse = reverse * 10+digit;//append the digit
			num/=10;//remove last digit
			
		}
		System.out.println(reverse);
		sc.close();
	}

}
