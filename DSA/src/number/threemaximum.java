package number;
import java.util.*;
public class threemaximum {
	public static void main(String[] args) {
		System.out.println("enter three number");
		int num1,num2,num3,max,min;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		max = (num1>num2)?(num1>num3?num1:num3):(num1>num2?num1:num2);
		min = (num1<num2)?(num1<num3?num1:num3):(num1<num2?num1:num2);
		System.out.println("max "+max);
		System.out.println("min "+min);
		sc.close();
	}

}
