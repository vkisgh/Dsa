package number;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,0,1};
		int n = arr.length;
		int expectedsum = n*(n+1)/2;
		int actualsum =  0;
		for(int num:arr) {
			actualsum+=num;
		}
		int missing = expectedsum -actualsum;
		System.out.println(missing);
		System.out.println(n);
		System.out.println(actualsum);
		System.out.println(expectedsum);

	}

}
