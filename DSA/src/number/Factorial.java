package number;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		 int number,factorial=1 ,count=0;
		 int avg=1;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number ");
		 number = sc.nextInt();
		 for(int i=1;i<=number;i++) {
			 //factorial method
			 factorial*=i;
			 //average method
			 avg+=i;
			 count++;
			
			 
			 //System.out.println("factorial  "+factorial);
		 }
		 System.out.println("factorial  "+factorial);
		 System.out.println("average "+avg/count);
		
		 sc.close();
	}
}
