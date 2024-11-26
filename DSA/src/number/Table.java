package number;
import java.util.*;
public class Table {
	static int num;
	public static void main(String[] args)
	{
		//int num;
		//
	Scanner sc = new Scanner(System.in);
	System.out.println("write a  table ");
	
	num = sc.nextInt();
	for(int i=1;i<=10;i++) {
	System.out.println("table number "+num+"*"+i+" = "+ num*i);
	sc.close();
	}
 }
}
