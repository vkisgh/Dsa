package number;
import java.util.*;
public class Evennumber {
public static void main(String[] args) {
	System.out.println("enter a number");
	int number;
	Scanner sc = new Scanner(System.in);
	number = sc.nextInt();
	if(number % 2==0) {
		System.out.println("its even");
	}
	else {
		System.out.println("its odd");
	}
	sc.close();
}
}
